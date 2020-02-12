import java.util.Arrays;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		String[] week = {"월","화","수","목","금","토","일"};
		
//		for(int i = 0; i<week.length; i++) {
//			System.out.println(week[i] + "요일");
//		}
		
		for(String day : week) {
			System.out.println(day + "요일");
		}
		
		/*
		 - scores라는 int배열을 하나 선언해서 점수 데이터를 저장하세요
		 ex) [96,88,74,63,100,55]
		 
		 -향상 for문 (foreach)을 사용하여 총점과 평균을 구해보세요
		 총점(int), 평균(double, 소수점 둘재 자리까지 출력)
		 */
		
//		int[] scores;
//		scores = new int[6];
//		scores[0] = 96;
//		scores[1] = 88;
//		scores[2] = 74;
//		scores[3] = 63;
//		scores[4] = 100;
//		scores[5] = 55;
//		System.out.println(Arrays.toString(scores));
		
		int[] scores = {96, 88, 74, 63, 100, 55};
		int total = 0;
		
		
		for (int s : scores) {
			total += s;
		}
		
		
		double avg = (double)total / scores.length;
		
		System.out.printf("총점 : %d점, 평균 : %.2f점\n", total, avg);
		
		
		
		
		

	}

}
