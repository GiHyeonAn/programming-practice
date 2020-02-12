
public class Bread {

	
	int price;
	String name;
	
	Bread() {} //기본생성자를 입력해야 한다
	
	public Bread(String bName, int bPrice) { //기본생성자를 입력해야 한다
		name = bName;
		price = bPrice;
	}
	

	void info() {
		System.out.println("빵 이름 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("-------------------------");
	}
	
	
}
