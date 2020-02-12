package student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
	
	//student 객체가 생성되면 주소값을 기억 해 줄 리스트 선언
	static List<Student> sList = new ArrayList<>();

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			Point p = new Point();
			p.menuInfo();
			
			System.out.print("메뉴를 입력하세요 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
				
			case 1 : 
				p.inputPoints(sList);
				break;
			case 2 : 
				if(sList.isEmpty()) {
					System.out.println("등록된 학생 정보가 없습니다");
				} else {
					p.ShowAllPoints(sList);					
				}
				break;
			case 3 : 
				p.searchPoints(sList);
				break;
			case 4 : 
				p.modifyPoints(sList);
				break;
			case 5 : 
				p.deletePoints(sList);
				break;
			case 6 : 
				System.out.println("프로그램을 종료합니다");
				sc.close();
				System.exit(0);
			default : 
				System.out.println("메뉴를 잘못 입력하셨습니다");
			}
		}
		
		
		
		
		
		
	}

}
