package modi.protec.pac2;

import modi.protec.pac1.A; 

public class D extends A{
	
	public D() {
		
//		A a = new A(30);
		
		/*
		 - protected 제한자는 패키지가 다른 경우
		 두 클래스 사이에 상속 관계가 있다면 super키워드를 통해 참조를 허용합니다
		 */
		
		super(30);
		
		super.x =1;
		super.method1();
		
	}

}
