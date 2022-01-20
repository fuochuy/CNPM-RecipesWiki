package cnpm.recipe.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import cnpm.recipe.db.DbConst;
import cnpm.recipe.db.MySQLConnection;
import cnpm.recipe.model.Chude;

public class ChudeRepository {
	private Connection connection = null;
	private PreparedStatement statement = null;
	private ResultSet rs = null;
	
	public List<Chude> getChude() {
		List<Chude> chudes = new LinkedList<Chude>();
		try {
			connection = MySQLConnection.getConnection();
			String query = DbConst.GET_ALL_CHUDE;
			statement = connection.prepareStatement(query);
			rs = statement.executeQuery();
	
			while (rs.next()) {
				Chude chude = new Chude();
				chude.setId(rs.getInt("cd.id"));
				chude.setMota(rs.getString("cd.mota"));
				chude.setTen(rs.getString("cd.ten"));
				chude.setHinhanh(rs.getString("cd.hinhanh"));
				
				chudes.add(chude);
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
		return chudes;
	}
	
	public Chude getChudeById(int id) {
		Chude chude = new Chude();
		try {
			connection = MySQLConnection.getConnection();
			String query = DbConst.GET_CHUDE_BYID;
			statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			rs = statement.executeQuery();
	
			while (rs.next()) {
				
				chude.setId(rs.getInt("cd.id"));
				chude.setTen(rs.getString("cd.ten"));
				
				
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
		return chude;
	}
}
