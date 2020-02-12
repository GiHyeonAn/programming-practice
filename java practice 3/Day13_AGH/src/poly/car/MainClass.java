package poly.car;

public class MainClass {

	public static void main(String[] args) {
		
		Sonata s1 = new Sonata();
		Sonata s2 = new Sonata();
		Sonata s3 = new Sonata();

		K5 k1 = new K5();
		K5 k2 = new K5();
		K5 k3 = new K5();
		
		Malibu m1 = new Malibu();
		Malibu m2 = new Malibu();
		Malibu m3 = new Malibu();
		Malibu m4 = new Malibu();
		
//		Sonata[] sonatas = {s1,s2,s3};
//		for(Sonata s : sonatas) {
//			s.run();
//		}
		
		Car[] cars = {s1,s2,s3,k1,k2,k3,m1,m2,m3,m4};
		for(Car c : cars) {
			c.run();
		}
		
		
		
		
	}

}
