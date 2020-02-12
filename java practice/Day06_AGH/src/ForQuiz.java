import java.util.Scanner;

public class ForQuiz {

	public static void main(String[] args) {
		
		/*
		 - 사용자에게 구구단 단수를 입력받은 후 해당 단수의 구구단을 출력해 보세요
		 ex) 단수를 입력하세요 : 4
		 *** 구구단 4단 ***
		 -----------------
		 4 x 1 = 4
		 -
		 -
		 -
		 -
		 */
		
//		Scanner a = new Scanner(System.in);
//		System.out.print("단수를 입력하세요 : ");
//		int num = a.nextInt();
		
		//랜덤 구구단 (2~19단)을 출력해 보세요
		
		int num = (int) ((Math.random()*18) + 2);
		
		System.out.printf("***구구단 %d단***\n",num);
		System.out.println("----------------");
		
		for(int c = 1; c <= 9; c++) {
			System.out.printf("%d x %d = %d\n",num,c,num*c);
		}
		
		

		
		
		
		
		
		

	}

}
