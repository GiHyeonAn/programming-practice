package poly.casting;

public class MainClass {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.n1 = 1;
//		p.n2 = 2; (x)
		
		p.method1();
		p.method2();
//		p.method3();(x) 자식 고유의 메서드

		System.out.println("--------------------");
		
		Child c = new Child();
		
		c.n1 = 5; //부모로 부터 물려은 속성
		c.n2 = 6; //자식 고유의 속성
		
		c.method1();
		c.method2();
		c.method3();
		
		System.out.println("---------------------");
		
		//다형성 적용(promotion)
		Parent p2 = new Child();
//		System.out.println(p2);
		
		p2.method1();
		p2.method2();
//		p2.method3();(x)
		
		p2.n1 = 1;
//		p2.n2 = 2;(x)
		
		/*
		 - promotion(upcasting)이 적용되면 자식클래스의 본래의 멤버 (필드, 메서드)들을 참조할 수 없는 문제가 생깁니다
		 -이를 해결하기 위해서 강제 타입 변환(DownCasting)을 사용합니다
		 */
		
		double d = 3.14;
		int i = (int) d;
		
		Child c2 = (Child) p2;
		
		c2.n2 = 4;
		c2.method2();
		c2.method3();
		
		
		System.out.println("---------------------------");
		System.out.println("p2의 주소값 : " + p2);
		System.out.println("c2의 주소값 : " + c2);
		System.out.println("c의 주소값 : " + c);
		
		//다형성이 한 번도 발생하지 않은 객체는 강제형 변환을 진행할 수 없습니다
		
//		Child c3 = (Child) p; (x) 빨간줄은 뜨지 않으나 출력에러가 남
		
		
		
		
		
	}

}
