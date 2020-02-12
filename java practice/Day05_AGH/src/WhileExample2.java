
public class WhileExample2 {

	public static void main(String[] args) {
		
		//48 ~ 150사이의 정수 중 8의 배수를 가로로 출력하세요
		
		int a = 48;
		
		while (a <= 150) {
			if (a%8 == 0) {
				System.out.print(a + " ");
			}
			a ++; 
		}
		
//		int a = 48;
//		
//		while (a <= 150) {
//			System.out.print(a + " ");
//			a += 8;
//		}
		
		System.out.println(" ");
		System.out.println("-----------------");
		//1~100 까지의 정수 중 4의 배수이면서 8의 배수가 아닌 정수를 가로로 출력하세요
		
		int n = 1;
		
		while (n <= 100) {
			if (n%4 == 0) {
				if(n%8 != 0) {
					System.out.print(n + " ");
				}
			}
			n ++;
		}
		
		
		//프로그램 12번이상 실행 자제 
		
		System.out.println(" ");
		System.out.println("-----------------");
		
		
		
		//1~30000까지의 정수 중 258의 배수의 갯수를 구해보세요
		
		int b = 1;
		int c = 0;
		while (b <= 30000) {
			if(b%258 == 0) {
				c += 1;
			}
			b ++;
		}
		
		System.out.println(c);
		
		
		

	}

}
