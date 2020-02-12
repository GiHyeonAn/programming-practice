package poly.instanceof_;

public class MainClass {
	
	static void method1(Parent p) {
		Child c = (Child) p;
		System.out.println("Child타입으로 강제형 변환 성공");
	}
	
	static void method2(Parent p) {
		if(p instanceof Child) {
			Child c =(Child) p;
		} else {
			System.out.println("Child타입을 가질 수 없는 객체입니다");
		}
	}

	public static void main(String[] args) {
		
		Parent p1 = new Child();
		method1(p1);
		
		Parent p2 = new Parent();
//		method1(p2); //error
		method2(p2);

	}

}
