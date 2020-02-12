package kr.co.dksrlgus.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcInsert2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("- 아이디 : ");
		String id = sc.next();
		
		System.out.print("- 비밀번호 : ");
		String pw = sc.next();
		
		System.out.print("- 이름 : ");
		String name = sc.next();
		
		System.out.print("- 이메일 : ");
		String email = sc.next();
		
		String url = "jdbc:mysql://localhost:3306/jsp_practice?serverTimezone=Asia/Seoul";
		String uid = "jsp";
		String upw = "jsp";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, uid, upw);
			
			String sql = "INSERT INTO members VALUES (?,?,?,?)";
			
			/*
			  PreparedStatement객체는 Conection객체가 제공하는 preparedStatement()메서드를
			  호출하고, 매개값에 sql을 바로 전달합니다
			 */
			pstmt = conn.prepareStatement(sql);
			
			/*
			 - pstmt객체를 생성했다면 sql문의 ?값을 채워줍니다
			 - ?는 첫번째 물음표부터 1번 인덱스값을 가지며, 순차적으로
			 인덱스가 1씩 증가합니다
			 - DB테이블의 컬럼 데이터 타입에 따라 setString(), setInt()...
			 등의 메서드를 사용하여 ?를 채웁니다
			 */
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			
			int resultNum = pstmt.executeUpdate();
			
			if(resultNum == 1) {
				System.out.println("회원정보 입력 성공");
			} else {
				System.out.println("회원정보 입력 실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close(); pstmt.close(); sc.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}

}
