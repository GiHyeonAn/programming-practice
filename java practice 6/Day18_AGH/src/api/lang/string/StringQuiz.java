package api.lang.string;

import java.util.Scanner;

public class StringQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호를 입력하세요 : ");
		String ssn = sc.next();
		
		//921013-1234567
		System.out.println("앞자리 : " + ssn.substring(0, 6));
		System.out.println("뒷자리 : " + ssn.substring(7));
		
		//정수로 이루어진 문자열을 실제 정수값으로 바꾸는 메서드
		//int 변수 = Integer.parseInt(문자열 or 문자열이 들어있는 변수);
		//반드시 순수한 정수로만 이루어진 문자열을 정수로 변환할 수 있습니다
		
//		int front = Integer.parseInt(ssn.substring(0, 6));
//		System.out.println(front + 1);
		
		int c = ssn.charAt(7);
		int year = Integer.parseInt(ssn.substring(0, 2));
		int month = Integer.parseInt(ssn.substring(2, 4));
		int day = Integer.parseInt(ssn.substring(4, 6));
		
		if (c == 1) {
			System.out.printf("%d년 %d월 %d일 %d세 남자", year, month, day, 119 - year);
		} else if (c == 2) {
			System.out.printf("%d년 %d월 %d일 %d세 여자", year, month, day, 119 - year);
		} else if (c == 3) {
			System.out.printf("%d년 %d월 %d일 %d세 남자", year, month, day, 19 - year);
		} else if (c == 4) {
			System.out.printf("%d년 %d월 %d일 %d세 여자", year, month, day, 19 - year);
		}
		
		
		//답안 확인 후 다시 구현해 볼 것!!!
		
//		int year = Integer.parseInt(ssn.substring(0, 2));
//		int month = Integer.parseInt(ssn.substring(2, 4));
//		int day = Integer.parseInt(ssn.substring(4, 6));
//		
//		String gender;
//		
//		if(ssn.charAt(7) == '1' || ssn.charAt(7) == '3') {
//			gender = "남자";
//		} else {
//			gender = "여자";
//		}
//		
//		int birthYear = 0;
//		if(ssn.charAt(7) == '1' || ssn.charAt(7) == '2') {
//			birthYear = 1900 + year;
//		} else {
//			birthYear = 2000 + year;
//		}
//		
//		int age = 2019 - birthYear;
//		
//		System.out.printf("%d년 %d월 %d일 %d세 %s"
//				, birthYear, month, day, age, gender);
		
		
	}

}
