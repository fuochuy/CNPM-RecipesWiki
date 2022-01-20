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
import cnpm.recipe.model.TheLoai;

public class TheLoai_Repository {
	private Connection connection = null;
	private PreparedStatement statement = null;
	private ResultSet rs = null;
	
	public List<TheLoai> getAllTheLoai() {
		List<TheLoai> listTheLoai = new LinkedList<TheLoai>();
		try {
			connection = MySQLConnection.getConnection();
			String query = DbConst.GET_ALL_THELOAI;
			statement = connection.prepareStatement(query);
			rs = statement.executeQuery();
	
			while (rs.next()) {
				TheLoai theLoai = new TheLoai();
				theLoai.setId(rs.getInt("tl.id"));
				theLoai.setTentheloai(rs.getString("tl.tentheloai"));
				listTheLoai.add(theLoai);
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
		return listTheLoai;
	}
	
	public List<TheLoai> getTheLoaiByTopic(int topic) {
		List<TheLoai> listTheLoai = new LinkedList<TheLoai>();
		try {
			connection = MySQLConnection.getConnection();
			String query = DbConst.GET_THELOAI_BY_TOPIC;
			statement = connection.prepareStatement(query);
			statement.setInt(1, topic);
			rs = statement.executeQuery();
	
			while (rs.next()) {
				TheLoai theLoai = new TheLoai();
				theLoai.setId(rs.getInt("tl.id"));
				theLoai.setTentheloai(rs.getString("tl.tentheloai"));
				listTheLoai.add(theLoai);
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
		return listTheLoai;
	}
}
