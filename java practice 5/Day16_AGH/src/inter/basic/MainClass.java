package inter.basic;

public class MainClass {

	public static void main(String[] args) {
		
		//인터페이스는 객체를 생성할 수 없는 추상적인 개념입니다
//		Inter1 i1 = new Inter1();
		
		System.out.println("1인치 : " + Inter1.INCH + "cm");
		
		InterClass1 i1 = new InterClass1();
		i1.method1();
		i1.method2();
		
		//다형성을 적용시키려면 상속이 전제되어야 하지만
		//추가로 인터페이스 구현관계가 있는 경우에도 다형성 구현이 가능합니다
		
		Inter1 it1 = new InterClass1();
		it1.method1();
		((InterClass1) it1).method2(); //add cast to ~
		Inter2 it2 = new InterClass1();
		it1.method3();
		
		Inter1 it3 = new InterClass2();
		Inter2 it4 = new InterClass3();
		
//		Inter1 it5 = new InterClass3();(x)
//		Inter2 it6 = new InterClass2();(x)
		
		Inter[] inters = {it1, it2, it3, it4};
		
		
	}

}
