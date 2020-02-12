package modi.member.pac2;

import modi.member.pac1.A;

public class C {
	
	public C() {
		
		A a = new A();
		
		a.x = 1;//public
//		a.y = 2;//p.f
//		a.z = 3;//private
		
		a.method1();//public
//		a.method2();//p.f
//		a.method3();//private
		
		
	}
	

}
