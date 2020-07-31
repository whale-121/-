package Fav_model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Genre_Review_Model.ReviewDTO;
import Login_model.MemberDTO;

public class favDAO {

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
		
	}public int favorAdd(String nickName, MemberDTO mdto) {
		int cnt = 0;
		getConn();
		String sql = "insert into favorite values ('title', ?, (select count(*) from reviews where mem_nn = ? ), ? )";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, nickName);
			psmt.setString(2, nickName);
			psmt.setString(3, mdto.getId());
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	public ArrayList<favDTO> select() {

		ArrayList<favDTO> favList = new ArrayList<favDTO>();
		getConn();
		String sql = "select * from favorite";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				String title = rs.getString(1);
				String nickname = rs.getString(2);
				int reviews = rs.getInt(3);
				String user_id = rs.getString(4);
				favList.add(new favDTO(title, nickname, reviews, user_id));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return favList;
	}

	public ArrayList<favDTO> select_nn(String user_id) {

		ArrayList<favDTO> favList = new ArrayList<favDTO>();
		getConn();
		String sql = "select * from favorite where user_id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, user_id);
			rs = psmt.executeQuery();
			while (rs.next()) {
				String title = rs.getString(1);
				String nickname = rs.getString(2);
				int reviews = rs.getInt(3);
				String user_id1 = rs.getString(4);
				favList.add(new favDTO(title, nickname, reviews, user_id1));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return favList;
	}

	public int favorDel(String nickName) {
		int cnt = 0;
		getConn();
		String sql = "delete from favorite where user_id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, nickName);
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	
<<<<<<< HEAD
	public int favListDel(String nickName) {
		int cnt = 0;
		getConn();
		String sql = "delete from favorite where nickname = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, nickName);
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
=======
>>>>>>> branch 'master' of https://github.com/whale-121/-.git
	
}
