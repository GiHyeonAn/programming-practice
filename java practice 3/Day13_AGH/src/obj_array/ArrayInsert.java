package obj_array;

import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		/*
		 - 객체를 생성하기 위해 필요한 회원정보를 스캐너를 통해 입력받으세요(이름, 나이, 성별)
		 - 입력받은 정보를 바탕으로 Person 객체를 생성하세요
		 - 입력은 배열의 크기만큼 받도록 하겠습니다. 배열의 크기는 3으로 통일하겠습니다
		 - 입력이 종료가 되면 입력받은 정보를 토대로 생성한 객체의 personInfo() 메서드를 
		 반복문을 사용하여 출력해 주세요
		 */
		
		Scanner a = new Scanner(System.in);
		int i = 0;
		
		for(i=0;i<3;i++) {
			System.out.println("***회원 정보 입력***");
			
			System.out.print("이름 : ");
			String b = a.next();
			System.out.print("나이 : ");
			int c = a.nextInt();
			System.out.print("성별 : ");
			String d = a.next();
			
			Person[] people = {
					new Person (b, c, d)	
			};
			
			for(Person p : people) {
				p.personInfo();
			}
			
			
			System.out.println("###정보 입력 성공###");
		}
		
		//잠시 후 다른 답안도 확인해 보세요(ArrayInsert2 class)
		
		
		
		

	}

}
