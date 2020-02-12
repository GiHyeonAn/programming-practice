package exception.runtime;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class ClassCastExample {

	public static void main(String[] args) {
		
		Animal d = new Dog();
		Dog dog = (Dog) d;
		
//		Animal d2 = new Cat();
//		Dog dog2 = (Dog) d2;
		
		System.out.printf("오늘은 %d일 입니다", 8);
		
		
		
		
	}

}
