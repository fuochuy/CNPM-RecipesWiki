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

import cnpm.recipe.model.Chude;
import cnpm.recipe.model.Comment;
import cnpm.recipe.model.Recipe;
import cnpm.recipe.model.Step;
import cnpm.recipe.model.TheLoai;
import cnpm.recipe.service.ChudeService;
import cnpm.recipe.service.CommentService;
import cnpm.recipe.service.RecipeService;
import cnpm.recipe.service.StepService;
import cnpm.recipe.service.Thamgia_Event_Service;
import cnpm.recipe.service.TheLoaiService;
import cnpm.recipe.url.JspConst;
import cnpm.recipe.url.UrlConst;

@MultipartConfig
@WebServlet(name="recipeController", urlPatterns = {
		UrlConst.MAN_HINH_CUA_1_CT,UrlConst.CREATE_A_RECIPE,UrlConst.MYRECIPE,UrlConst.DELETE_RECIPE,UrlConst.YEUTHICH
		})

public class RecipeController extends HttpServlet{
	private RecipeService service;
	private StepService serviceBuoc;
	
	private ChudeService chuDeService;
	private Thamgia_Event_Service thamGiaEventService;
	private TheLoaiService theLoaiService;
	private StepService stepService;
	private CommentService commentService;
	private int idEvent;
	private String acction;
	private int idRecipe;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		service= new RecipeService();
		serviceBuoc = new StepService();
		chuDeService = new ChudeService();
		thamGiaEventService = new Thamgia_Event_Service();
		theLoaiService = new TheLoaiService();
		stepService = new StepService();
		commentService = new CommentService();
		acction="";
		idEvent=0;
		idRecipe=11;
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
			
			
			if(req.getParameter("id")!=null) {
				int id= Integer.parseInt(req.getParameter("id"));
				Recipe recipe = service.getRecipeById(id);
				List<Step> listStep = stepService.getgetListStepByIdRecipeStep(id);
				List<Comment> listComment = commentService.getListCommentByIdRecipe(id);
				req.setAttribute("listComment", listComment);
				req.setAttribute("listStep", listStep);
				req.setAttribute("recipe", recipe);
				req.getRequestDispatcher(JspConst.MAN_HINH_CUA_1_CT).forward(req, resp);
			}
			
			break;		
			
		case UrlConst.YEUTHICH:			
		
			if(req.getParameter("id")!=null) {
				int id= Integer.parseInt(req.getParameter("id"));
				service.updateLuotThich(id);
				Recipe recipe = service.getRecipeById(id);
				List<Step> listStep = stepService.getgetListStepByIdRecipeStep(id);
				List<Comment> listComment = commentService.getListCommentByIdRecipe(id);
				req.setAttribute("listComment", listComment);
				req.setAttribute("listStep", listStep);
				req.setAttribute("recipe", recipe);
				req.getRequestDispatcher(JspConst.MAN_HINH_CUA_1_CT).forward(req, resp);
			}
			break;		
		case UrlConst.CREATE_A_RECIPE:
			if(req.getParameter("thamgiaEvent")!=null) {
				idEvent = Integer.parseInt(req.getParameter("thamgiaEvent"));
				
			}
			
			List<Chude> listChuDe = chuDeService.getChude();
			List<TheLoai> listTheLoai = theLoaiService.getAllTheLoai();
			req.setAttribute("listTheLoai", listTheLoai);
			req.setAttribute("listChuDe", listChuDe);
			req.getRequestDispatcher(JspConst.CREATE_RECIPE).forward(req, resp);
			break;
		case UrlConst.MYRECIPE:
			
			int iduser = (int) req.getSession().getAttribute("iduser");
			List<Recipe> listRecipe =  service.getRecipeByIdUser(iduser);
			req.setAttribute("listRecipe", listRecipe);
			req.getRequestDispatcher(JspConst.MYRECIPE).forward(req, resp);
			break;
		case UrlConst.DELETE_RECIPE:
			
			int idrecipt_delete = (int) req.getSession().getAttribute("id");
			if(service.deleteRecipeById(idrecipt_delete)) {
				req.getRequestDispatcher(JspConst.MYRECIPE).forward(req, resp);
			}
			
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
				step.setId_recipe(idRecipe);
				step.setDes(buoc);
				step.setHinhanh(hinhanh1);
				cacBuoc.add(step);
				i++;
				
			}
			
			if(tenmon!=null) {
				Recipe recipe = new Recipe();
				recipe.setId(idRecipe);
				int iduser = (int) req.getSession().getAttribute("iduser");
				recipe.setIdUser(iduser);
				recipe.setIdchude(chude);
				recipe.setIdtheloai(theloai);
				recipe.setTen(tenmon);
				recipe.setMoTa(mota);
				recipe.setNguyenLieu(nguyenlieu);
				recipe.setTgThucHien(thoigian);
				recipe.setHinhAnh(hinhanh);
				long millis=System.currentTimeMillis(); 
				Date now = new Date(millis);
				recipe.setTgDang(now);
				
				
				service.insertRecipe(recipe);
	
				if(idEvent!=0) {
					thamGiaEventService.thamGiaEvent(iduser, idEvent, idRecipe);
				}
			
				
				
				
				for(Step b:cacBuoc) {
					serviceBuoc.insertStep(b);
				}
				idRecipe++;
			}
						
			
		} catch (Exception e) {
			// TODO: handle exception
			
		}
	}
}
