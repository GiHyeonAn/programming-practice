import java.util.Scanner;

public class InsertQuiz {

	public static void main(String[] args) {
		
		/*
		 - 사용자에게 먹고 싶은 음식을 입력받아서 선언하신 배열에 넣어주세요
		 배열은  String[]로 100개짜리 배열을 선언해 주세요
		 
		 - "그만" 이라는 문자열을 입력받았을 시에는 반복문을 종료해 주세요
		 
		 - 반복문 종료 후 "내가 먹고싶은 음식들 : "형식으로 입력받은 값을 null값을 포함하지 않고 출력해 주세요
		 */
		
		String[] menu = new String[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴를 선택하세요 : ");
		
		for(int i = 0;i <= menu.length; i++) {
			System.out.print("> ");
			String name = sc.next();
			
			if(name.equals("그만")) {
				System.out.println("종료합니다");
				break;
			}
			
			menu[i] = name;
		}
		
		System.out.print("내가 먹고싶은 음식 : [");
		for (String n : menu) {
			if(n == null) break;
			System.out.print(n + " ");
		}
		System.out.println("]");
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
