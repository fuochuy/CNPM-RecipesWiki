package cnpm.recipe.service;

import java.util.List;

import cnpm.recipe.model.Step;
import cnpm.recipe.model.User;
import cnpm.recipe.repository.StepRepository;

public class StepService {
private StepRepository repository;
	
	public StepService() {
		repository=new StepRepository();
	}
	
	public List<Step> getStep(){
		return repository.getStep();
	}
	public boolean insertStep(Step step) {
		return repository.insertStep(step) == 1? true:false;
	}
	
	public List<Step> getgetListStepByIdRecipeStep(int id){
		return repository.getListStepByIdRecipe(id);
	}
	
	public boolean deleteStepByIdRecipe(int id) {
		return repository.deleteStepByIdRecipe(id) == 1? true:false;
	}
	
	
	
}
