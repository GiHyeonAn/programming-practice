
public class TextualExample {

	public static void main(String[] args) {
		
		/*
		  # 단일 문자를 저장하는 데이터 타입 char
		  - 저장하고 싶은 문자를 홀따옴표('')에 담아 대입합니다(쌍따옴표x)
		 */
		
		char c1 = 'A';
		System.out.println(c1);
		
		char c2 = 65;
		System.out.println(c2);
		// 유니코드
		char c3 = 44032;
		System.out.println(c3);
		
		/*
		  # 문자열을 저장할 수 있는 데이터 타입 String
		  - 저장하고 싶은 문자열을 겹따옴표("")에 담아 대입합니다
		  - String은 기본 데이터 타입은 아니지만 자주 쓰이기 때문에 
		  기본 데이터 타입처럼 사용합니다 (참조 타입)
		 */
		
		String s1 = "my dream";
		String s2 = "is a programmer";
		System.out.println(s1);
		System.out.println(s2);
		
		//자바에서는 문자열의 덧셈 연산을 지원합니다
		//연산 결과로 문자열을 연결하여 결합한 결과가 도출됩니다
		
		System.out.println(s1 + s2);
		System.out.println(s1 + s2 + "omg");
		
		//문자열과 다른 데이터 타입간의 +연산
		System.out.println("----------------------");
		System.out.println(100 + 100);
		System.out.println("100" + "100");
		System.out.println("100" + 100);
		System.out.println(10 + 20 + "omg");
		System.out.println("aaa" + 30.11);
		
		
		
		
		

	}

}
