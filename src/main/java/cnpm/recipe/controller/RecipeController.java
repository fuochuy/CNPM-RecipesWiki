package cnpm.recipe.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cnpm.recipe.model.Recipe;
import cnpm.recipe.service.RecipeService;
import cnpm.recipe.url.JspConst;
import cnpm.recipe.url.UrlConst;

@WebServlet(name="recipeController", urlPatterns = {
		UrlConst.MAN_HINH_CUA_1_CT})

public class RecipeController extends HttpServlet{
	private RecipeService service;
	private String acction;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		service= new RecipeService();
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
		case UrlConst.MAN_HINH_CUA_1_CT:
			Recipe recipe = service.getRecipeById("123");
			req.setAttribute("view-a-recipe", recipe);
			req.getRequestDispatcher(JspConst.MAN_HINH_CUA_1_CT).forward(req, resp);
			break;		
		}
	}
}
