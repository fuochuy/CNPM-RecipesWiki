package cnpm.recipe.model;

public class Step {

	private int id;
	private int buoc;
	private int id_recipe;
	private String hinhanh;
	private String des;
	
	public Step(int id, int buoc, int id_recipe, String hinhanh, String des) {
		super();
		this.id = id;
		this.buoc = buoc;
		this.id_recipe = id_recipe;
		this.hinhanh = hinhanh;
		this.des = des;
	}
	
	public Step() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBuoc() {
		return buoc;
	}

	public void setBuoc(int buoc) {
		this.buoc = buoc;
	}

	public int getId_recipe() {
		return id_recipe;
	}

	public void setId_recipe(int id_recipe) {
		this.id_recipe = id_recipe;
	}

	public String getHinhanh() {
		return hinhanh;
	}

	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}
	
	
}
