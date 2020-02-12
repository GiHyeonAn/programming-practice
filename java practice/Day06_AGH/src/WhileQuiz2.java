import java.util.Scanner;

public class WhileQuiz2 {

	public static void main(String[] args) {
		
		/*
		 - 정수를 2개 (x,y)를 입력 받아서 x부터 y까지의 누적 합계를 while을 사용하여 구하는 코드를 작성하세요
		 ex) "x부터 y까지의 누적합계 : z"
		 */
		
		Scanner a = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요 : ");
		int n1 = a.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int n2 = a.nextInt();
		
		if(n1 > n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		
//		int s = n1;
//		n1 = (n1 > n2 ? n2 : n1);
//		n2 = (n1 > n2 ? s : n2);
		
		
		int t = 0;
		int n = n1;
		
		while (n <= n2) {
			t += n1;
			n1 ++;
		}
		
		System.out.printf("%d부터 %d까지의 누적합계 : %d", n1, n2, t);
		
		
		
		
		

	}

}
