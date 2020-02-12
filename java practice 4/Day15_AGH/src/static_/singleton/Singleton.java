package static_.singleton;

public class Singleton {

	/*
	 - 싱글톤 패턴 : 클래스의 객체 생성을 단 1개로 제한하기 위한 디자인 패턴
	 1. 외부에서 이 클래스의 객체를 생성할 수 없도록 생성자를 단 하나만 선언한 후
	 private 제한을 붙임
	 */
	
	private Singleton() {
		System.out.println("객체가 생성됨");
	}
	
	/*
	 - 2. 생성자를 호출할 수 있는 영역은 같은 클래스 내부 뿐이므로 
	 자신의 클래스 내부에서 스스로의 객체를 단 1개만 생성합니다
	 */
	
	private static Singleton instance = new Singleton();
	
	/*
	 3. 외부에서 이 클래스의 객체 생성을 요구할 때, 2번에서 미리 만들어 놓은 단 하나의
	 객체를 공개된 메서드를 통해 리턴합니다
	 */
	
	public static Singleton getInstance() {
		return instance;
	}
	
	
	//////////////////////////////////////
	
	
	//클래스의 기능들을 선언한 메서드
	
	public void method1() {
		System.out.println("무조건 써야하는 메서드");
	}
	
	public void method2() {
		System.out.println("꼭 필요한 메서드");
	}
	
	
}
