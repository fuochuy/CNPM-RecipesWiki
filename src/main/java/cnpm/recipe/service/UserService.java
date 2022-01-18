package cnpm.recipe.service;

import java.sql.Date;
import java.util.List;

import cnpm.recipe.model.User;
import cnpm.recipe.repository.UserRepository;

public class UserService {
	private UserRepository repository;
	
	public UserService() {
		repository=new UserRepository();
	}
	
	public List<User> getUsers(){
		return repository.getUsers();
	}
	public User checkLogIn(String username, String password) {
		return repository.checkLogIn(username, password);
	}
	
	public boolean insertUser(User account) {
		return repository.insertUser(account) == 1? true:false;
	}
	
	public User getUserById(int id){
		return repository.getUserById(id);
	}
	public boolean updateUser(int id, String fullname, Date DOB, String avatar) {
		return repository.updateUser(id, fullname, DOB, avatar) == 1? true:false;
	}
}
