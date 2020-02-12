
public class VarScopeExample {

	public static void main(String[] args) {
		
		/*
		  # 변수의 사용 범위
		  -변수는 선언된 블록을 빠져나가는 순간 메모리에서 자동으로 제거됩니다
		  -따사서 선언된 블록안에서만 변수를 참조할 수 있습니다
		 */
		
		// 같은 자료형을 변수로 선언 할 때는 콤마(,)로 나열할 수 있습니다
		int num1 = 10, num2 = 20;
		
		if(true) {
			int num3 = num1 + num2;
			System.out.println(num3);
		}  //end if

		int num3 = 200;
//		int num4 = num3 + 100;
		
		
		
	}
	
//	int num5 = num1 + num2; (x)

}
