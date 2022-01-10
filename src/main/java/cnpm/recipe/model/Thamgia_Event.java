package cnpm.recipe.model;

public class Thamgia_Event {
	private int iduser;
	private int idevent;
	private int idrecipe;
	public int getIduser() {
		return iduser;
	}
	public void setIduser(int iduser) {
		this.iduser = iduser;
	}
	public int getIdevent() {
		return idevent;
	}
	public void setIdevent(int idevent) {
		this.idevent = idevent;
	}
	public int getIdrecipe() {
		return idrecipe;
	}
	public void setIdrecipe(int idrecipe) {
		this.idrecipe = idrecipe;
	}
	public Thamgia_Event(int iduser, int idevent, int idrecipe) {
		super();
		this.iduser = iduser;
		this.idevent = idevent;
		this.idrecipe = idrecipe;
	}
	public Thamgia_Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
