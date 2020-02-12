package static_.singleton;

public class MainClass {

	public static void main(String[] args) {
		
//		Singleton s1 = new Singleton();(x)
		
		Singleton s1 = Singleton.getInstance(); //static을 지정해야 한다
		Singleton s2 = Singleton.getInstance(); 
		Singleton s3 = Singleton.getInstance();
		Singleton s4 = Singleton.getInstance(); 
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		s1.method1();
		s2.method2();
		

	}

}
