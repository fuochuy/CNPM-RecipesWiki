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
	
	public int insertRecipe(Recipe recipe) {
		try {
			connection = MySQLConnection.getConnection();
			String query = DbConst.INSERT_RECIPE;

			statement = connection.prepareStatement(query);
			statement.setInt(1, recipe.getId());
			statement.setInt(2, recipe.getIdUser());
			statement.setInt(3, recipe.getIdchude());
			statement.setInt(4, recipe.getIdtheloai());
			statement.setNString(5, recipe.getTen());
			statement.setNString(6, recipe.getMoTa());
			statement.setNString(7, recipe.getNguyenLieu());
			statement.setString(8, recipe.getHinhAnh());
			statement.setDate(9, recipe.getTgDang());
			statement.setInt(10, recipe.getTgThucHien());
			
			
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
				recipe.setTen(rs.getNString("r.ten"));
				recipe.setMoTa(rs.getNString("r.mota"));
				recipe.setHinhAnh(rs.getString("r.hinhanh"));
				recipe.setNguyenLieu(rs.getNString("r.nguyenlieu"));
				recipe.setLuotThich(rs.getInt("r.luotthich"));
				recipe.setTgDang(rs.getDate("r.tgdang"));
				recipe.setTgThucHien(rs.getInt("r.tgthuchien"));
				recipe.setAvatarUser(rs.getString("u.avatar"));
				recipe.setNameUser(rs.getNString("u.fullname"));
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
	
	public Recipe getRecipeById(int id) {
		Recipe recipe = new Recipe();
		try {
			connection = MySQLConnection.getConnection();
			String query = DbConst.GET_RECIPE;
			statement = connection.prepareStatement(query);			
			statement.setInt(1, id);
			rs = statement.executeQuery();
	
			while (rs.next()) {
				
				recipe.setId(rs.getInt("r.id"));
				recipe.setIdUser(rs.getInt("r.iduser"));
				recipe.setTen(rs.getNString("r.ten"));
				recipe.setMoTa(rs.getNString("r.mota"));
				recipe.setHinhAnh(rs.getString("r.hinhanh"));
				recipe.setNguyenLieu(rs.getNString("r.nguyenlieu"));
				recipe.setLuotThich(rs.getInt("r.luotthich"));
				recipe.setTgDang(rs.getDate("r.tgdang"));
				recipe.setTgThucHien(rs.getInt("r.tgthuchien"));
				recipe.setAvatarUser(rs.getString("u.avatar"));
				recipe.setNameUser(rs.getNString("u.fullname"));
				
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
		return recipe;
	}
	
	public List<Recipe> getRecipeByIdUser(int id) {
		List<Recipe> recipes = new LinkedList<Recipe>();
		try {
			connection = MySQLConnection.getConnection();
			String query = DbConst.GET_RECIPE_BY_IDUSER;
			statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			rs = statement.executeQuery();
	
			while (rs.next()) {
				Recipe recipe = new Recipe();
				recipe.setId(rs.getInt("r.id"));
				recipe.setIdUser(rs.getInt("r.iduser"));
				recipe.setTen(rs.getNString("r.ten"));
				recipe.setMoTa(rs.getNString("r.mota"));
				recipe.setHinhAnh(rs.getString("r.hinhanh"));
				recipe.setNguyenLieu(rs.getNString("r.nguyenlieu"));
				recipe.setLuotThich(rs.getInt("r.luotthich"));
				recipe.setTgDang(rs.getDate("r.tgdang"));
				recipe.setTgThucHien(rs.getInt("r.tgthuchien"));
				recipe.setAvatarUser(rs.getString("u.avatar"));
				recipe.setNameUser(rs.getNString("u.fullname"));
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
	
	public int deleteRecipeById(int id) {
		List<Recipe> recipes = new LinkedList<Recipe>();
		try {
			connection = MySQLConnection.getConnection();
			String query = DbConst.DELETE_RECIPES;
			statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			rs = statement.executeQuery();
	
			return statement.executeUpdate();
			
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
		return 0;
	}

	public int updateLuotThich(int idrecipe) {
		try {
			connection = MySQLConnection.getConnection();
			String query = DbConst.UPDATE_LUOTTHICH;

			statement = connection.prepareStatement(query);

			
			statement.setInt(1, idrecipe);

			return statement.executeUpdate();
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

		return 0;
	}		
	
	public List<Recipe> getBSTRecipeByIdUser(int id) {
		List<Recipe> recipes = new LinkedList<Recipe>();
		try {
			connection = MySQLConnection.getConnection();
			String query = DbConst.GET_BST_RECIPES;
			statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			rs = statement.executeQuery();
	
			while (rs.next()) {
				Recipe recipe = new Recipe();
				recipe.setId(rs.getInt("r.id"));
				recipe.setIdUser(rs.getInt("r.iduser"));
				recipe.setTen(rs.getNString("r.ten"));
				recipe.setMoTa(rs.getNString("r.mota"));
				recipe.setHinhAnh(rs.getString("r.hinhanh"));
				recipe.setNguyenLieu(rs.getNString("r.nguyenlieu"));
				recipe.setLuotThich(rs.getInt("r.luotthich"));
				recipe.setTgDang(rs.getDate("r.tgdang"));
				recipe.setTgThucHien(rs.getInt("r.tgthuchien"));
				recipe.setAvatarUser(rs.getString("u.avatar"));
				recipe.setNameUser(rs.getNString("u.fullname"));
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
	
	public List<Recipe> getRecipeByName(String name) {
		List<Recipe> recipes = new LinkedList<Recipe>();
		try {
			connection = MySQLConnection.getConnection();
			String query = DbConst.GET_RECIPE_SEARCH;
			statement = connection.prepareStatement(query);
			statement.setNString(1, name);
			rs = statement.executeQuery();
	
			while (rs.next()) {
				Recipe recipe = new Recipe();
				recipe.setId(rs.getInt("r.id"));
				recipe.setIdUser(rs.getInt("r.iduser"));
				recipe.setTen(rs.getNString("r.ten"));
				recipe.setMoTa(rs.getNString("r.mota"));
				recipe.setHinhAnh(rs.getString("r.hinhanh"));
				recipe.setNguyenLieu(rs.getNString("r.nguyenlieu"));
				recipe.setLuotThich(rs.getInt("r.luotthich"));
				recipe.setTgDang(rs.getDate("r.tgdang"));
				recipe.setTgThucHien(rs.getInt("r.tgthuchien"));
				recipe.setAvatarUser(rs.getString("u.avatar"));
				recipe.setNameUser(rs.getNString("u.fullname"));
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
	
	public List<Recipe> getRecipeByTopic(int topic) {
		List<Recipe> recipes = new LinkedList<Recipe>();
		try {
			connection = MySQLConnection.getConnection();
			String query = DbConst.GET_RECIPE_BY_TOPIC;
			statement = connection.prepareStatement(query);
			statement.setInt(1, topic);
			rs = statement.executeQuery();
	
			while (rs.next()) {
				Recipe recipe = new Recipe();
				recipe.setId(rs.getInt("r.id"));
				recipe.setIdUser(rs.getInt("r.iduser"));
				recipe.setTen(rs.getNString("r.ten"));
				recipe.setMoTa(rs.getNString("r.mota"));
				recipe.setHinhAnh(rs.getString("r.hinhanh"));
				recipe.setNguyenLieu(rs.getNString("r.nguyenlieu"));
				recipe.setLuotThich(rs.getInt("r.luotthich"));
				recipe.setTgDang(rs.getDate("r.tgdang"));
				recipe.setTgThucHien(rs.getInt("r.tgthuchien"));
				recipe.setAvatarUser(rs.getString("u.avatar"));
				recipe.setNameUser(rs.getNString("u.fullname"));
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
	
	public List<Recipe> getRecipeByTopic_Category(int topic, int category) {
		List<Recipe> recipes = new LinkedList<Recipe>();
		try {
			connection = MySQLConnection.getConnection();
			String query = DbConst.GET_RECIPE_BY_TOPIC_THELOAI;
			statement = connection.prepareStatement(query);
			statement.setInt(1, topic);
			statement.setInt(2, category);
			rs = statement.executeQuery();
	
			while (rs.next()) {
				Recipe recipe = new Recipe();
				recipe.setId(rs.getInt("r.id"));
				recipe.setIdUser(rs.getInt("r.iduser"));
				recipe.setTen(rs.getNString("r.ten"));
				recipe.setMoTa(rs.getNString("r.mota"));
				recipe.setHinhAnh(rs.getString("r.hinhanh"));
				recipe.setNguyenLieu(rs.getNString("r.nguyenlieu"));
				recipe.setLuotThich(rs.getInt("r.luotthich"));
				recipe.setTgDang(rs.getDate("r.tgdang"));
				recipe.setTgThucHien(rs.getInt("r.tgthuchien"));
				recipe.setAvatarUser(rs.getString("u.avatar"));
				recipe.setNameUser(rs.getNString("u.fullname"));
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
	

		