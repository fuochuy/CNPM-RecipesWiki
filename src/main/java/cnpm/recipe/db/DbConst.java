package cnpm.recipe.db;

public class DbConst {
	
	
	/*Account*/
	public static final String INSERT_USER ="INSERT user (email,password,status) VALUE (?,?,1)";
	public static final String GET_USERS ="SELECT u.id,u.email, u.password,u.status, u.fullname, u.DOB, u.avatar FROM user u";
	public static final String GET_USER_BYID ="SELECT u.id,u.email, u.password,u.status, u.fullname, u.DOB, u.avatar FROM user u WHERE u.id=?";
	/*User*/
	//public static final String GET_USERS = "SELECT u.id, u.idaccount, u.fullname, u.DOB, u.avatar FROM user u, account a WHERE a.id = u.idaccount and u.idaccount = ?";
	//public static final String INSERT_USER = "INSERT user(idaccount, fullname, DOB, avatar) VALUE (?,?,?,?)";
	public static final String UPDATE_USER = "UPDATE user SET fullname = ?, DOB = ?, avatar = ? WHERE id = ?";
	
	/*Recipe*/
	public static final String GET_RECIPES = "SELECT r.id, r.iduser, r.ten, r.mota, r.nguyenlieu,r.hinhanh,"
			+ " r.luotthich,r.tgdang, r.tgthuchien,u.avatar, u.fullname FROM recipe r,user u WHERE r.iduser=u.id";
	public static final String DELETE_RECIPES = "DELETE FROM recipe WHERE id=?";
	/*Event*/
	public static final String GET_EVENT = "SELECT e.id, e.iduser,e.tenuser, e.ten, e.mota, e.tgbatdau, e.tgketthuc,"
			+ " e.soluong, e.hinhanh,e.hinhquangcao, e.giaithuong  FROM event e, user u WHERE e.iduser = u.id ";
	
	/*Chude*/
	public static final String GET_ALL_CHUDE = "SELECT cd.id, cd.ten, cd.mota, cd.hinhanh FROM chude cd";

	/*Get all step for a recipe*/
	public static final String GET_STEP_FOR_RECIPE = "SELECT st.id, st.buoc, st.idrecipe, st.hinhanh, st.des "
			+ "FROM step st "
			+ "WHERE st.idrecipe = ?";
	
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
	public static final String INSERT_TGEvent = "CALL SP_ThamgiaEvent(?,?,?)";
	//INSERT thamgiaevent (iduser, idevent, idrecipe) VALUE(?,?,?)
	/*THEM 1 EVENT*/
	public static final String INSERT_EVENT = "INSERT event(iduser,tenuser, ten, mota, tgbatdau, tgketthuc, soluong, hinhanh,hinhquangcao, giaithuong) VALUE (?,?,?,?,?,?,?,?,?,?)";
	
	public static final String INSERT_RECIPE = "INSERT recipe(id,iduser,idchude,idtheloai,ten,mota,nguyenlieu,hinhanh,tgdang,tgthuchien) VALUE (?,?,?,?,?,?,?,?,?,?)";
	public static final String INSERT_BUOC = "INSERT step(buoc,idrecipe,des,hinhanh) VALUE (?,?,?,?)";
	/*LAY 1 CT VOI ID*/
	public static final String GET_RECIPE = "SELECT r.id, r.iduser, r.ten, r.mota, r.nguyenlieu,r.hinhanh,"
			+ " r.luotthich,r.tgdang, r.tgthuchien, u.avatar, u.fullname FROM recipe r, user u WHERE r.iduser=u.id AND r.id=?";
	
	public static final String GET_RECIPE_BY_IDUSER = "SELECT r.id, r.iduser, r.ten, r.mota, r.nguyenlieu,r.hinhanh,"
			+ " r.luotthich,r.tgdang, r.tgthuchien, u.avatar, u.fullname FROM recipe r,user u WHERE r.iduser=u.id AND r.iduser=?";
	
	/*lay 1 Event*/
	public static final String GET_EVENT_BY_ID = "SELECT e.id, e.iduser, e.tenuser, e.ten, e.mota, e.tgbatdau, e.tgketthuc,"
			+ " e.soluong, e.hinhanh,e.hinhquangcao, e.giaithuong  FROM event e WHERE e.id = ?";
	
	/*lay 1 Event*/
	public static final String GET_ALL_THELOAI = "SELECT tl.id, tl.tentheloai from theloai tl";
	
	public static final String UPDATE_LUOTTHICH ="CALL SP_Tangluotthich(?)";
	
	public static final String SAVE_TO_ALBUM ="insert into album_recipe value(?,?)";

	public static final String GET_COMMENT_BYID_RECIPE ="SELECT c.id, c.idrecipe, u.fullname, u.avatar,c.content, c.ngaydang FROM comment c, user u WHERE c.iduser=u.id AND c.idrecipe=?";
		

	
	public static final String GET_BST_RECIPES =
			"SELECT r.id, r.iduser, r.ten, r.mota, r.nguyenlieu,r.hinhanh,"
					+ " r.luotthich,r.tgdang, r.tgthuchien, u.avatar, u.fullname FROM recipe r,user u,  album_recipe ar WHERE ar.id_user=u.id AND r.id = ar.recipe_id AND ar.id_user=?";

	public static final String INSERT_COMMENT ="INSERT comment(idrecipe,iduser,content,ngaydang) value(?,?,?,?)";
	
	public static final String GET_RECIPE_SEARCH = "SELECT r.id, r.iduser, r.ten, r.mota, r.nguyenlieu,r.hinhanh,"
			+ " r.luotthich,r.tgdang, r.tgthuchien,u.avatar, u.fullname FROM recipe r,user u WHERE r.iduser=u.id AND r.ten like CONCAT('%',?, '%')";
	public static final String GET_RECIPE_BY_TOPIC ="SELECT r.id, r.iduser, r.ten, r.mota, r.nguyenlieu,r.hinhanh, r.luotthich,r.tgdang, r.tgthuchien,u.avatar, u.fullname FROM recipe r,user u WHERE r.iduser=u.id AND r.idchude = ?";

	public static final String GET_RECIPE_BY_TOPIC_THELOAI ="SELECT r.id, r.iduser, r.ten, r.mota, r.nguyenlieu,r.hinhanh, r.luotthich,r.tgdang, r.tgthuchien,u.avatar, u.fullname FROM recipe r,user u WHERE r.iduser=u.id AND r.idchude = ? AND r.idtheloai=?";

	public static final String GET_THELOAI_BY_TOPIC ="select tl.id, tl.tentheloai from chude_theloai cdtl, chude cd, theloai tl where cd.id=? and cdtl.idchude=cd.id and cdtl.idtheloai=tl.id";
	public static final String GET_CHUDE_BYID="SELECT cd.id, cd.ten FROM chude cd WHERE cd.id=?";
	
}


