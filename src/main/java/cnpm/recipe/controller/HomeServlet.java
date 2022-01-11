package cnpm.recipe.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import cnpm.recipe.url.JspConst;
import cnpm.recipe.url.UrlConst;

@WebServlet(name="homeServlet", urlPatterns =
		UrlConst.TRANG_CHU)

public class HomeServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher(JspConst.TRANG_CHU).forward(req, resp);

		

	}
}
