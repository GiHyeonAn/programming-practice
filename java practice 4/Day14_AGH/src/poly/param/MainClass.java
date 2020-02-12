package poly.param;

public class MainClass {

	public static void main(String[] args) {
		
		Driver kim = new Driver();
		Car c = kim.buyCar("소나타");
		c.run();
		
		Sonata s = (Sonata) c;
		
		s.enterMembership();//한번만 강제형 변환가능
		
		c.run();//한번 변환 후 다시 돌아옴
		
		System.out.println("---------------------------");
		
		CarShop shop = new CarShop();
		
		shop.carPrice(c);

		shop.carPrice(new K5());//Car c = new K5();
		
		shop.carPrice(kim.buyCar("말리부"));
		
	}
	
}
