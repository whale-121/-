package Genre_Review_Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import Login_model.MemberDTO;




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
	
	public ArrayList<ReviewDTO> select(String Genre) {
		
		ArrayList<ReviewDTO> reviewList = new ArrayList<ReviewDTO>();
		getConn();
		String sql = "select * from reviews where genre = ? order by review_no asc";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,Genre);
			rs = psmt.executeQuery();
			while(rs.next()) {
				int reviewNumber = rs.getInt(1);
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
	
	public int reviewSave(ReviewDTO dto) {
		int cnt = 0;
		getConn();
		String sql = "insert into reviews values(rep_seq.nextval,?,?,?,?,?,?,?)";
		SimpleDateFormat format1 = new SimpleDateFormat ("yyyy-MM-dd");  
		Date time = new Date();
		String time1 = format1.format(time);
		
		
		try {
			psmt = conn.prepareStatement(sql);
//			psmt.setInt(1, dto.getReviewNumber());
			psmt.setString(1, dto.getNickName());
			psmt.setString(2, dto.getGenre());
			psmt.setString(3, dto.getMovieName());
			psmt.setInt(4, dto.getPoint());
			psmt.setString(5, dto.getReviewName());
			psmt.setString(6, dto.getReviewCont());
			psmt.setString(7, time1);
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cnt;
		
	}

}
