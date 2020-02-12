import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {
		
		/*
		 - 정수 한 개를 입력받아서 해당 정수가 소수(prime number)인지를 판별하시면 됩니다
		 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int n = sc.nextInt();
		
		//첫번째 방법
		int a = 2; //소수의 판별을 위해 입력받은 정수 n을 지속적으로 나누어 볼 변수
		int c = 0; //나누어 떨어지는 횟수를 세 줄 변수
		while(a <= n) {
			if (n % a == 0) {
				c++;
			} a++;
		}
		
		if(c == 1) {
			System.out.println("소수입니다");
		}else {
			System.out.println("소수가 아닙니다");
		}
		
		System.out.println("-----------------------------");
		//두번째 방법
		int e = 2;
		
		while(n % e != 0) {
			e++;
		}
		
		System.out.println((n == e ? "소수입니다" : "소수가 아닙니다"));

	}

}
