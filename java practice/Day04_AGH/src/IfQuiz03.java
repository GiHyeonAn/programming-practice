import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {
		
		/*
		- 정수를 하나 입력받아서 해당 수가 짝수라면 "x는 짝수입니다"
		- 홀수라면 "x는 홀수입니다"를 출력하세요
		- 0이라면 "0입니다"를 출력하세요
		- 음수라면 "음수입니다"를 출력하세요
		 */
		
		Scanner as = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = as.nextInt();
		
		if (num == 0) {
			System.out.println("0입니다");
			} else if (num != 0) {
			if (num < 0) {
				System.out.println("음수입니다");
			} else if(num%2 != 0) {
				System.out.println("x는 홀수입니다");
			} else if(num%2 == 0) {
				System.out.println("x는 짝수입니다");
			}
		}
		
		as.close();
		
		
		// >= (0,짝,홀), <
		
		

	}

}
