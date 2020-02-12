package collectios.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		Map<String, String> users = new HashMap<>();
		
		//key : userID, value : userPW
		users.put("kim1234", "kkk1234");
		users.put("lee5678", "lll5678");
		users.put("park4321", "ppp4321");
		
		/*
		 <로그인 입력값 검증>
		 - 입력받은 아이디가 맵에 입력된 키 값에 해당하는지의 여부를 검사하여
		 - 존재한다면 다시 한 번 비밀번호와 비교해서 비밀번호도 일치한다면
		 "로그인 성공"을 출력하고 반복문을 탈출시키세요
		 - 비밀번호가 다르다면 "비밀번호가 틀렸습니다" 를 출력
		 아이디가 맵에 존재하지 않는다면 "아이디가 존재하지 않습니다"를 출력하세요
		 - 로그인 실패 시 다시 로그인을 할 수 있도록 반복문을 설정해 주세요
		 */
		
		System.out.println(users);
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("ID를 입력하세요 : ");
			String id = sc.next();
			if(users.containsKey(id)) {
				System.out.print("PW를 입력하세요 : ");
				String pw = sc.next();
				if(pw.equals(users.get(id))) {
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("비밀번호가 틀렸습니다");
				}
			} else {
				System.out.println("ID가 존재하지 않습니다");
			}
		}
		
		
		
		
		
		
	}

}
