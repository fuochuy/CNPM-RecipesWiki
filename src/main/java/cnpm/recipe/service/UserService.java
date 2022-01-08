package cnpm.recipe.service;

import java.util.List;

import cnpm.recipe.model.User;
import cnpm.recipe.repository.UserRepository;

public class UserService {
	private UserRepository repository;
	
	public UserService() {
		repository = new UserRepository();
	}
	
	List<User> getUsers(){
		return repository.getUsers();
	}
	boolean inserUser(User user) {
		return repository.inserUser(user) == 1? true:false;
	}
}
