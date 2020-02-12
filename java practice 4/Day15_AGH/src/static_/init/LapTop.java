package static_.init;

public class LapTop {

	public static String company  = "LG";
	public static String model = "Gram";
	public static String info;
	public int price;
	
	//정적변수를 자동으로 초기화하려면 정적 초기화자를 사용합니다
	static {
		System.out.println("정적 초기화자가 출력됨");
		info = company + "-" + model;
//		price = 1000000;
	}
	
	
	public LapTop() {
		System.out.println("생성자가 호출됨");
		price = 1000000;
		info = company + "-" + model;
	}
	
	
	
	
}
