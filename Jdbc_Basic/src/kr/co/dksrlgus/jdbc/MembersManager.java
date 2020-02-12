package kr.co.dksrlgus.jdbc;

import java.sql.*;
import java.util.Scanner;

public class MembersManager {
   
   private static Scanner sc = new Scanner(System.in);
   private static Connection conn;
   private static PreparedStatement pstmt;
   private static ResultSet rs;
   
   public static void main(String[] args) {
      
      while(true) {
         
         System.out.println("\n### 회원 관리 프로그램 ###");
         System.out.println("# 1. 회원 정보 등록하기");
         System.out.println("# 2. 개인 회원 정보 조회하기");
         System.out.println("# 3. 전체 회원 정보 조회하기");
         System.out.println("# 4. 회원 정보 삭제하기");
         System.out.println("# 5. 프로그램 종료");
         System.out.println("# 6. 회원 정보 수정하기");
         
         System.out.print("# 메뉴를 입력하세요: ");
         int menu = sc.nextInt();
         
         switch(menu) {
         
         case 1:
            insert();
            break;
         case 2:
        	selectOne();
            break;
         case 3:
        	selectAll();
            break;
         case 4:
        	delete();
            break;
         case 5:
        	System.out.println("프로그램을 종료합니다");
        	sc.close();
        	System.exit(0);
         case 6:
        	update();
        	break;
         default:
            System.out.println("메뉴를 잘못 입력하셨습니다.");
         
         } //end switch
      } //end while

   } //end main

   
   //커넥션 객체를 제공하는 메서드.
   
   private static Connection getConnection() throws ClassNotFoundException, SQLException {
      
      String driverName = "com.mysql.cj.jdbc.Driver";
      String url = "jdbc:mysql://localhost:3306/jsp_practice?serverTimezone=Asia/Seoul";
      String uid = "jsp";
      String upw = "jsp";
      
      Class.forName(driverName);
      
      return DriverManager.getConnection(url, uid, upw);
      
   }
   
   //1. 회원 정보를 INSERT하는 메서드.
   
   private static void insert() {
      
      System.out.println("# 회원 정보를 입력하세요.");
      System.out.print("# 아이디: ");
      String id = sc.next();
      
      System.out.print("# 비밀번호: ");
      String pw = sc.next();
      
      System.out.print("# 이름: ");
      String name = sc.next();
      
      System.out.print("# 이메일: ");
      String email = sc.next();
      
      String sql = "INSERT INTO members VALUES(?,?,?,?)";
      
      try {
         conn = getConnection();
         pstmt = conn.prepareStatement(sql);
         
         pstmt.setString(1, id);
         pstmt.setString(2, pw);
         pstmt.setString(3, name);
         pstmt.setString(4, email);
         
         int rn = pstmt.executeUpdate();
         
         if(rn == 1) {
            System.out.println("회원정보 저장이 완료되었습니다.");
         } else {
            System.out.println("회원정보 저장에 실패했습니다.");
         }

      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            conn.close(); pstmt.close();
         } catch(Exception e) {
            e.printStackTrace();
         }
      }
   }
   
   //개별 회원 정보를 SELECT하는 메서드
   private static void selectOne() {
	   
	   System.out.println("조회할 회원의 ID를 입력하세요");
	   System.out.print("아이디 : ");
	   String userId = sc.next();
	   
	   String sql = "SELECT * FROM members WHERE id =?";
	   
	   try {
		conn = getConnection();
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, userId);
		rs = pstmt.executeQuery();
		if(rs.next()) {
			String id = rs.getString("id");
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			String email = rs.getString("email");
			System.out.println("- 회원 정보 -");
			System.out.println("아이디 : " + id);
			System.out.println("비밀번호: " + pw);
			System.out.println("이름 : " + name);
			System.out.println("이메일 : " + email);
		} else {
			System.out.println("해당 회원 정보는 존재하지 않습니다");
		}
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			conn.close(); pstmt.close(); rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
      
   }
   
   //전체 회원 정보를 SELECT하는 메서드
   private static void selectAll() {
      
	   String sql = "SELECT * FROM members ORDER BY name ASC";
	   
	   try {
		conn = getConnection();
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			System.out.println("- 회원 정보 -");
			System.out.println("아이디 : " + rs.getString("id"));
			System.out.println("비밀번호: " + rs.getString("pw"));
			System.out.println("이름 : " + rs.getString("name"));
			System.out.println("이메일 : " + rs.getString("email"));
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			conn.close(); pstmt.close(); rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	   
   }
   
   //회원 정보를 DELETE하는 메서드. 
   private static void delete() {
      //삭제할 회원의 id를 입력받아서 그 회원 정보를 DB에서 삭제해 주시면 됩니다.
	   System.out.println("삭제할 회원의 ID를 입력하세요");
	   System.out.print("아이디 : ");
	   String userId = sc.next();
	   
	   String sql = "DELETE FROM members WHERE id=?";
	   
	   try {
		conn = getConnection();
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, userId);
		int rn = pstmt.executeUpdate();
		if(rn == 1) {
			System.out.println("회원정보가 삭제되었습니다");
		} else {
			System.out.println("입력하신 회원의 정보가 존재하지 않습니다");
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			conn.close(); pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	   
   }
   
   private static void update() {
	   
	   System.out.println("수정하실 회원의 ID를 입력하세요");
	   System.out.print("아이디 : ");
	   String userId = sc.next();
	   
	   System.out.println("수정하실 값을 입력하세요");
	   
	   System.out.print("이름 : ");
	   String cName = sc.next();
	   
	   System.out.print("이메일 : ");
	   String cEmail = sc.next();
	   
	   String sql = "UPDATE members SET name =?, email =? WHERE id=?";
	   
	   try {
		conn = getConnection();
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, cName);
		pstmt.setString(2, cEmail);
		pstmt.setString(3, userId);
		
		int rn = pstmt.executeUpdate();
		
		if (rn == 1) {
			System.out.println("회원정보가 수정되었습니다");
		} else {
			System.out.println("회원정보 수정에 실패하였습니다");
		}
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			conn.close(); pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
   }
   
   
   
   
   
   
   
   
   
}