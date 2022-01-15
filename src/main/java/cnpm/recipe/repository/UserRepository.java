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
import cnpm.recipe.model.User;



public class UserRepository {
	private Connection connection = null;
	private PreparedStatement statement = null;
	private ResultSet rs = null;
	
	
	public List<User> getUsers() {
		List<User> users = new LinkedList<User>();
		try {
			connection = MySQLConnection.getConnection();
			String query = DbConst.GET_USERS;
			statement = connection.prepareStatement(query);
			rs = statement.executeQuery();
	
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("a.id"));
				user.setUsername(rs.getString("a.username"));
				user.setPassword(rs.getString("a.password"));
				user.setStatus(rs.getInt("a.status"));
				user.setFullname(rs.getString("u.fullname"));
				user.setDOB(rs.getDate("u.DOB"));
				user.setAvatar(rs.getString("u.avatar"));
				
				users.add(user);
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
		return users;
	}
	public int insertUser(User account) {
		try {
			connection = MySQLConnection.getConnection();
			String query = DbConst.INSERT_USER;

			statement = connection.prepareStatement(query);
			statement.setString(1, account.getUsername());
			statement.setString(2, account.getPassword());
			
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
	
	public User checkLogIn(String username, String password) {

		try {
			connection = MySQLConnection.getConnection();
			StringBuilder query = new StringBuilder("SELECT u.id, u.email, u.password, u.status, u.fullname, u.DOB, u.avatar  "
					+ "FROM user u WHERE email = ? AND password = ?");
			
			statement = connection.prepareStatement(query.toString());
			statement.setString(1, username);
			statement.setString(2, password);
			rs = statement.executeQuery();

			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("u.id"));
				user.setUsername(rs.getString("u.email"));
				user.setPassword(rs.getString("u.password"));
				user.setStatus(rs.getInt("u.status"));
				user.setFullname(rs.getString("u.fullname"));
				user.setDOB(rs.getDate("u.DOB"));
				user.setAvatar(rs.getString("u.avatar"));
				return user;
			}
		} catch (SQLException e) {
			System.out.println("Không tìm thấy cơ sở dữ liệu");
			e.printStackTrace();
		} finally {
			try {
				connection.close();
				statement.close();
				rs.close();
			} catch (SQLException e) {
				System.out.println("Không thể kết nối đến cơ sở dữ liệu");
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/*
	public User getUserById(int id) {
		try {
			connection = MySQLConnection.getConnection();
			String query = DbConst.GET_USERS;
			statement = connection.prepareStatement(query);
			statement.setInt(1,id);
			rs = statement.executeQuery();
	
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("u.id"));
				user.setUsername(rs.getString("a.username"));
				user.setPassword(rs.getString("a.password"));
				user.setStatus(rs.getInt("a.status"));
				user.setFullname(rs.getString("u.fullname"));
				user.setDOB(rs.getDate("u.DOB"));
				user.setAvatar(rs.getString("u.avatar"));
				return user;
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
		return null;
		
	}
	*/
	public int updateUser(int id, String fullname, Date DOB, String avatar) {
		try {
			connection = MySQLConnection.getConnection();
			String query = DbConst.UPDATE_USER;

			statement = connection.prepareStatement(query);

		
			statement.setString(1, fullname);
			statement.setDate(2, DOB);
			statement.setString(3, avatar);
			statement.setInt(4, id);
			
			
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
}



