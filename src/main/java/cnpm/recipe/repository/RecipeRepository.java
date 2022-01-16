package cnpm.recipe.repository;

import java.sql.Connection;
import java.sql.Date;
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
	
	public int insertRecipe(Recipe recipe) {
		try {
			connection = MySQLConnection.getConnection();
			String query = DbConst.INSERT_RECIPE;

			statement = connection.prepareStatement(query);
			statement.setInt(1, recipe.getId());
			statement.setInt(2, recipe.getIdUser());
			statement.setInt(3, recipe.getIdchude());
			statement.setInt(4, recipe.getIdtheloai());
			statement.setInt(5, recipe.getIdevent());
			statement.setString(6, recipe.getTen());
			statement.setString(7, recipe.getMoTa());
			statement.setString(8, recipe.getNguyenLieu());
			statement.setString(9, recipe.getHinhAnh());
			statement.setDate(10, recipe.getTgDang());
			statement.setInt(11, recipe.getTgThucHien());
			
			return statement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Không thể kết nối đến cơ sở dữ liệu");
			e.printStackTrace();
		} finally {
			try {
				connection.close();
				statement.close();
			} catch (SQLException e) {
				System.out.println("Lỗi đóng kết nối");
				e.printStackTrace();
			}
		}
		return 0;

	}
	
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
