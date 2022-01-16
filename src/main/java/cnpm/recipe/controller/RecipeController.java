package cnpm.recipe.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import cnpm.recipe.model.Recipe;
import cnpm.recipe.model.Step;
import cnpm.recipe.service.RecipeService;
import cnpm.recipe.service.StepService;
import cnpm.recipe.url.JspConst;
import cnpm.recipe.url.UrlConst;

@MultipartConfig
@WebServlet(name="recipeController", urlPatterns = {
		UrlConst.MAN_HINH_CUA_1_CT,UrlConst.CREATE_A_RECIPE
		})

public class RecipeController extends HttpServlet{
	private RecipeService service;
	private StepService serviceBuoc;
	private String acction;
	private int idBuoc;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		service= new RecipeService();
		serviceBuoc = new StepService();
		acction="";
		idBuoc=1;
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
		case UrlConst.CREATE_A_RECIPE:
			req.getRequestDispatcher(JspConst.CREATE_RECIPE).forward(req, resp);
			break;
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			Part part = req.getPart("hinhanhmh");
			String realPath = req.getServletContext().getRealPath("/recipe");
			String fileName = Path.of(part.getSubmittedFileName()).getFileName().toString();
			if(!Files.exists(Path.of(realPath))) {
				Files.createDirectory(Path.of(realPath));
			}
			
			part.write(realPath+"/"+fileName);
			String hinhanh = "recipe/"+fileName;

			String tenmon = req.getParameter("tenmon");
			int chude = Integer.parseInt(req.getParameter("chude"));
			int theloai = Integer.parseInt(req.getParameter("theloai"));
			int event = Integer.parseInt(req.getParameter("event"));
			String mota = req.getParameter("mota");
			String nguyenlieu = req.getParameter("nguyenlieu");
			int thoigian =Integer.parseInt( req.getParameter("thoigian"));
			List<Step> cacBuoc = new ArrayList<>();
			
			int i=1;
			
			while(req.getParameter("buoc"+i)!=null) {
				String buoc = req.getParameter("buoc"+i);
				Part part1 = req.getPart("hinhanh"+i);
				String realPath1 = req.getServletContext().getRealPath("/recipe");
				String fileName1 = Path.of(part.getSubmittedFileName()).getFileName().toString();
				if(!Files.exists(Path.of(realPath))) {
					Files.createDirectory(Path.of(realPath));
				}
				
				part1.write(realPath1+"/"+fileName1);
				String hinhanh1 = "recipe/"+fileName1;
				
				Step step = new Step();
				step.setBuoc(i);
				step.setId_recipe(idBuoc);
				step.setDes(buoc);
				step.setHinhanh(hinhanh1);
				cacBuoc.add(step);
				i++;
				
			}
			
			if(tenmon!=null) {
				Recipe recipe = new Recipe();
				recipe.setId(idBuoc);
				recipe.setIdUser(1);
				recipe.setIdchude(chude);
				recipe.setIdtheloai(theloai);
				recipe.setIdevent(event);
				recipe.setTen(tenmon);
				recipe.setMoTa(mota);
				recipe.setNguyenLieu(nguyenlieu);
				recipe.setTgThucHien(thoigian);
				recipe.setHinhAnh(hinhanh);
				long millis=System.currentTimeMillis(); 
				Date now = new Date(millis);
				recipe.setTgDang(now);
				service.insertRecipe(recipe);
				for(Step b:cacBuoc) {
					serviceBuoc.insertStep(b);
				}
				idBuoc++;
			}
						
			
		} catch (Exception e) {
			// TODO: handle exception
			
		}
	}
}
