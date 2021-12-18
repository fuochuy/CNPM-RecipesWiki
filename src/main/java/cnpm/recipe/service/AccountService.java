package cnpm.recipe.service;

import java.util.List;

import cnpm.recipe.model.Account;
import cnpm.recipe.repository.AccountRepository;

public class AccountService {
	private AccountRepository repository;
	
	public AccountService() {
		repository=new AccountRepository();
	}
	
	public List<Account> getAccounts(){
		return repository.getAccounts();
	}
	public Account checkLogIn(String username, String password) {
		return repository.checkLogIn(username, password);
	}
	
	public boolean insertAccount(Account account) {
		return repository.insertAccount(account) == 1? true:false;
	}
}
