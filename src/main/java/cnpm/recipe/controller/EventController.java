package cnpm.recipe.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import cnpm.recipe.model.Event;
import cnpm.recipe.model.User;
import cnpm.recipe.service.EventService;
import cnpm.recipe.url.JspConst;
import cnpm.recipe.url.UrlConst;

@WebServlet(name="eventController", urlPatterns = {
		UrlConst.CREATE_A_EVENT,UrlConst.VIEW_A_EVENT, UrlConst.VIEW_ALL_EVENT})
public class EventController extends HttpServlet{
	
	private EventService service;
	private String acction;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		service= new EventService();
		acction="";
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		acction=req.getServletPath();
		super.service(req, resp);
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		switch(acction) {
		case UrlConst.CREATE_A_EVENT:
			req.getRequestDispatcher(JspConst.CREATE_A_EVENT).forward(req, resp);
			break;
		case UrlConst.VIEW_A_EVENT:			
			Event event = service.getEventById("123");
			req.setAttribute("view-a-event", event);
			break;	
		case UrlConst.VIEW_ALL_EVENT:
			List<Event> list_events = service.getEvent();
			req.setAttribute("xem-tatca-event", list_events);
			req.getRequestDispatcher(JspConst.VIEW_ALL_EVENT).forward(req, resp);			
			break;
		}
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			Part part = req.getPart("hinhanh");
			String realPath = req.getServletContext().getRealPath("/Event");
			String fileName = Path.of(part.getSubmittedFileName()).getFileName().toString();
			if(!Files.exists(Path.of(realPath))) {
				Files.createDirectory(Path.of(realPath));
			}
			
			part.write(realPath+"/"+fileName);
			String anhminhhoa = "Event/"+fileName;
			
			String tensukien = req.getParameter("tensukien");
			String ngaybd = req.getParameter("ngaybd");
			String ngaykt = req.getParameter("ngaykt");
			String giaithuong = req.getParameter("giaithuong");
			String mota = req.getParameter("mota");
			
			if(tensukien !=null && ngaybd!=null && ngaykt!=null &&
					tensukien!="" && ngaybd!="" && ngaykt !="" ) {
				Event event = new Event();
				
				int AccountId = (int) req.getSession().getAttribute("AccountId");
								
				event.setId_user(1);
				event.setTen(tensukien);
				event.setTen(mota);
				event.setTgbatdau(Date.valueOf(ngaybd));
				event.setTgketthuc(Date.valueOf(ngaykt));			
				event.setSoluong(0);
				event.setGiaithuong(giaithuong);
				event.setHinhanh(anhminhhoa);
									
				if (service.insertEvent(event));
					resp.sendRedirect(req.getContextPath() + UrlConst.VIEW_A_EVENT);			
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			
		}

		
	}
	
	
}