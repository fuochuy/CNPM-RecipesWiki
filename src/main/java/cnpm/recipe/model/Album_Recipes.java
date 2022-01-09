package cnpm.recipe.model;

public class Album_Recipes {

	private int id_album;
	private int id_recipe;
	
	public Album_Recipes() {}
	
	public Album_Recipes(int id_album, int id_recipe) {
		super();
		this.id_album = id_album;
		this.id_recipe = id_recipe;
	}
	public int getId_album() {
		return id_album;
	}
	public void setId_album(int id_album) {
		this.id_album = id_album;
	}
	public int getId_recipe() {
		return id_recipe;
	}
	public void setId_recipe(int id_recipe) {
		this.id_recipe = id_recipe;
	}
	
	
}
