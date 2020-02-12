package inter.basic;

public interface Inter1 extends Inter {
	
	//인터페이스에 변수를 선언하면 자동으로 상수로 취급합니다
	double INCH = 2.54;
	
	//인터페이스에 메서드를 선언하면 자동으로 추상 메서드로 취급됩니다(메서드 사용 x)
	void method1();
	
//	public Inter1() {
//		System.out.println("인터페이스의 생성자");
//	} 인터페이스는 생성자가 없다 (생성 불가)
	
	default void method3() {
		System.out.println("디폴트 메서드 선언");
	} //8버전에 업데이트

}
