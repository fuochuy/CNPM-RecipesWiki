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
import cnpm.recipe.model.Step;

public class StepRepository {
	private Connection connection = null;
	private PreparedStatement statement = null;
	private ResultSet rs = null;
	
	public List<Step> getStep() {
		List<Step> Steps = new LinkedList<Step>();
		try {
			connection = MySQLConnection.getConnection();
			String query = DbConst.GET_STEP_FOR_RECIPE;
			statement = connection.prepareStatement(query);
			rs = statement.executeQuery();
	
			while (rs.next()) {
				Step step = new Step();
				step.setId(rs.getInt("st.id"));
				step.setBuoc(rs.getInt("st.buoc"));
				step.setId_recipe(rs.getInt("st.idrecipe"));
				step.setHinhanh(rs.getString("st.hinhanh"));
				step.setDes(rs.getString("st.des"));
				
				Steps.add(step);
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
		return Steps;
	}
	public int insertStep(Step step) {
		try {
			connection = MySQLConnection.getConnection();
			String query = DbConst.INSERT_BUOC;

			statement = connection.prepareStatement(query);
			statement.setInt(1, step.getBuoc());
			statement.setInt(2, step.getId_recipe());
			statement.setString(3, step.getDes());
			statement.setString(4, step.getHinhanh());
			
			
			return statement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Không thể kết nối đến cơ sở dữ liệu ở StepRepository");
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
	
	public List<Step> getListStepByIdRecipe(int id) {
		List<Step> Steps = new LinkedList<Step>();
		try {
			connection = MySQLConnection.getConnection();
			String query = DbConst.GET_STEP_FOR_RECIPE;
			statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			rs = statement.executeQuery();
	
			while (rs.next()) {
				Step step = new Step();
				step.setId(rs.getInt("st.id"));
				step.setBuoc(rs.getInt("st.buoc"));
				step.setId_recipe(rs.getInt("st.idrecipe"));
				step.setHinhanh(rs.getString("st.hinhanh"));
				step.setDes(rs.getString("st.des"));
				
				Steps.add(step);
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
		return Steps;
	}
	
		public int deleteStepByIdRecipe(int id) {
		
		try {
			connection = MySQLConnection.getConnection();
			String query = DbConst.DELETE_STEP;
			statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			
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
