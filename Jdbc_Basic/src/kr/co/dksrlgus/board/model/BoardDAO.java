package kr.co.dksrlgus.board.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO implements IBoardDAO {
	
	DataSource ds;
	
	//싱글톤 패턴
	//1. 생성자에 private 제한
	private BoardDAO() {
		//커넥션 풀 연결 방법
		try {
			//InitialContext객데에 설정파일이 저장됨
			InitialContext ct = new InitialContext();
			ds = (DataSource) ct.lookup("java:comp/env/jdbc/mysql");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//2. 클래스 내부에서 자신 스스로의 객체를 단 1개만 생성
	private static BoardDAO boardDAO = new BoardDAO();
	
	//3. 외부에서 객체 요구시 공개된 메서드를 통해 주소값 리턴
	public static BoardDAO getInstance() {
		if(boardDAO == null) {
				boardDAO = new BoardDAO();
		}
		return boardDAO;
	}
	
//	//커넥션 객체를 생성하여 리턴해주는 유틸메서드 선언
//	private Connection getConnection() throws Exception {
//			String url = "jdbc:mysql://localhost:3306/jsp_practice?serverTimezone=Asia/Seoul";
//			String uid = "jsp";
//			String upw = "jsp";
//			
//			return DriverManager.getConnection(url, uid, upw);
//	}
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	
	/////////////////////////////////////////////////////////
	
	@Override
	public boolean insert(Board article) {
		
		boolean flag = false;
		
		String sql = "INSERT INTO board" +  " (writer, title, content)"
					+ " VALUES(?,?,?)"; //앞에 공백을 채울 것
		
		try {
				conn = ds.getConnection();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, article.getWriter());
				pstmt.setString(2, article.getTitle());
				pstmt.setString(3, article.getContent());
	
				if(pstmt.executeUpdate() == 1) {
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
	public List<Board> selectAll() {

		String sql = "SELECT * FROM board ORDER BY board_id DESC";
		
		List<Board> boardList = new ArrayList<>();
		
		try {
				conn = ds.getConnection();
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					Board board = new Board(
								rs.getLong("board_id"),
								rs.getString("writer"),
								rs.getString("title"),
								rs.getString("content"),
								rs.getDate("created_at")
							);
					boardList.add(board);
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
		
		return boardList;
	}

	@Override
	public Board selectOne(Long boardId) {
		
		String sql = "SELECT * FROM board WHERE board_id=?";
		Board article = null;
		
		try {
				conn = ds.getConnection();
				pstmt = conn.prepareStatement(sql);
				pstmt.setLong(1, boardId);
				
				rs = pstmt.executeQuery();
				
				if(rs.next()) {
						article = new Board(
									rs.getLong("board_id"),
									rs.getString("writer"),
									rs.getString("title"),
									rs.getString("content"),
									rs.getDate("created_at")
								);
				}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
					if(conn != null) conn.close();
					if(pstmt != null) pstmt.close();
					if(rs != null) rs.close();
			} catch (Exception e2) {
					e2.printStackTrace();
			}
		}
		return article;

	}

	@Override
	public boolean update(Board article) {
		
		boolean flag = false;
		
		String sql = "UPDATE board"
					+ " SET writer=?, title=?, content=?"
					+ " WHERE board_id=?";
		//?순서대로 작성
		try {
				conn = ds.getConnection();
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, article.getWriter());
				pstmt.setString(2, article.getTitle());
				pstmt.setString(3, article.getContent());
				pstmt.setLong(4, article.getBoardID());
				
				if(pstmt.executeUpdate() == 1) flag = true;
				else flag = false;
			
		} catch (Exception e) {
				e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return flag;
	}

	@Override
	public boolean delete(Long boardId) {
		boolean flag = false;
		
		String sql = "DELETE FROM board WHERE board_id=?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, boardId);
			
			if(pstmt.executeUpdate() == 1) flag = true;
			else flag = false;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return flag;
	}
	
	
	
	
}
