package cnpm.recipe.service;

import java.sql.Date;
import java.util.List;

import cnpm.recipe.model.Event;
import cnpm.recipe.model.User;
import cnpm.recipe.repository.EventRepository;

public class EventService {
	private EventRepository repository;
	
	public EventService()
	{
		repository = new EventRepository();
	}
	
	public List<Event> getEvent(){
		return repository.getEvent();
	}
	public List<Event> getEventByIdUser(int id){
		return repository.getEventByIDUser(id);
	}
	
	public boolean insertEvent(Event event) {
		return repository.insertEvent(event) == 1? true:false;
	}
	
	public Event getEventById(int id) {
		return repository.getEventById(id);
	}
	
	public boolean deleteTGEvent(int id) {
		return repository.deleteTGEvent(id) == 1? true:false;
	}
	public boolean deleteEvent(int id) {
		return repository.deleteEvent(id) == 1? true:false;
	}
}
