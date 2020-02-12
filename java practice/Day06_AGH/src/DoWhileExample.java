import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		
		//정수를 하나 입력받아서 1부터 입력받은 숫자까지 누적 합계를 구하는 로직
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력하세요 : ");
//		int num = sc.nextInt();
//		
//		int total = 0;
//		int n = 1;
//		while (n <= num) {
//			total += n;
//			n++;
//		}
//		System.out.printf("1부터 %d까지의 누적합 : %d\n", num, total);
		
//		do {
//			total =+ n;
//			n++;
//		} while (n <= num);
//		
//		System.out.printf("1부터 %d까지의 누적합 : %d\n", num, total);
		
		System.out.println("정수를 입력하세요");
		System.out.println("종료하시려면 0을 입력하세요");
		
		int num;
		do {
			System.out.print("> ");
			num = sc.nextInt();
			System.out.println(num);
		} while(num != 0);
		
		
		
		
		

	}

}
