package kr.co.dksrlgus.score.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
  DAO는 웹 서버의 DB연동 요청이 발생할 때마다
  DataBase CRUD(create, read, update, delete)작업을 전담하는 클래스 입니다
 */

public class ScoreDAO implements IScoreDAO {

	//싱글톤 디자인 패턴(객체 생성을 단 하나로 제한하기 위한 방법)
	//1. 클래스 외부에서 객체를 생성할 수 없도록 생성자에 private제한을 붙임
	
	private ScoreDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//2. 자신의 클래스 내부에서 스스로의 객체를 단 1개만 생성
	private static ScoreDAO scoreDAO = new ScoreDAO();
	
	//3.외부에서 객체를 요구할 시 공개된 메서드를 통해
	//2번에서 미리 만들어 놓은 단 하나의 객체를 리턴해 줌
	
	public static ScoreDAO getInstance() {
		if(scoreDAO == null) {
			scoreDAO = new ScoreDAO();
		}
		return scoreDAO;
	}
	
/////////////////////////////////////////////////////////////////
	
	//DB CRUD 기능 구현
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	//커넥션 객체를 제공하는 메서드.
	   
	private static Connection getConnection() throws Exception {
			      
		String url = "jdbc:mysql://localhost:3306/jsp_practice?serverTimezone=Asia/Seoul";
		String uid = "jsp";
		String upw = "jsp";
			      
		return DriverManager.getConnection(url, uid, upw);
			      
		}
	
	
	@Override
	public boolean insert(Scores score) {
		boolean flag = false;
		
		String sql = "INSERT INTO scores (name, kor, eng, math, total, average)"
				+ "VALUES(?,?,?,?,?,?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, score.getName());
			pstmt.setInt(2, score.getKor());
			pstmt.setInt(3, score.getEng());
			pstmt.setInt(4, score.getMath());
			pstmt.setInt(5, score.getTotal());
			pstmt.setDouble(6, score.getAverage());
			
			int rn = pstmt.executeUpdate();
			
			if(rn == 1) {
				flag = true;
			} else {
				flag = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close(); 
				if(pstmt != null) pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return flag;
	}


	@Override
	public List<Scores> list() {
		
		String sql = "SELECT * FROM scores ORDER BY id ASC";
		
		List<Scores> scoreList = new ArrayList<>();
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Scores scores = new Scores(
						rs.getLong("id"),
						rs.getString("name"),
						rs.getInt("kor"),
						rs.getInt("eng"),
						rs.getInt("math"),
						rs.getInt("total"),
						rs.getDouble("average")
						);
				scoreList.add(scores);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return scoreList;
	}


	@Override
	public List<Scores> search(String keyword) {
		
		List<Scores> scoreList = new ArrayList<>();
		
		String sql = "SELECT * FROM scores" + " WHERE name LIKE ?"
					+ " ORDER BY id ASC";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, keyword);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Scores scores = new Scores(
						rs.getLong("id"),
						rs.getString("name"),
						rs.getInt("kor"),
						rs.getInt("eng"),
						rs.getInt("math"),
						rs.getInt("total"),
						rs.getDouble("average")
						);
				scoreList.add(scores);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return scoreList;
	}


	@Override
	public boolean delete(Long id) {
		
		boolean flag = false;
		
		String sql = "DELETE FROM scores WHERE id=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, id);
			
			if(pstmt.executeUpdate() == 1) flag = true;
			else flag = false;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return flag;
	}

}


