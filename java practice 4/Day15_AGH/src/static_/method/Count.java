package static_.method;

public class Count {

	public int a; //인스턴스 변수
	public static int b; // 정적 변수
	
	/*
	 - 인스턴스 메서드 : 인스턴스 메서드 안에서는 정적(static)변수와 인스턴스 변수 
	 모두 참조할 수 있습니다
	 */
	
	public int method1() {
		return this.a + this.b;
	}
	
	/*
	 - 정적 메서드
	  static블록(메서드, 정적 초기화자) 내부에서는  static이 붙은 변수나 메서드만 사용할 수 있습니다
	  static블록 내부에서 non-static멤버를 참조하려면 반드시 객체를 통해서 참조해야 합니다
	 */
	
	public static int method2() {
		int i = 5;
//		return this.a + this.b; (x)
		Count ccc = new Count();
		return ccc.a + Count.b;
	}
	
	
	
	
}
