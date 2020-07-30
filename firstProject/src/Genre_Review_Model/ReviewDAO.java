package Genre_Review_Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;




public class ReviewDAO {
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
	
	public ArrayList<ReviewDTO> select() {
		
		ArrayList<ReviewDTO> reviewList = new ArrayList<ReviewDTO>();
		getConn();
		String sql = "select * from reviews";
		try {
			psmt = conn.prepareStatement(sql);
//			psmt.setString(1,Genre);
			rs = psmt.executeQuery();
			while(rs.next()) {
				String reviewNumber = rs.getString(1);
				String nickName = rs.getString(2);
				String genre = rs.getString(3);
				String movieName = rs.getString(4);
				int point = rs.getInt(5);
				String reviewName = rs.getString(6);
				String reviewCont = rs.getString(7);
				String reviewDate = rs.getString(8);
				reviewList.add(new ReviewDTO(reviewNumber, nickName, genre, movieName, point, reviewName, reviewCont, reviewDate));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return reviewList;
	}

}
