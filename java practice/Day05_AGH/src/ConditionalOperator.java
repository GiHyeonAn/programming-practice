
public class ConditionalOperator {

	public static void main(String[] args) {
		
		/*
		 # 3항 연산자
		 - 피 연산자가 3개인 연산자를 말합니다
		 - (조건식 ? 좌항 : 우항)
		 - 조건식을 비교하여 true가 도출되었을 시에 좌항을,
		 false가 도출되었을 시에는 우항의 식이 실행됩니다
		 */
		
//		System.out.println((5 == 4 ? "참입니다" : "거짓입니다"));
		String result = ((5 == 4 ? "참입니다" : "거짓입니다"));
		System.out.println(result);
		
		//난수(랜덤값)를 발생시키는 메서드 Math.random()
		//0.0이하 1.0미만의 랜덤 실수값을 반환합니다 (double)
//		double rn = Math.random();
//		System.out.println(rn);
		
		//1~10까지의 정수 난수를 발생시키고 싶어요
		int rn = (int) ((Math.random()*10) + 1); 
		// int rn = ((Math.random()*10) + 1); 커서를 갖다댄 후 첫번째 줄 선택
		
		
		//10~100까지 정수 난수
		int rn2 = (int) ((Math.random()*91) + 10);
		System.out.println(rn2);
		

	}

}
