package cnpm.recipe.db;

public class DbConst {
	
	
	/*Account*/
	public static final String INSERT_ACCOUNT ="INSERT account (username,password,status) VALUE (?,?,1)";
	public static final String GET_ACCOUNTS ="SELECT a.id,a.username, a.password,a.status FROM account a";
	
}




