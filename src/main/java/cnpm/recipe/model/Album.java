package cnpm.recipe.model;

public class Album {
	private int id;
	private int iduser;
	public Album(int id, int iduser) {
		super();
		this.id = id;
		this.iduser = iduser;
	}
	public Album() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIduser() {
		return iduser;
	}
	public void setIduser(int iduser) {
		this.iduser = iduser;
	}
	
	
}
