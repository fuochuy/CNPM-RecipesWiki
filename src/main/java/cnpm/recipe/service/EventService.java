package cnpm.recipe.service;

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
	
	public boolean insertEvent(Event event) {
		return repository.insertEvent(event) == 1? true:false;
	}
	
	public Event getEventById(int id) {
		return repository.getEventById(id);
	}

}
