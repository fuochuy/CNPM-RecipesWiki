package cnpm.recipe.model;

import java.sql.Date;

public class ChiTiet_Comment {
	private int idcomment;
	private int iduser;
	private String content;
	private Date ngayDang;
	public ChiTiet_Comment(int idcomment, int iduser, String content, Date ngayDang) {
		super();
		this.idcomment = idcomment;
		this.iduser = iduser;
		this.content = content;
		this.ngayDang = ngayDang;
	}
	public ChiTiet_Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdcomment() {
		return idcomment;
	}
	public void setIdcomment(int idcomment) {
		this.idcomment = idcomment;
	}
	public int getIduser() {
		return iduser;
	}
	public void setIduser(int iduser) {
		this.iduser = iduser;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getNgayDang() {
		return ngayDang;
	}
	public void setNgayDang(Date ngayDang) {
		this.ngayDang = ngayDang;
	}
	
}
