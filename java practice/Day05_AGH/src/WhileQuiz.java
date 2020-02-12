
public class WhileQuiz {

	public static void main(String[] args) {
		
		/*
		 - 1~1000까지의 정수 중 3의 배수의 합을 구해보세요 (if)
		 - 다 하신분은 3항 연산식을 이용해서도 구해보세요
		 */
		
		int n = 1;
		int t = 0;
		while (n <= 1000) {
			if (n % 3 == 0) {
				t += n;
			}
			n ++;
		}
		System.out.println(t);
		System.out.println();
		
		int c = 1;
		int d = 0;
		while (c <= 1000) {
			d = (c%3 == 0 ? d += c : d);//조건식을 만족하지 못했을 경우 total값에 변화를 주지 말아라
			c++;
		}
		System.out.println(d);
		
		
		

	}

}
