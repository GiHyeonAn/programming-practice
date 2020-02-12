package exception.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);

		try {
			System.out.print("정수 : ");
			int n= sc.nextInt(); //InputMisMatchException

			int result = 100 / n; //ArithmeticException

			String s = null; //NullPointerException
			s.equals("어이");
		} catch (InputMismatchException | ArithmeticException e) {//두개가 상속관계이면 안됩니다 ex)Exception|ArithmeticException e (x)
			System.out.println("입력값이 잘못되었거나 0이 입력되었습니다");
		} catch (NullPointerException e) {
			System.out.println("null값을 참조해서 발생하는 오류입니다");
		} catch(Exception e) {//상위(부모)클래스타입이 위에 있으면 안됩니다 항상 마지막열에 입력 ex)Exception
			System.out.println("알수 없는 예외가 발생");
		}


		//ctrl a ctrl i : 정렬


	}

}
