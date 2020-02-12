
/*
 - 멤버 변수 (field, class member variable)
 1. 클래스 블록에 선언된 변수를 의미합니다
 2. 메모리의 heap 영역에 저장되며,값을 초기화하지 않아도 
 각 데이터 타입의 기본값으로 자동 초기화됩니다
 3. 객체를 가리키고 있는 레퍼런스 변수(참조변수)가 사라지거나 
 주고값을 잃어버리게 되면, 메모리에서 가비지 컬렉터(gc)에 의해 자동으로 제거됩니다
 
 -지역 변수(local variable)
 1. 메서드나 생성자 블록 내부에서 선언된 변수를 의미합니다
 2. 메모리의 stack영역에 저장되며 선언된 블록을 벗어나면 메모리에서 자동으로 제거됩니다
 3. 값을 초기화하지 않으면 변수를 사용할 수 없습니다
 */

public class MemberLocalVariable {
	
	int a; //멤버 변수
	
	
	void printNumber(int c) { //매개 변수
		int b = 1; // 지역 변수
		System.out.println("멤버변수 : " + a);
		System.out.println("지역변수 : " + b);
		System.out.println("매개변수 : " + c);
	}

	public static void main(String[] args) {
		
		
//		printNumber(4); //실체가 없어서 출력 안됩니다
		MemberLocalVariable m = new MemberLocalVariable();
		m.printNumber(4);
		System.out.println(m.a); //항상 주소값을 참조하여야 한다
		
		
		
		
		
		
		
		
		
		

	}

}
