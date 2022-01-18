package cnpm.recipe.service;

import cnpm.recipe.model.User;
import cnpm.recipe.repository.Thamgia_Event_Repository;

public class Thamgia_Event_Service {
	private Thamgia_Event_Repository repository;
	
	public Thamgia_Event_Service() {
		repository= new Thamgia_Event_Repository();
	}
	public boolean thamGiaEvent(int iduser, int idevent, int idrecipe) {
		return repository.insertTGEvent(iduser, idevent, idrecipe)== 1? true:false;
	}
}

