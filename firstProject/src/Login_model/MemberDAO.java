package Login_model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
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
	
	public MemberDTO loginSelect(String id, String pw) {
		MemberDTO dto = null;
		getConn();
		String sql = "select * from member where id = ? and pw = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1,id);
			psmt.setString(2, pw);
			rs=psmt.executeQuery();
			while(rs.next()) {
				String loginId = rs.getString(1);
				String loginPw = rs.getString(2);
				String nickName = rs.getString(3);
				String name = rs.getString(4);
				int age = rs.getInt(5);
				String sex = rs.getString(6);
				String likeGenre = rs.getString(7);
				String title = rs.getString(8);
				dto = new MemberDTO(loginId, pw, nickName, name, age, sex, likeGenre, title);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return dto;
	}
	
	public int joinInsert(MemberDTO dto) {
		int cnt = 0;
		getConn();
		String sql = "insert into member values(?,?,?,?,?,?,?,?)";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getNickName());
			psmt.setString(4, dto.getName());
			psmt.setInt(5, dto.getAge());
			psmt.setString(6, dto.getSex());
			psmt.setString(7, dto.getLikeGenre());
			psmt.setString(8, dto.getTitle());
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cnt;
	}
	
	public int memberDelete(String id, String pw) {
		int cnt = 0;
		getConn();
		String sql = "delete from member where id = ? and pw = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return cnt;
	}
	
	public ArrayList<MemberDTO> memberInfoSelect(){
		ArrayList<MemberDTO> memberList = new ArrayList<MemberDTO>();
		getConn();
		String sql = "select * from member";
		
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String nickName = rs.getString(3);
				String name = rs.getString(4);
				int age = rs.getInt(5);
				String sex = rs.getString(6);
				String likeGenre = rs.getString(7);
				String title = rs.getString(8);
				memberList.add(new MemberDTO(id, pw, nickName, name, age, sex, likeGenre, title));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return memberList;
	}
	

}
