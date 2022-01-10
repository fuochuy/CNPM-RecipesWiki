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
	
	/*Event*/
	public static final String GET_EVENT = "SELECT e.id, e.iduser, e.ten, e.mota, e.tgbatdau, e.tgketthuc,"
			+ " e.soluong, e.hinhanh, e.giaithuong  FROM event e, user u WHERE e.iduser = u.id ";
	
	/*Chude*/
	public static final String GET_ALL_CHUDE = "SELECT cd.id, cd.ten, cd.mota, cd.hinhanh FROM chude ";

	/*Get all step for a recipe*/
	public static final String GET_STEP_FOR_RECIPE = "SELECT st.id, st.buoc, st.idrecipe, st.hinhanh, st.des "
			+ "FROM step "
			+ "WHERE idrecipe = ";
	
	/*Get all recipes in this album of user*/
	public static final String GET_AllRecipes_InAlbum_OfUser = "SELECT r.id, r.iduser, r.ten, r.mota, r.nguyenlieu,r.hinhanh, "
			+ " r.luotthich,r.tgdang, r.tgthuchien "
			+ "FROM recipe r, user u,  album a, album_recipe ar "
			+ "WHERE u.id = "
			+ "AND a.id_user = u.id "
			+ "AND a.id = ar.album_id "
			+ "AND ar.recipe_id = r.id ";
		
	/*Get number of user who enroll an event*/
	public static final String GET_TGEvent_Num = "SELECT COUNT(*)"
			+ "FROM thamgiaevent "
			+ "WHERE idevent = ";
	
	/*Get list of user's recipe who enroll an event*/
	public static final String GET_TGEvent = "SELECT COUNT(*)"
			+ "FROM thamgiaevent "
			+ "WHERE idevent = ";
	
	/*Insert ThamGiaEvent*/
	public static final String INSERT_TGEvent = "INSERT thamgiaevent (iduser, idevent, idrecipe) VALUE(?,?,?)";
	
}




