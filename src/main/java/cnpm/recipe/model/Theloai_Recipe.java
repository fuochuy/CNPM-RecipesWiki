package cnpm.recipe.model;

public class Theloai_Recipe {
	private int idtheloai;
	private int idrecipe;
	public int getIdtheloai() {
		return idtheloai;
	}
	public void setIdtheloai(int idtheloai) {
		this.idtheloai = idtheloai;
	}
	public int getIdrecipe() {
		return idrecipe;
	}
	public void setIdrecipe(int idrecipe) {
		this.idrecipe = idrecipe;
	}
	public Theloai_Recipe(int idtheloai, int idrecipe) {
		super();
		this.idtheloai = idtheloai;
		this.idrecipe = idrecipe;
	}
	public Theloai_Recipe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
