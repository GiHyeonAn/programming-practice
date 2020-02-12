
public class MethodQuiz {
	
	static int sum(int n) {
		int total = 0;
		System.out.print(n + "의 약수 : ");
		for (int i=1; i<=n;i++) {
			if (n%i == 0) {
				System.out.print(i + " ");
				total += i;
			}
		}
		System.out.println();
		return total;
	}

	public static void main(String[] args) {
		
		/*
		 - 매개변수를 하나 받아서 해당하는 수의 약수의 총합을 구해서 그 총합을 리턴하는 메서드를 하나 선언하세요
		 - 이 메서드는 매개값으로 받은 모든 약수를 가로로 출력한 후 그 약수들의 총합을 리턴해주는 메서드입니다
		 - 메서드 선언을 완료하신 후에 메서드를 호출하여 10의 약수의 총 합과 72의 약수의 총합을 출력해 보세요
		 - 메서드 이름은 sum으로 통일하겠습니다
		 ex)System.out.println("10의 약수의 총합: " + sum(10)); 
		 ex)System.out.println("72의 약수의 총합: " + sum(72)); 
		 10의 약수
		 10의 약수의 총합
		 72의 약수
		 72의 약수의 총합
		 */
		
		System.out.println("10의 약수의 총합: " + sum(10)); 
		System.out.println("72의 약수의 총합: " + sum(72)); 
		
		
		
		
		
		

	}

}
