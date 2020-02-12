import java.util.Scanner;

public class LoopNesting2 {

	public static void main(String[] args) {
		
		/*
		 - 정수를 하나 입력받아서 해당 숫자까지의 모든 소수의 합을 구하는 로직을 작성합니다
		 - ex) 입력받은 수 : 12 -> 2 + 3 + 5 + 7 + 11 = 28
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int n1 = sc.nextInt();
		
		/*
		 1. 소수는 약수가 1과 자기 자신밖에 없는 수
		 2. 소수를 판별하는 법은 반복문을 사용하여 해당 숫자까지
		 하나씩 나눠본 후에 약수의 갯수가 2개면 소수라 할 수 있습니다
		 3. 소수 판별을 로직을 세운 후에 해당 수가 소수일 때만 
		 누적합을 담아줄 변수에 누적시켜 더해주면 됩니다
		 */
		
		int sum = 0;
		
		System.out.print("소수 : ");
		for(int a = 2; a <= n1; a++) {
			int count = 0; //나누어 떨어지는 횟수를 담은 변수
			for(int c = 1; c <= a; c++) {
				if (a%c == 0) {
					count++;
				}
			} //end inner
			//나누어 떨어진 횟수가 2번이라면 소수 (1. 자기자신)
			if (count == 2) {
				sum += a;
				System.out.print(a + " ");
			}
		}
		System.out.println("\n입력받은 수의 범위 중 소수의 총 합은 : " + sum);
		
		
		
		
		

	}

}
