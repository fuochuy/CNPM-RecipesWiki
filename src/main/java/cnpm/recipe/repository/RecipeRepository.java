package cnpm.recipe.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import cnpm.recipe.db.DbConst;
import cnpm.recipe.db.MySQLConnection;
import cnpm.recipe.model.Recipe;

public class RecipeRepository {
	private Connection connection = null;
	private PreparedStatement statement = null;
	private ResultSet rs = null;
	
	public List<Recipe> getRecipes() {
		List<Recipe> recipes = new LinkedList<Recipe>();
		try {
			connection = MySQLConnection.getConnection();
			String query = DbConst.GET_RECIPES;
			statement = connection.prepareStatement(query);
			rs = statement.executeQuery();
	
			while (rs.next()) {
				Recipe recipe = new Recipe();
				recipe.setId(rs.getInt("r.id"));
				recipe.setIdUser(rs.getInt("r.iduser"));
				recipe.setTen(rs.getString("r.ten"));
				recipe.setMoTa(rs.getString("r.mota"));
				recipe.setHinhAnh(rs.getString("r.hinhanh"));
				recipe.setNguyenLieu(rs.getString("r.nguyenlieu"));
				recipe.setLuotThich(rs.getInt("r.luotthich"));
				recipe.setTgDang(rs.getDate("r.tgdang"));
				recipe.setTgThucHien(rs.getInt("r.tgthuchien"));
				
				recipes.add(recipe);
			}
		} catch (SQLException e) {
			System.out.println("Không thể kết nối đến cơ sở dữ liệu");
			e.printStackTrace();
		} finally {
			try {
				connection.close();
				statement.close();
				rs.close();
			} catch (SQLException e) {
				System.out.println("Lỗi đóng kết nối");
				e.printStackTrace();
			}
		}
		return recipes;
	}
}
