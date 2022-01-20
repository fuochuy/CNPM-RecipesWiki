package cnpm.recipe.model;

import java.sql.Date;

public class Comment {
	private int id;
	private int idrecipe;
	private int iduser;
	private String content;
	private Date ngayDang;
	private String fullname;
	private String avatar;
	
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Comment(int id, int idrecipe, int iduser, String content, Date ngayDang, String fullname, String avatar) {
		super();
		this.id = id;
		this.idrecipe = idrecipe;
		this.iduser = iduser;
		this.content = content;
		this.ngayDang = ngayDang;
		this.fullname = fullname;
		this.avatar = avatar;
	}

	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
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
