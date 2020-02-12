package poly.param;

public class Driver {
	
//	public Sonata buySonata() {
//		System.out.println("소나타를 구입합니다");
//		return new Sonata();
//	}
	
	public Car buyCar(String name) {
		if(name.equals("소나타")) {
			System.out.println("소나타를 구입합니다");
			return new Sonata();
		} else if(name.equals("K5")) {
			System.out.println("K5를 구입합니다");
			return new K5();
		} else if(name.equals("말리부")) {
			System.out.println("말리부를 구입합니다");
			return new Malibu();
		} else {
			return null;
		}
	}
	
	

}
