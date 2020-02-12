package poly.param;

public class CarShop {
	
	/*
	 - instanceof키워드를 사용해서 매개변수로 들어오는 주소값의 객체를 판단해서
	 소나타 2700만원, K5 2600만원, 말리부 2800만원이라고 출력할 수 있는 메서드를 선언하세요
	 (public void carPrice(???))
	 
	 - 선언 후 MainClass에서 메서드를 호출해 보세요
	 */
	
	public void carPrice(Car c) {
		if (c instanceof Sonata) {
			System.out.println("2700만원 입니다");
		} else if (c instanceof K5) {
			System.out.println("2600만원 입니다");
		} else if (c instanceof Malibu){
			System.out.println("2800만원 입니다");	
		}
	}
	
	
	

}
