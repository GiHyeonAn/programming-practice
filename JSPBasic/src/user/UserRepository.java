package user;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
	
	private static List<User> userList = new ArrayList<>();
	
	//생성된 user객체를 리스트에 추가하는 메서드
	public static void save(User user) {
		userList.add(user);
	}
	
	public static void showUsers() {
		
		System.out.println("회원 정보");
		
		for(User user : userList) {
			System.out.println("아이디 : " + user.getAccount());
			System.out.println("비밀번호 : " + user.getPassword());
			System.out.println("이름 : " + user.getName());
			System.out.println("별명 : " + user.getNickName());
			System.out.println("--------------------------------------");
		}
	}
	
	public static User getUser(String inputId) {
		
		for(User user : userList) {
			if(user.getAccount().equals(inputId)) {
				return user;
			}
		}
		return null;
	}
	
	public static void deleteUser(String userId) {
	      userList.remove(getUser(userId));//중복되는 코드를 쓸 필요가 없다
	   }
	
	
	

}
