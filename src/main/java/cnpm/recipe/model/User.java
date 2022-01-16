package cnpm.recipe.model;

import java.sql.Date;

public class User {
	private int id;
	private String username;
	private String password;
	private int status;
	private String fullname;
	private Date DOB;
	private String avatar;
	public User() {
		
	}

	

	public User(int id, String username, String password, int status, String fullname, Date dOB, String avatar) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.status = status;
		this.fullname = fullname;
		DOB = dOB;
		this.avatar = avatar;
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



	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	};
	
}
