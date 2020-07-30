package Genre_Review_Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Login_view.GenreGUI;

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
	public int reviewDelete(int reviewNumber) {
		int cnt = 0;
		getConn();
		String sql = "delete from reviews where review_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, reviewNumber);
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	public ArrayList<ReviewDTO> selectAll(){
		
		ArrayList<ReviewDTO> reviewList = new ArrayList<ReviewDTO>();
		getConn();
		String sql = "select * from reviews order by review_no asc";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				int reviewNumber = rs.getInt(1);
				String nickName = rs.getString(2);
				String genre = rs.getString(3);
				String movieName = rs.getString(4);
				int point = rs.getInt(5);
				String reviewName = rs.getString(6);
				String reviewCont = rs.getString(7);
				String reviewDate = rs.getString(8);
				reviewList.add(new ReviewDTO(reviewNumber, nickName, genre, movieName, point, reviewName, reviewCont,
						reviewDate));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return reviewList;
	}

	public ArrayList<ReviewDTO> select(String Genre) {

		ArrayList<ReviewDTO> reviewList = new ArrayList<ReviewDTO>();
		getConn();
		String sql = "select * from reviews where genre = ? order by review_no asc";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, Genre);
			rs = psmt.executeQuery();
			while (rs.next()) {
				int reviewNumber = rs.getInt(1);
				String nickName = rs.getString(2);
				String genre = rs.getString(3);
				String movieName = rs.getString(4);
				int point = rs.getInt(5);
				String reviewName = rs.getString(6);
				String reviewCont = rs.getString(7);
				String reviewDate = rs.getString(8);
				reviewList.add(new ReviewDTO(reviewNumber, nickName, genre, movieName, point, reviewName, reviewCont,
						reviewDate));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return reviewList;
	}
	public ArrayList<ReviewDTO> searchAdmin(String a, String b) {
		ArrayList<ReviewDTO> reviewList = new ArrayList<ReviewDTO>();
		getConn();
		String sql = null;
		
		if (b.equals("액션")) {
			b = "ACTION";
		}else if (b.equals("드라마")) {
			b = "DRAMA";
		}else if (b.equals("SF") || b.equals("판타지")) {
			b = "SFFANTASY";
		}else if (b.equals("로맨스")) {
			b = "ROMANCE";
		}else if (b.equals("코미디")) {
			b = "COMEDY";
		}else if (b.equals("공포") || b.equals("스릴러")) {
			b = "HORRORTHRILLER";
		}else if (b.equals("애니") || b.equals("애니메이션")) {
			b = "ANIMATION";
		}
		
		if (a.equals("닉네임")) {
			sql = "select * from reviews where mem_nn = ? order by review_no asc";
		} else if (a.equals("영화제목")) {
			sql = "select * from reviews where movie_title = ? order by review_no asc";
		} else if (a.equals("장르")) {
			sql = "select * from reviews where genre = ?";
			
		}
		try {
			if (a.equals("전체검색")) {
				sql = "select * from reviews where genre = ? or mem_nn = ? or movie_title = ? order by review_no asc";
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, b);
				psmt.setString(2, b);
				psmt.setString(3, b);
				rs = psmt.executeQuery();

				while (rs.next()) {
					int reviewNumber = rs.getInt(1);
					String nickName = rs.getString(2);
					String genre = rs.getString(3);
					String movieName = rs.getString(4);
					int point = rs.getInt(5);
					String reviewName = rs.getString(6);
					String reviewCont = rs.getString(7);
					String reviewDate = rs.getString(8);
					reviewList.add(new ReviewDTO(reviewNumber, nickName, genre, movieName, point, reviewName,
							reviewCont, reviewDate));
				}
			} else {

				psmt = conn.prepareStatement(sql);
				psmt.setString(1, b);
				rs = psmt.executeQuery();

				while (rs.next()) {
					int reviewNumber = rs.getInt(1);
					String nickName = rs.getString(2);
					String genre = rs.getString(3);
					String movieName = rs.getString(4);
					int point = rs.getInt(5);
					String reviewName = rs.getString(6);
					String reviewCont = rs.getString(7);
					String reviewDate = rs.getString(8);
					reviewList.add(new ReviewDTO(reviewNumber, nickName, genre, movieName, point, reviewName,
							reviewCont, reviewDate));
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return reviewList;
	}

	public ArrayList<ReviewDTO> search(String a, String b) {
		ArrayList<ReviewDTO> reviewList = new ArrayList<ReviewDTO>();
		getConn();
		String sql = null;
		if (a.equals("닉네임")) {
			sql = "select * from reviews where mem_nn = ? and genre = ? order by review_no asc";
		} else if (a.equals("영화제목")) {
			sql = "select * from reviews where movie_title = ? and genre = ? order by review_no asc";
		}
		try {
			if (a.equals("전체검색")) {
				sql = "select * from reviews where genre = ? and mem_nn = ? or movie_title = ? order by review_no asc";
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, GenreGUI.genre);
				psmt.setString(2, b);
				psmt.setString(3, b);
				rs = psmt.executeQuery();

				while (rs.next()) {
					int reviewNumber = rs.getInt(1);
					String nickName = rs.getString(2);
					String genre = rs.getString(3);
					String movieName = rs.getString(4);
					int point = rs.getInt(5);
					String reviewName = rs.getString(6);
					String reviewCont = rs.getString(7);
					String reviewDate = rs.getString(8);
					reviewList.add(new ReviewDTO(reviewNumber, nickName, genre, movieName, point, reviewName,
							reviewCont, reviewDate));
				}
			} else {

				psmt = conn.prepareStatement(sql);
				psmt.setString(1, b);
				psmt.setString(2, GenreGUI.genre);
				rs = psmt.executeQuery();

				while (rs.next()) {
					int reviewNumber = rs.getInt(1);
					String nickName = rs.getString(2);
					String genre = rs.getString(3);
					String movieName = rs.getString(4);
					int point = rs.getInt(5);
					String reviewName = rs.getString(6);
					String reviewCont = rs.getString(7);
					String reviewDate = rs.getString(8);
					reviewList.add(new ReviewDTO(reviewNumber, nickName, genre, movieName, point, reviewName,
							reviewCont, reviewDate));
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return reviewList;
	}

}
