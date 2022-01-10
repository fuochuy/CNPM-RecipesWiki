package cnpm.recipe.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

<<<<<<< Updated upstream
@WebServlet(name="homeServlet", urlPatterns = "/home")
=======
import cnpm.recipe.url.JspConst;
import cnpm.recipe.url.UrlConst;

@WebServlet(name="homeServlet", urlPatterns =
		UrlConst.BST)
>>>>>>> Stashed changes
public class HomeServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
<<<<<<< Updated upstream
		resp.getWriter().append("home");
=======
		req.getRequestDispatcher(JspConst.BST).forward(req, resp);
>>>>>>> Stashed changes
	}
}
