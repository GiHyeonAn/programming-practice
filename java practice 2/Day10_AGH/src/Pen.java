
//설계용 클래스 (라이브러리 클래스) 는 메인 메서드를 작성하지 않습니다
public class Pen {

	//객체의 속성들을 필드(멤버변수)라고 부릅니다
	String color; 
	int price;
	
	//객체의 기능들을 메서드라고 부릅니다
	void write() { //void는 반환값이 없다, 동작을 실행하는 역할을 한다
		System.out.println(color + "색 글을 씁니다");
	}
	
	void priceInfo() {
		System.out.println(color + "색 펜의 가격은" + price + "원 입니다");
	}
	
	
	
	
}
