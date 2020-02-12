package overloading;

public class Calculator {
	
	/*
	 - 오버로딩(중복) : 하나의 클래스 내부에 같은 이름을 가진 메서드나 생성자를 여러개 선언할수 있게 해주는 문법
	 -오버로딩 적용 조건 : 
	  1. 매개 변수의 데이터 타입이 다를 것 or
	  2. 매개 변수의 전달 순서가 다를 것 or
	  3. 매개 변수의 갯수가 다를 것
	  4. 접근제한자나 반환유형은 오버로딩에 영향을 미치지 않습니다
	 */
	
	void inputData (int a) {
		System.out.println("정수 1개가 전달됨");
	}
	
	void inputData (int a, int b) {
		System.out.println("정수 2개가 전달됨");
	}
	
	void inputData (String s) {
		System.out.println("문자열 1개가 전달됨");
	}
	
	void inputData (int a, double d) {
	}
	
	void inputData (double d, int a) {
	}// 순서가 다르기 때문에 오버로딩 가능합니다
	
//	void inputData (int number) {
//	}//매개변수 1개를 받는 메서드가 이미 선언됨
	
//	int inputData(int a) {
//		return 0;
//	}// 반환유형 (return type)은 오버로딩에 안됨
	
	int CalcRectArea(int le) {
		return le*le;
	}
	
	int  CalcRectArea(int g, int s) {
		return g*s;
	}

}
