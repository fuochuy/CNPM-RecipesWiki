package cnpm.recipe.service;

import java.util.List;

import cnpm.recipe.model.Chude;
import cnpm.recipe.repository.ChudeRepository;

public class ChudeService {
private ChudeRepository repository;
	
	public ChudeService() {
		repository=new ChudeRepository();
	}
	
	public List<Chude> getChude(){
		return repository.getChude();
	}
}
