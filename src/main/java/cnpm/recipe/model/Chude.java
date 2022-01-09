package cnpm.recipe.model;

public class Chude {
	private int id;
	private String ten;
	private String mota;
	private String hinhanh;
	
	public Chude() {}

	public Chude(int id, String ten, String mota, String hinhanh) {
		super();
		this.id = id;
		this.ten = ten;
		this.mota = mota;
		this.hinhanh = hinhanh;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public String getHinhanh() {
		return hinhanh;
	}

	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}
}
