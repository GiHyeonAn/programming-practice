
/*
  - 반환값, 반환유형 (return value, return type)
  1. 반환값이란 메서드의 실행 결과값을 의미합니다
  2. 매개변수는 여러개 존재할 수 있지만, 반환값은 오직 한개만 존재해야 합니다
  3. return이라는 키워드를 사용하며 return 뒤에 전달할 값을 지정합니다
  4. 전달되는 값의 데이터 타입을 반환 유형이라고 하며, 메스드를 선언할 때 메서드 이름 앞에 
  반드시 반환 유형을 명시해야 합니다
  5. 반환값이 있는 메서드는 호출문이 하나의 값으로 처리되기 때문에 반환값을 다른 변수에 대입할 수도 있고
  다른 메서드의 매개값으로도 사용이 가능합니다
  6. 모든 메서드가 반환값이 있는 것은 아닙니다 
  메서드 실행 후에 반환할 값이 딱히 없다면  return을 사용하지 않아도 됩니다
  7. 이 때는 반환유형을 메서드 선언시에 비워두지 마시고
  반드시 void라는 키워드를 작성해 주셔야 합니다
  8. 모든 메서드는 return을 만나면 강제로 메서드가 종료됩니다
  따라서 조건없이 return문 아래에 코드를 작성할 수 없습니다
 void메서드에서는  return 키워드를 탈출 기능으로 사용할 수 있습니다
 */


public class MethodExample3 {

	static int add(int n1, int n2) {
		return n1 + n2;
//		System.out.println("야"); (x)
	}
	
	static int[] operateTotal(int n1, int n2) {
		return new int[] {add(n1,n2), n1+n2, n1-n2, n1*n2, n1/n2};
	}
	
	static double[] calcArrayTotal(int[] nums) {
		int total = 0;
		for (int n : nums) {
			total += n;
		}
		double avg = (double)total / nums.length;
		return new double[] {total, avg};
	}
	
	static void multi(int n1, int n2) {
		int result = n1*n2;
		System.out.printf("%d x %d = %d\n", n1,n2, result);
	}
	
	static void divide(int n1, int n2) {
		if (n2 == 0) {
			System.out.println("0으로 나눌 수 없습니다");
//			break;(x)
			return;
		}
		int result = n1/n2;
		System.out.printf("%d / %d = %d\n", n1,n2, result);
	}
	
	public static void main(String[] args) {
		
		int r1 = add(3, 8); //int r1 = 11;
//		int r2 = add(10,15);//int r2 = 25;
		int r2 = add(add(4,6), add(7,8));
		
		int[] totalResult = operateTotal(30,6);
		System.out.println("30 + 6 = " + totalResult[0]);
		System.out.println("30 - 6 = " + totalResult[2]);
		System.out.println("30 x 6 = " + totalResult[3]);
		System.out.println("30 / 6 = " + totalResult[4]);
		
		/*
		  - 메서드 이름은 calcArrayTotal 이라고 통일하겠습니다
		  - 이 메서드는 정수 배열 하나를 전달받아 해당 배열 내부에 있는 모든 정수의 합계(int)와
		  평균(double)을 '배열'에 담아 리턴하는 메서드입니다
		  - 2번에 정의된 메서드를 선언하시고, 실제로 호출하셔서 합계와 평균(소수둘째자리)을 출력해주세요
		  {57,89,78,91,97,47}
		 */
		
		System.out.println("----------------------");
		
		int[] numbers = {57,89,78,91,97,47};
		
		double[] result = calcArrayTotal(numbers);
		
		System.out.printf("총점: %d점, 평균 : %.2f점",(int)result[0], result[1]);
		
		System.out.println(" ");
		System.out.println("----------------------");
		
//		multi(10,7);
		
		/*
		 - 반환값이 없는 void타입의 메서드는 값이 돌아오지 않기 때문에 실행결과를 변수에 저장할 수 없습니다
		 - 반드시 단독 호출하여 사용해야 합니다
		 */
		
		multi(add(4,5), add(2,3));
//		add(multi(4,4),multi(5,5)); // (x)
		
//		divide(20,2);
		divide(20,0);
		
		
		

	}

}
