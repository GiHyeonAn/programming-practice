import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		
		String[] names = new String[10];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i<names.length; i++) {
			System.out.print("이름을 입력하세요 : ");
			String name = sc.next();
			
			/*
			 - 자바에서는 문자열 동등 비교시에 '=='연산자를 쓰면
			 제대로 비교가 되지 않습니다
			 
			 - 문자열 String 타입이 기본 데이터 타입이 아닌 객체 참조 타입이기 때문입니다
			 
			 - 그러므로 문자열 동등 비교를 진행할때는
			 비교 문자열 1. equals(비교문자열2)를 사용하여
			 문자열 동등 비교를 진행하셔야 합니다
			 */
			
			if(name.equals("그만")) {
				System.out.println("종료합니다");
				break;
			}
			
			names[i] = name;
			
		}
		
//		System.out.println(Arrays.toString(names));
		System.out.println("--------------------------");
		System.out.print("입력하신 이름 : [");
		for (String n : names) {
			if(n == null) break;
			System.out.print(n + " ");
		}
		System.out.println("]");
		
		sc.close();
		//null을 출력하고 싶지 않을 때 // 07에 저장
		
		
		
	}

}
