package cnpm.recipe.service;

import java.util.List;

import cnpm.recipe.model.Event;
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

}
