package reference;

import java.util.Scanner;

public class CompareStr {

	public static void main(String[] args) {
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		System.out.println(str1 == str2);
		
		
		Scanner sc = new Scanner(System.in);
		
		User kim = new User("abc1234");
		
		System.out.print("비밀번호를 입력하세요 : ");
		String password = sc.next();
		
		System.out.println(password);
		System.out.println(kim.pw);
		
		System.out.println("--------------------");
		
		System.out.println("==연산자의 결과 : " + (password == kim.pw));//false
		System.out.println("eaquals의 결과 : " + password.equals(kim.pw));
		
		
		

	}

}
