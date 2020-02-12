package test;

//import fruit.Apple;
//import fruit.Banana;
//import fruit.Melon;
import fruit.*; // fruit패키지 내의 모든 클래스를 import 하겠다
import juice.*;


public class Test {

	public static void main(String[] args) {
		
		//다른 패키지 내의 같은 이름의 클래스 객체를 생성할 때는 반드시 패키지의 경로를 표시해 주셔야 합니다
		
		fruit.Apple a = new fruit.Apple();
		juice.Apple a2 = new juice.Apple();
		Banana b = new Banana();//import 생성 : ctrl + space bar
		Melon m = new Melon();
		
		//import 생성없이도 가능하지만 대부분 이렇게 쓰는 사람 없습니다
		car.sedan.Sonata s = new car.sedan.Sonata();
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		

	}

}
