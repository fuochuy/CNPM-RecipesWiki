package cnpm.recipe.service;

import java.util.List;

import cnpm.recipe.model.Recipe;
import cnpm.recipe.repository.Album_Recipes_Repository;

public class Album_RecipesService {
private Album_Recipes_Repository repository;
	
	public Album_RecipesService() {
		repository=new Album_Recipes_Repository();
	}
	
	public List<Recipe> getRecipes(){
		return repository.getRecipes();
	}
}
