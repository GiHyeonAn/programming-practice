package exception.runtime;

class Pen {
	
	void write() {
		System.out.println("글을 씁니다");
	}
	
}

public class NullPointerExample {

	public static void main(String[] args) {
		
		Pen p = new Pen();
		p = null;
		p.write();

	}

}
