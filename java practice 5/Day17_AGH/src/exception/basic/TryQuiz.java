package exception.basic;

import java.util.Scanner;

public class TryQuiz {

	public static void main(String[] args) {
		
		/*
		 - 스캐너를 이용하여 정수 2개를 입력받으세요
		 - 입력받은 값이 정수라면 단순히 정수 2개를 출력하고 반복문을 종료하세요
		 - 입력받은 값이 예외를 발생 시킬 수 있는 값이라면 (문자열 등)
		 "정수로만 입력하세요"를 출력 후 다시 정수를 입력받게 하시면 됩니다
		 - 마지막에 반복문을 탈출하면 "프로그램 정상 종료" 구문이 출력되도록
		 예외처리를 진행해 보세요
		 */
		
		
		Scanner sc = new Scanner(System.in);
		while (true) {	
			try {
				System.out.print("정수1 : ");
				int num1 = sc.nextInt();
				System.out.print("정수2 : ");
				int num2 = sc.nextInt();
				System.out.printf("%d %d\n", num1, num2);
				break;
			} catch (Exception e){
				System.out.println("정수로만 입력하세요");
				sc.nextLine(); 
			}	
		}
		
		System.out.println("프로그램 정상 종료");
		
		
	}

}
