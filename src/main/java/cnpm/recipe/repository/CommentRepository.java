package cnpm.recipe.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import cnpm.recipe.db.DbConst;
import cnpm.recipe.db.MySQLConnection;
import cnpm.recipe.model.Comment;


public class CommentRepository {
	private Connection connection = null;
	private PreparedStatement statement = null;
	private ResultSet rs = null;
	
	public List<Comment> getListCommentByIdRecipe(int id) {
		List<Comment> comments = new LinkedList<Comment>();
		try {
			connection = MySQLConnection.getConnection();
			String query = DbConst.GET_COMMENT_BYID_RECIPE;
			statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			rs = statement.executeQuery();
	
			while (rs.next()) {
				Comment comment = new Comment();
				comment.setId(rs.getInt("c.id"));
				comment.setIdrecipe(rs.getInt("c.idrecipe"));
				comment.setFullname(rs.getNString("u.fullname"));
				comment.setAvatar(rs.getNString("u.avatar"));
				comment.setContent(rs.getNString("c.content"));
				comment.setNgayDang(rs.getDate("c.ngaydang"));
				
				comments.add(comment);
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
		return comments;
	}
}
