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
import cnpm.recipe.model.Thamgia_Event;
import cnpm.recipe.model.User;

public class Thamgia_Event_Repository {
	private Connection connection = null;
	private PreparedStatement statement = null;
	private ResultSet rs = null;
	
	public int getTG_Event_Num(){
		int ans = 0;
		try {
			connection = MySQLConnection.getConnection();
			String query = DbConst.GET_TGEvent_Num;
			statement = connection.prepareStatement(query);
			rs = statement.executeQuery();
	
			while (rs.next()) {
				
				ans = rs.getInt("soluong");

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
		return ans;
	}
	
	public int getTG_Event(){
		int ans = 0;
		try {
			connection = MySQLConnection.getConnection();
			String query = DbConst.GET_TGEvent_Num;
			statement = connection.prepareStatement(query);
			rs = statement.executeQuery();
	
			while (rs.next()) {
				
				ans = rs.getInt("soluong");

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
		return ans;
	}
	
	
	public int insertTGEvent(int iduser, int idevent, int idrecipe) {
		try {
			connection = MySQLConnection.getConnection();
			String query = DbConst.INSERT_TGEvent;

			statement = connection.prepareStatement(query);

			statement.setInt(1, iduser);
			statement.setInt(2, idevent);
			statement.setInt(3, idrecipe);

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


