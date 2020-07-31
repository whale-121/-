package title;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class titleDAO {

	
	
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	private void getConn() {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String dbid = "hr";
		String dbpw = "hr";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, dbid, dbpw);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void close() {

		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<titleDTO> select_id(String mem_id) {

		ArrayList<titleDTO> titleList = new ArrayList<titleDTO>();
		getConn();
		String sql = "select * from title where mem_id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, mem_id);
			rs = psmt.executeQuery();
			while (rs.next()) {
				String genre = rs.getString(1);
				String condition = rs.getString(2);
				String title = rs.getString(3);
				String men_id = rs.getString(4);
				titleList.add(new titleDTO(genre, condition, title ,men_id));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return titleList;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
