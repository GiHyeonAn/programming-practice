package kr.co.dksrlgus.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcInsert {

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
		
		//DB연동 순서
		//1. DB 사용자 계정명과 암호, DB url 등 초기 데이터 변수를 설정
		String uid = "jsp"; //root(개인pc는 상관없음)
		String upw = "jsp"; //mysql
		String url = "jdbc:mysql://localhost:3306/jsp_practice?serverTimezone=Asia/Seoul";
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			//2. JDBC 커넥터 드라이버 호출
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//3. DB연동을 위한 클래스들의 객체를 생성
			/*
			  a - Connection 객체
			  : DB와의 연결을 위한 객체. Connection객체를 생성하려면
			  직접 new 연산자를 통해 객체를 생성할 수 없습니다
			  DriverManager클래스가 제공하는 정적 메서드인
			  getConnection()을 호출하여 객체를 생성합니다
			 */
			conn = DriverManager.getConnection(url, uid, upw);
			
			/*
			  b - Statement 객체 : 
			  - SQL문 실행을 위한 객체
			  Statement객체는 Connection객체가 제공하는 
			  createStatement()메서드를 호출하여 생성합니다
			 */
			stmt = conn.createStatement();
			
			/*
			  c - SQL문 작성
			  SQL문은  String 형태로 작성합니다
			 */
			String sql = "INSERT INTO members VAlUES "
					+ "('" + id + "', '" + pw + "', '" + name + "', '" + email + "')";
			
			/*
			  d - Statement객체를 통한 SQL문 실행
			    1. INSERT, UPDATE, DELETE명령일 경우 
			  	executeUpdate()를 호출합니다
			  	
			  	2. SELECT 명령일 경우 executeQuery()를 호출합니다
			  	
			  	3. executeUpdate()메서드는 실행 성공 시 성공한 쿼리문의 갯수를, 
			  	실패시 0을 리턴합니다
			 */
			int resultNum = stmt.executeUpdate(sql);
			
			if(resultNum == 1) {
				System.out.println("DB에 회원정보 저장 성공");
			} else {
				System.out.println("DB에 회원정보 저장 실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			/*
			 4. DB연동 객체들 자원을 반납
			 - 원활한 JDBC 프로그래밍을 위해 사용한 자원을 반납합니다
			 */
			try {
				conn.close(); stmt.close(); sc.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		

	}

}
