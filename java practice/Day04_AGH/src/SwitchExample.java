import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int point = sc.nextInt();
		
		/*
		 - switch 키워드 뒤에 나오는 괄호 안에는 변수나 변수의 연산식을 적어야 하며,
		 타입은 정수, 문자 타입만 가능합니다
		 */
		
		switch(point/10) {
		case 10 :
			if (point > 100) {
				System.out.println("점수를 잘못 입력하셨습니다");
				break;
			}
//			System.out.println("A입니다");
//			break;
		case 9:
			System.out.println("A입니다");
			break;
		case 8:
			System.out.println("B입니다");
			break;
		case 7:
			System.out.println("C입니다");
			break;
		case 6:
			System.out.println("D입니다");
			break;
		default :
			if (point > 100 || point < 0) {
				System.out.println("점수를 잘못 입력하셨습니다");
			} else {
				System.out.println("F입니다");
			}
			
	} 
		
		
		
		
	}

}
