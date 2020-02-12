import java.util.Scanner;

public class CountinueExample {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			if (i == 5) continue;
			System.out.print(i + " ");
		}
		System.out.println("\n반복문 종료");
		
		//continue키워드를 사용해서 1~30까지의 정수 중 홀수만 가로로 출력해 보세요
		
		for (int a = 1; a <= 30; a++) {
			if (a%2 == 0) continue;
			System.out.print(a + " ");
		}
		System.out.println("\n반복문 종료");
		
		System.out.println("-------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		
		while(true) {
			System.out.print("> ");
			int answer = sc.nextInt();
			if (answer == 1) break;
			else if (answer == 0) {
				System.out.println("다른 정수를 입력해 주세요");
				continue;
			}
			
			System.out.println("10 / 입력한 정수 : " + (10/ answer));
		}
		
		
		
		

	}

}
