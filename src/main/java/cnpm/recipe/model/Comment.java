package cnpm.recipe.model;

public class Comment {
	private int id;
	private int idrecipe;
	public Comment(int id, int idrecipe) {
		super();
		this.id = id;
		this.idrecipe = idrecipe;
	}
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdrecipe() {
		return idrecipe;
	}
	public void setIdrecipe(int idrecipe) {
		this.idrecipe = idrecipe;
	}
	
	
}
