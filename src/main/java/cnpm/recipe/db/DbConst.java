package cnpm.recipe.db;

public class DbConst {
	
	
	/*Account*/
	public static final String INSERT_ACCOUNT ="INSERT account (username,password,status) VALUE (?,?,1)";
	public static final String GET_ACCOUNTS ="SELECT a.id,a.username, a.password,a.status FROM account a";
	/*User*/
	public static final String GET_USERS = "SELECT u.id, u.idaccount, u.fullname, u.DOB, u.avatar FROM user u, account a WHERE a.id = u.idaccount";
	public static final String INSERT_USER = "INSERT user(u.idaccount, u.fullname, u.DOB, u.avatar) VALUE (?,?,?,?)";
	
	/*Recipe*/
	public static final String GET_RECIPES = "SELECT r.id, r.iduser, r.ten, r.mota, r.nguyenlieu,r.hinhanh,"
			+ " r.luotthich,r.tgdang, r.tgthuchien FROM recipe r, user u WHERE r.iduser=u.id ";
	
	
}




