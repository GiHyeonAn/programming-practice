package encap.good;

public class MyBirth {

	/*
	 - 은닉(캡슐화) : 데이터 보호의 목적으로 사용하는 OOP의 기술 중 하나
	 
	 - 은닉할 멤버변수에 private 제한을 붙임
	 */
	
	
	private int year;
	private int month;
	private int day;
	// 이 클래스에 메서드를 선언해야 한다
	
	/*
	 - 은닉은 데이터에 접근 제한을 걸어 정보를 보호하는 것이 목적이지만
	 private을 설정하면 데이터 접근 자체가 불가능합니다
	 - 따라서 데이터의유효성을 검증할 수 있는 제어문을 사용해서
	 데이터의 접근을 허용하도록 설정하는데, 이 때 사용하는 메서드를 setter/ getter 메서드라고 합니다
	 
	 - setter method
	 1. setter는 은닉된 변수에 값을 저장하기 위한 메서드입니다
	 2. 메서드 내부에 더이터 유효성 검증 로직을 작성하여 
	 적절한 데이터만 멤버변수에 저장시키고, 접근 제한자는 public으로 설정하여 외부에서 사용할 수 있게 합니다
	 3. 메서드 이름은 일반적으로 set + 멤버변수이름 으로 저장합니다 
	 */
	
	public void setDay(int day) {
		if(day < 1 || day > 31) {
			System.out.println("잘못된 일자 입력입니다");
		} else {
			System.out.println("날짜가 정상 입력하셨습니다");
			this.day = day;
		}
	}
	
	
	/*
	 - getter method
	 1. getter는 은닉된 변수의 값을 참조할 때 사용하는 메서드입니다
	 2. setter와 마찬가지로 public 제한을 통해 외부의 메서드를 공개하고
	 이름은 일반적으로 get + 멤버변수이름 으로 저장합니다
	 */
	
	public int getDay(String pw) {
		if (pw.equals("abc1234")) {
			return this.day;
		}else {
			System.out.println("틀렸습니다");
			return 0;
		}
	}
	
	/*
	 - month와 year의 setter / getter 메서드를 선언하세요
	 - month : 1~12
	 - year : 1900~2100
	 - getter 메서드는 따로 비밀번호 등 권한 설정 없이 바로 return '속성값' 해 주세요
	 */
	
	public void setYear (int year) {
		if (year < 1900 || year > 2100) {
			System.out.println("연도를 잘못 입력하셨습니다");
		} else {
			System.out.println("연도를 바르게 입력하셨습니다");
			this.year = year;
		}
	}
	
	public void setMonth (int month) {
		if (month < 1 || month > 12) {
			System.out.println("월을 잘못 입력하셨습니다");
		} else {
			System.out.println("월을 바르게 입력하셨습니다");
			this.month = month;
		}
	}
	
	public int getYear() {
		return this.year;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	
	
}
