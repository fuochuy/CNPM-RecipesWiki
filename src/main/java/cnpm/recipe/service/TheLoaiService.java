package cnpm.recipe.service;

import java.util.List;

import cnpm.recipe.model.TheLoai;
import cnpm.recipe.repository.TheLoai_Repository;

public class TheLoaiService {
private TheLoai_Repository repository;
	
	public TheLoaiService() {
		repository=new TheLoai_Repository();
	}
	
	public List<TheLoai> getAllTheLoai(){
		return repository.getAllTheLoai();
	}
}
