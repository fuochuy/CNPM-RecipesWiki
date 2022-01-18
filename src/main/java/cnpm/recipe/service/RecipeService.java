package cnpm.recipe.service;

import java.util.List;

import cnpm.recipe.model.Recipe;
import cnpm.recipe.repository.RecipeRepository;

public class RecipeService {
	
	private RecipeRepository repository;
	
	public RecipeService() {
		repository=new RecipeRepository();
	}
	
	public List<Recipe> getRecipes(){
		return repository.getRecipes();
	}
	public boolean insertRecipe(Recipe recipe) {
		return repository.insertRecipe(recipe) == 1? true:false;
	}
	
	public Recipe getRecipeById(String id) {
		return repository.getRecipeById(id);
	}
}
