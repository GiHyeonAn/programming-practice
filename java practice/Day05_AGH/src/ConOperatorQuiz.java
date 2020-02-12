
public class ConOperatorQuiz {

	public static void main(String[] args) {
		
		/*
		  -Math.random()을 사용하여 1~100까지의 랜덤정수를 발생시키세요
		  
		  -랜덤값이 짝수라면 "짝수입니다", 홀수라면 "홀수입니다"를 출력하는 3항 연산식을 세워보세요
		 */
		
		int rn = (int) ((Math.random()*100) + 1);
		System.out.println(rn);
		
		String result = (rn%2 == 0 ? "짝수" : "홀수");
		System.out.println("3항 연산의 결과 : " + result);
		
		
		
		
		
		
		

	}

}
