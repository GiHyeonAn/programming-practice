
public class AssignmentOperator {

	public static void main(String[] args) {
		
		/*
		 - 대입 연산자(=, +=, -=, *=, ....)
		 - 변수에 값을 대입할 때 사용하는 연산자 입니다
		 */
		
		int a = 5, b = 5;
		
		a += 3; //a = a + 3
		System.out.println(a);
		
		b =+ 3;  //b = +3 (양수 3)
		System.out.println(b);
		
		b =- 2; //b = -2 (음수 2)
		System.out.println(b);
		
		System.out.println("--------------");

		a -= 4;//a = 8 - 4 = 4
		System.out.println(a);
		
		a *= 6;//a = 4 x 6 = 24
		System.out.println(a);
		
		a /= 5;//a = 24 / 5 = 4
		System.out.println(a);
		
		a %= 3;//a = 1 
		System.out.println(a);
		
		
		

	}

}
