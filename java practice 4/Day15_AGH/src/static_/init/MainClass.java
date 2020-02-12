package static_.init;

public class MainClass {

	public static void main(String[] args) {
		
//		LapTop 11 = new LapTop();
//		System.out.println("노트북의 정보 : " + l1.info);
		
		/*
		 - 정적 초기화자를 호출하려면 클래스를 로딩해야 합니다
		 - 클래스 로딩 방법
		 1. 클래스 이름으로 정적 멤버를 호출
		 2. 객체를 생성함
		 - 정적 초기화자는 클래스 로딩 시 최초 1회만 호출됩니다
		 */
		
		LapTop l1 = new LapTop();
		LapTop l2 = new LapTop();
		
		
		System.out.println("노트북의 정보 : " + LapTop.info);

	}

}
