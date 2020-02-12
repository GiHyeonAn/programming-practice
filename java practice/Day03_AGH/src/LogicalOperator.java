
public class LogicalOperator {

	public static void main(String[] args) {
		
		//비교 (관계) 연산자(<, <=, >, >=, ==, !=)
		//좌항과 우항의 크기 값을 비교하여 결과값으로 논리형 타입 값을 도출합니다
		System.out.println(10 == 15);
		
		
		/*
		 -논리 연산자(&, &&, |, ||)
		 -좌항과 우항의 논리값을 연산하는 연산자 입니다
		 1. &,&& : 양쪽 항의 논리값이 모두 true일 경우만 true를 도출
		 2. |,|| : 양쪽 항의 논리값 중에 한쪽만 true여도 true를 도출
		 */
		int x = 10, y = 20;
		
		System.out.println(x > 10 && y <30);
		System.out.println(x > 10 || y <30);
		
		System.out.println("----------------");

		//논리 반전 연산자(!:(단항))
		//논리값을 반전시킵니다 true -> false, false -> ture
		
		int z = 10;
		System.out.println(z==10);
		System.out.println(!(z==10));
		
		boolean b1 = false;
		
		if(!b1) {
			System.out.println("~~~");
		}
		
		

	}

}
