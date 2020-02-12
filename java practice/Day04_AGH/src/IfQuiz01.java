import java.util.Scanner;

public class IfQuiz01 {

	public static void main(String[] args) {
		
		/*
		 - 스캐너를 사용하여 키와 나이를 입력받으세요
		 - 키가 140 이상, 나이가 8사 이상이어야 탑승할 수 있는 
		 놀이기구의 탑승 가능 여부를 조건문을 사용하여 판단해 보세요
		 -탑승 가능여부와 상관없이 "오늘하루 즐거운 시간 되세요~"를 출력하세요
		 */
		
		Scanner as = new Scanner(System.in);
		
		System.out.print("키를 입력하세요 : ");
		int tall = as.nextInt();
		System.out.print("나이를 입력하세요 : ");
		int age = as.nextInt();
		System.out.println("키 : " + tall + "\n나이 : " + age + "살");
		
		if(tall >= 140 && age >= 8) {
			System.out.println("탑승 가능합니다");
		} else {
			System.out.println("죄송합니다. 탑승 불가능합니다.");
		}
		
		System.out.println("오늘하루 즐거운 시간 되세요~");
		
		as.close();
		
		
		
		
		
		

	}

}
