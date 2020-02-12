package exception.throws_;

public class ThrowsExample2 {
	
	private void aaa(int i) throws Exception {
		System.out.println("aaa 호출");
		int n = 10/i;
	}
	
	private void bbb() throws Exception {
		System.out.println("bbb 호출");
		aaa(0);
	}
	
	private void ccc() throws Exception {
		System.out.println("ccc 호출");
//		bbb();
	}
	
	public ThrowsExample2() throws Exception {
		System.out.println("생성자가 호출됨");
		ccc();
	}

	public static void main(String[] args) {
		
		try {
			ThrowsExample2 t = new ThrowsExample2();
			t.bbb();
		} catch (Exception e) {
			e.printStackTrace();
			//printStackTrace메서드는 예외 발생 원인을 추적하여
			//예외가 어디에서 발생했는지, 그 이유는 무엇인지를
			//메세지를 통하여 개발자에게 전달합니다
			System.out.println("예외가 Main까지 전달됨");
		}
		
		System.out.println("프로그램 정상 종료");
		
		
		
		
	}

}
