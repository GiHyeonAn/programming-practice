package exception.throws_;

public class ThrowsExample1 {

	static String[] greetings = {"hello", "안녕", "nihao"};

	/*
	 - throws
	 - throws는 예외의 원인이 메서드 선언부가 아닌 호출부에 있을 경우 
	 예외 처리를 메서드의 호출부로 떠넘기는 방식입니다
	 - throws는 생성자에서도 선언이 가능하며, 메서드나 생성자 호출 시 
	 예외처리를 강요하고 싶을 때 사용합니다
	 */
	
	static void greet(int idx) throws Exception {
		System.out.println(greetings[idx]);

	}

	public static void main(String[] args) {

		try {
			greet(3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}





	}

}
