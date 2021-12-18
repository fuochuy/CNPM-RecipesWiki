package cnpm.recipe.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import cnpm.recipe.db.DbConst;
import cnpm.recipe.db.MySQLConnection;
import cnpm.recipe.model.Account;



public class AccountRepository {
	private Connection connection = null;
	private PreparedStatement statement = null;
	private ResultSet rs = null;
	
	
	public List<Account> getAccounts() {
		List<Account> accounts = new LinkedList<Account>();
		try {
			connection = MySQLConnection.getConnection();
			String query = DbConst.GET_ACCOUNTS;
			statement = connection.prepareStatement(query);
			rs = statement.executeQuery();
	
			while (rs.next()) {
				Account account = new Account();
				account.setId(rs.getInt("a.id"));
				account.setUsername(rs.getString("a.username"));
				account.setPassword(rs.getString("a.password"));
				account.setStatus(rs.getInt("a.status"));

				accounts.add(account);
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
		return accounts;
	}
	public int insertAccount(Account account) {
		try {
			connection = MySQLConnection.getConnection();
			String query = DbConst.INSERT_ACCOUNT;

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
	
	public Account checkLogIn(String username, String password) {

		try {
			connection = MySQLConnection.getConnection();
			StringBuilder query = new StringBuilder("SELECT a.id, a.username, a.password, a.status "
					+ "FROM account a WHERE username = ? AND password = ?");
			
			statement = connection.prepareStatement(query.toString());
			statement.setString(1, username);
			statement.setString(2, password);
			rs = statement.executeQuery();

			while (rs.next()) {
				Account account = new Account();
				account.setId(rs.getInt("a.id"));
				account.setUsername(rs.getString("a.username"));
				account.setPassword(rs.getString("a.password"));
				account.setStatus(rs.getInt("a.status"));
				
				return account;
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
}



