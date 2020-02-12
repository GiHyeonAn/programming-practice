import java.util.Scanner;

public class BreakQuiz {

	public static void main(String[] args) {
		
		/*
		  - 2가지의 정수를 1~100사이의 난수를 발생시켜서 지속적으로 문제를 출제한 후
		  0을 입력하면 반복문을 탈출시키세요
		  
		  - 종료 이후에 정답 횟수와 오답 횟수를 각각 출력해 주세요
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------------------");
		System.out.println("*** 연산 퀴즈 ***");
		System.out.println("종료하시려면 0을 입력해주세요");
		
		int cCount = 0;
		int iCount = 0;

		
		while(true) {
			int n1 = (int) ((Math.random()*100) + 1);
			int n2 = (int) ((Math.random()*100) + 1);
			int r = (int) (Math.random()*2);
			if (r == 0){
				int add = n1 + n2;
				System.out.printf("%d + %d = ???\n", n1, n2);
				System.out.print("> ");
				int e = sc.nextInt();
				if(e == 0) {
					System.out.println("퀴즈를 종료합니다");
					break;
				} else if(e == add) {
					System.out.println("정답입니다");
					cCount++;
				} else {
					System.out.println("오답입니다");
					iCount++;
				}
			}
			 else if (r == 1){
				int minus = n1 - n2;
				System.out.printf("%d - %d = ???\n", n1, n2);
				System.out.print("> ");
				int e = sc.nextInt();
				if(e == 0) {
					System.out.println("퀴즈를 종료합니다");
					break;
				} else if(e == minus) {
					System.out.println("정답입니다");
					cCount++;
				} else {
					System.out.println("오답입니다");
					iCount++;
				}
			 }	
			}
			
			
		 
		    
		System.out.println("-------------------");
		System.out.println(cCount);
		System.out.println(iCount);
		
		
		
		
		

		
		
		
		

	}

}
