package inter.pet;

public class MainClass {

	public static void main(String[] args) {
		
		Animal baduk = new Dog();
		Animal navi = new Cat();
		Animal hosik = new Tiger();
		
		Animal[] animals = {baduk, navi, hosik};
		
		for (Animal a : animals) {
			a.eat();
		}
		
		System.out.println("---------------------------------------------");
		
		IPet[] pets = new IPet[3];
//		pets[0] = baduk;//animal과 ipet은 아무관계가 없기 때문
		pets[0] = (Dog)baduk; //한번만 바뀜(영구적 변환 x)
		//Animal타입의 baduk이 Dog타입으로 강제 형 변환
		//IPet타입의 배열로 들어가면서 IPet타입으로 자동 형 변환이 이루어짐
		pets[1] = (IPet)navi;
		/*
		 - 참조변수(navi)가 가리키는 객체(cat)가 상속과 구현관계에 있는 상위 클래스와
		 인터페이스 둘 모두와 관련성이 있다면, 상위타입(부모타입)에서 인터페이스 타입으로 
		 즉시 형 변환이 가능합니다
		 */
//		pets[2] = (IPet)hosik;(x)runtime error.
//		pets[2] = (IPet) new Shark(); (X)
		pets[2] = new GoldFish(); //앞에 new를 붙이면 애초에 IPet타입으로 태어났기 때문에 굳이 형변환 할 필요가 없다
		
		System.out.println("---------------------------------------------");
		
		PetShop shop =  new PetShop();
		
		shop.carePet((IPet) baduk);//타입형 변환 반드시 해야 한다
		shop.carePet((IPet) navi);//타입형 변환 반드시 해야 한다
		shop.carePet(pets[2]);
//		shop.carePet(pets[0]); //or

		System.out.println("---------------------------------------------");
		
		Zoo [] zoo = {baduk, navi, hosik, (Zoo) pets[2], new Shark()};
		
		//연산자의 연산 우선순위
		//괄호 >>>> (.)참조 >>> 단항 >>> 2항 >>> 3항 >>> 대입 
		
		for (Zoo z : zoo) {
			if(z instanceof Animal) {
				((Animal) z).eat();
			} else if(z instanceof Fish) {
				((Fish) z).swim();
			}
		}
		
		
	}

}
