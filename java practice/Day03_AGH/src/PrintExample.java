
public class PrintExample {

	public static void main(String[] args) {
		
		//자바의 표준 출력 형식은 크게 3가지입니다
		//개행(엔터를 치지 않음)을 포함하지 않는 print()
		//자동 개행을 포함하는 println()
		System.out.print("oi");
		System.out.println("안녕하세요");
		System.out.println();
		System.out.print("bye");
		System.out.println("qkdlqkdl");
		
		System.out.println("--------------");
		
		//형식 지정 표준 출력 함수 printf(), 줄개행기능이 없습니다
		
		int month = 12;
		int day = 25;
		String anni = "christmas";
				
		System.out.println(month + "월" + day + "일은" + anni + "입니다");
		
		System.out.printf("%d월 %d일은 %s입니다\n",month, day, anni);
		// \n은 문자열 안에 입력해야 합니다
		System.out.printf("지금 시간은 %d시 %d분 입니다\n %s요일입니다\n",3, 14, "월");
		
		/*
		 %d = 부호가 있는 10진수 정수 데이터
		 %s = 문자열 데이터 (String)
		 %f = 실수 데이터 
		 \n = 줄바꿈 (enter)
		 \t = tab 정렬
		 */
		
		System.out.println("--------------");
		
		/*
		 -%f는 기본적으로 소수점 6자리까지 표현하도록 설계되어 있습니다
		 -만약 자리수를 조절하려면 %.[자리수에 해당하는숫자]f를 사용합니다
		 */
		
		double rate = 63.456;
		System.out.printf("시험 합격율: %.2f%%", rate);
		//%를 문자로 나타내려면 %%를 사용한다
		
		
		
		

	}

}
