package encap.good;

public class MainClass {

	public static void main(String[] args) {

		MyBirth my = new MyBirth();
//		my.year = 1991;
		my.setDay(26);
		my.setMonth(3);
		my.setYear(1992);
		
		
		System.out.printf("내 생일은 %d일 입니다\n",my.getDay("abc1234"));
		
		System.out.println("----------------------");
		
		System.out.printf("내 생일은 %d년 %d월 입니다", my.getYear(),my.getMonth());
		
		
	}

}
