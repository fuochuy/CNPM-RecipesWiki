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
	public List<Recipe> getRecipeByIdUser(int id){
		return repository.getRecipeByIdUser(id);
	}
	public boolean insertRecipe(Recipe recipe) {
		return repository.insertRecipe(recipe) == 1? true:false;
	}
	
	public Recipe getRecipeById(int id) {
		return repository.getRecipeById(id);
	}
	
	public boolean deleteRecipeById(int id) {
		return repository.deleteRecipeById(id) == 1? true:false;
	}
}
