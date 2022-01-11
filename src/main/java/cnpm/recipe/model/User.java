package cnpm.recipe.model;

import java.sql.Date;

public class User {
	private int id;
	private int idaccount;
	private String fullname;
	private Date DOB;
	private String avatar;
	
	public User() {
		
	}

	public User(int id, int idaccount, String fullname, Date dOB, String avatar) {
		super();
		this.id = id;
		this.idaccount = idaccount;
		this.fullname = fullname;
		DOB = dOB;
		this.avatar = avatar;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdaccount() {
		return idaccount;
	}

	public void setIdaccount(int idaccount) {
		this.idaccount = idaccount;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String b) {
		this.avatar = b;
	}
	
	
	
}

