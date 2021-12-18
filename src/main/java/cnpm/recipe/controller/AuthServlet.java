package cnpm.recipe.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cnpm.recipe.model.Account;
import cnpm.recipe.service.AccountService;
import cnpm.recipe.url.JspConst;
import cnpm.recipe.url.SessionUtil;
import cnpm.recipe.url.UrlConst;

@WebServlet(name = "auth", urlPatterns = {
		UrlConst.SIGN_IN,
		UrlConst.SIGN_UP,
		UrlConst.SIGN_OUT
})
public class AuthServlet extends HttpServlet {

	private static final long serialVersionUID = -9065973247091639836L;
	private AccountService service;
	private String action;
	
	@Override
	public void init() throws ServletException {
		super.init();
		service = new AccountService();
		action ="";
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		action=req.getServletPath();
		super.service(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		switch(action) {
		case UrlConst.SIGN_IN:
			req.getRequestDispatcher(JspConst.SIGN_IN)
			.forward(req,resp);
		case UrlConst.HOME:
			break;
		case UrlConst.SIGN_UP:
			req.getRequestDispatcher(JspConst.SIGN_UP)
			.forward(req,resp);
			break;
		default:
			break;
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username = req.getParameter("username");
		String password1 = req.getParameter("password1");
		if(username != null && password1 != null) {
			Account account = new Account();
			account.setUsername(username);
			account.setPassword(password1);
			if(service.insertAccount(account)) {
				resp.sendRedirect(req.getContextPath() + UrlConst.SIGN_IN);
			}
			else {
				resp.sendRedirect(req.getContextPath() + UrlConst.SIGN_UP);
			}
		}
		String password = req.getParameter("password");
		if(username!=null && password!=null) {
			Account login = service.checkLogIn(username, password);
			if(login!=null) {
				resp.sendRedirect(req.getContextPath() + UrlConst.HOME);
			}
			else {
				resp.sendRedirect(req.getContextPath() + UrlConst.SIGN_IN);
			}
			
			
		}
	}
}
