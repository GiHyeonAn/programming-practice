
public class CastingExample2 {

	public static void main(String[] args) {
		
		/*
		 - 크기가 큰 데이터 타입의 값을 작은 데이터 타입으로 변환하려면
		 반드시 형 변환 연산자: (type)를 사용하여 명시적으로
		 형 변환을 진행해야 합니다 (Downcasting, Type Casting)
		 
		 - 명시적으로 형 변환을 하는 이유는 Downcasting의 경우
		 저장공간이 줄어들기 때문에 데이터 손실의 가능성이 있습니다
		 (overflow) 
		 */
		
		int i = 72;
		char c = (char) i; //add cast to 'char' 를 클릭
		System.out.println("72의 문자값 :"+ c);
		
		double d = 4.98765;
		int j = (int) d;
		System.out.println(j);
		
		int k = 1000;
		byte b = (byte) k;
		System.out.println(b);
		
		
		

	}

}
