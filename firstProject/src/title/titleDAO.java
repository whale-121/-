package title;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import Genre_Review_Model.ReviewDTO;
import Login_model.MemberDTO;

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
		String sql = "select distinct * from title where mem_id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, mem_id);
			rs = psmt.executeQuery();
			while (rs.next()) {
				String genre = rs.getString(1);
				String condition = rs.getString(2);
				String title = rs.getString(3);
				String men_id = rs.getString(4);
				titleList.add(new titleDTO(genre, condition, title, men_id));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return titleList;
	}

	public int countReview(String mem_id) {

		getConn();
		int count = 0;
		String sql = "select count(*) from reviews where mem_nn = (select nickname from member where id = ? )";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, mem_id);
			rs = psmt.executeQuery();
			while (rs.next()) {
				count = rs.getInt(1);
				if (count == 10) {
					System.out.println("리뷰 10개로 영화를 바라볼 순 없어요");
				}
				if (count == 30) {
					System.out.println("동작 그만 리뷰 30개냐");
				}
				if (count == 50) {
					System.out.println("리뷰 50개 드루와");
				}
				if (count == 100) {
					System.out.println("나 리뷰 100개 쓴 사람이야");
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return count;
	}

	public int countReview_Genre(String genre, String mem_id) {

		getConn();
		int count = 0;
		String sql = "select count(*) from reviews where mem_nn = (select nickname from member where id = ? ) and genre = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, mem_id);
			psmt.setString(2, genre);
			rs = psmt.executeQuery();
			while (rs.next()) {
				count = rs.getInt(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return count;
	}

	public int countReview_Point(int point, String mem_id) {

		getConn();
		int count = 0;
		String sql = "select count(*) from reviews where mem_nn = (select nickname from member where id = ? ) and point = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, mem_id);
			psmt.setInt(2, point);
			rs = psmt.executeQuery();
			while (rs.next()) {
				count = rs.getInt(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return count;
	}

	public int newTitle(titleDTO dto) {
		
		getConn();
		
		int cnt = 0;
		String sql = "insert into title values(?, ?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getGenre());
			psmt.setString(2, dto.getCondition());
			psmt.setString(3, dto.getTitle());
			psmt.setString(4, dto.getMem_id());
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return cnt;
	}
	
	public ArrayList<String> duplicateTitle(MemberDTO dto) {
		String title1 = null;
		ArrayList<String> titleList = new ArrayList<String>();
		getConn();
		int count = 0;
		String sql = "select title from title where mem_id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			rs = psmt.executeQuery();
			while (rs.next()) {
				titleList.add(rs.getString(1));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
//		if(title1 == null) {
//			count = 0;
//		}else {
//			count = 1;
//		}
		return titleList;
		
	
		
	}
}
