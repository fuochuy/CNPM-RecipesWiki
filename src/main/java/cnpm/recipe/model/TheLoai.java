package cnpm.recipe.model;

public class TheLoai {
	private int id;
	private String tentheloai;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTentheloai() {
		return tentheloai;
	}
	public void setTentheloai(String tentheloai) {
		this.tentheloai = tentheloai;
	}
	public TheLoai(int id, String tentheloai) {
		super();
		this.id = id;
		this.tentheloai = tentheloai;
	}
	public TheLoai() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
