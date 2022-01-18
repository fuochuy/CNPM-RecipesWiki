package cnpm.recipe.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cnpm.recipe.model.Chude;
import cnpm.recipe.service.ChudeService;
import cnpm.recipe.url.JspConst;
import cnpm.recipe.url.UrlConst;

@MultipartConfig
@WebServlet(name="chuDeController", urlPatterns = {
		UrlConst.CHUDE})
public class ChuDeController extends HttpServlet{
	
	private ChudeService service;
	private String acction;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		service= new ChudeService();
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
		case UrlConst.CHUDE:
			
			List<Chude> topics = service.getChude();
			req.setAttribute("topics", topics);
			req.getRequestDispatcher(JspConst.CHUDE).forward(req, resp);
			break;
		
		}
	
	}
}
