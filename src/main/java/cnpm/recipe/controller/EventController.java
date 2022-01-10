package cnpm.recipe.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cnpm.recipe.service.EventService;
import cnpm.recipe.url.JspConst;
import cnpm.recipe.url.UrlConst;

@WebServlet(name="eventController", urlPatterns = {
		UrlConst.CREATE_A_EVENT,UrlConst.VIEW_A_EVENT})
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
			req.getRequestDispatcher(JspConst.VIEW_A_EVENT).forward(req, resp);
			break;
		}
	}
}
