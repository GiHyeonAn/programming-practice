
/*
  - 매서드(method)
  1. 메서드는 코드의 모듈화 및 재활용성을 높이기 위해 사용합니다
  2. 메서드는 선언하는 과정과 호출하는 과정으로 나누어집니다
  3. 메서드 선언은 메서드 내부에서는 불가능 합니다 
  새로운 메서드의 선언은 반드시 메서드 믈록 외부 and 클래스블록 내부에서만 가능합니다
  4. 메서드 호출은 메서드나 생성자 블록 내부에서만 가능합니다
  5. 호출하는 과정은 메서드를 사용하는 과정이며, 해당 메서드가 필요로 하는 데이터(매개값)를 메서드 내부로 전달하면서,
  해당 메서드는 매개값을 통해 처리한 결과를 다시 호출부로 반환합니다
 */

public class MethodExample1 {
	
	//메서드의 선언
	static int calcTotal(int x) { //calcTotal(int x) : 메서드의 이름, int x : 매개변수
		int total = 0;
		for(int i=1; i<=x; i++) {
			total += i;
		}
		return total;
	}
	

	public static void main(String[] args) {
		
		int result = calcTotal(10);
		System.out.println(result);
		
		System.out.println("1~100까지의 누적합 : " + calcTotal(100));
		System.out.println("1~200까지의 누적합 : " + calcTotal(200));
		System.out.println("1~300까지의 누적합 : " + calcTotal(300));
		System.out.println("1~400까지의 누적합 : " + calcTotal(400));
		System.out.println("1~500까지의 누적합 : " + calcTotal(500));
		
		
		
		
		

	}

}
