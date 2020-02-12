package student;

import java.util.List;
import java.util.Scanner;

public class Point {
	
	Scanner sc = new Scanner(System.in);
	
	// 점수 입력창 틀 메서드.
	public static void showPointUI() {
		System.out.println("================================================================");
		System.out.printf("%4s%10s%13s%13s %12s%13s%13s%13s\n"
				, "학번", "이름", "국어", "영어", "수학", "총점", "평균", "학점");
		System.out.println("================================================================");
	}
	
	//프로그램 메뉴 정보를 보여줄 메서드.
	public void menuInfo() {
		System.out.println("\n*** 성적 관리 프로그램 ***");
		System.out.println("# 1. 성적 정보 입력");
		System.out.println("# 2. 전체 성적 조회");
		System.out.println("# 3. 개별 성적 조회");
		System.out.println("# 4. 성적 정보 수정");
		System.out.println("# 5. 성적 정보 삭제");
		System.out.println("# 6. 프로그램 종료.");
		System.out.println("***********************");
	}

	//1. 학생의 성적 정보를 입력할 메서드
	public void inputPoints(List<Student> students) {
		/*
		 - 학생의 객체를 1개 생성합니다
		 - 학생의 객체에 속성값을 설정하는 메서드들을 호출해야 합니다
		 - 정보 저장이 완료된 객체를 리스트(sList)에 추가합니다
		 - 저장완료 메세지를 출력합니다
		 ex) XXX님의 성적정보가 정상적으로 입력되었습니다
		 */
		Student stu = new Student();
		stu.inputStuInfo();
		stu.calcTotAvgGradd();
		students.add(stu);
		
		System.out.printf("%s님의 성적 정보가 정상적으로 입력되었습니다", stu.getName());
	}
	
	//2. 전체 학생들의 성적 정보를 출력할 메서드
	public void ShowAllPoints(List<Student> stu) {
		/*
		 - 리스트 안에 들어있는 학생 객체들의 정보들을 
		 반복문을 이용하여 하나씩 전체 출력해야 합니다
		 
		 - 우리반의 반 평균을 가장 아랫부분에 출력해야 합니다
		 */
		
		double totalAvg = 0.0;
		showPointUI();
		for(Student s : stu) {
			totalAvg += s.getAvg();
			s.outputStuInfo();
		}
		System.out.println("-------------------------------------------------------------");
		System.out.printf("\t\t\t\t 우리반 전체 평균 : %.2f점", (totalAvg/stu.size()));
		
		
	}
	
	//3.개별 성적 조회 로직을 처리할 메서드
	public void searchPoints(List<Student> students) {
		
		/*
		 - 해당 학번과 일치하는 학생 객체를 리스트에서 찾아내서 
		 그 학생의 정보만 출력해야 합니다
		 
		 - 찾는 학번이 없을 때는 검색하지 못해?ㅆ다는 메세지를 출력해야 합니다
		 */
		
		System.out.println("성적을 조회할 학생의 학번을 입력하세요");
		System.out.print("=> ");
		String stuNum = sc.next();
		
		boolean flag = false;
		for (Student stu : students) {
			if(stuNum.equals(stu.getStuId())) {
				System.out.printf("%s님의 성적 정보를 출력합니다\n", stu.getName());
				showPointUI();
				stu.outputStuInfo();
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("조회하신 학번 정보는 등록되지 않았습니다");
		}
		
	}
	
	
	//4. 학생의 개인 성적 정보를 수정하는 메서드
	public void modifyPoints(List<Student> students) {
		/*
		 - 해당 학번과 일치하는 학생 객체를 리스트에서 찾아내어
		 그 학생의 국어, 영어 , 수학 점수를 새롭게 입력받아
		 수정을 진행해야 합니다
		 
		 - 찾는 학번이 없을 시 검색하지 못했다는 메세지를 출력해야 합니다
		 */
		
		System.out.print("학번을 입력하세요 : ");
		String stuNum = sc.next();
		boolean flag = false;
		for(Student stu : students) {
			if(stuNum.equals(stu.getStuId())){
				System.out.printf("%s님의 성적 정보를 수정합니다\n", stu.getName());
				
				System.out.print("국어 : ");
				stu.setKor(sc.nextInt());
				System.out.print("영어 : ");
				stu.setEng(sc.nextInt());
				System.out.print("수학 : ");
				stu.setMath(sc.nextInt());
				stu.calcTotAvgGradd();
				System.out.println("성적 수정이 정상 처리되었습니다");
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("등록되지 않은 학번 입니다");
		}
	}
		
	//5. 학생 정보를 삭제하는 메서드
	public void deletePoints(List<Student> students) {
		
		/*
		 - 해당학번과 일치하는 학생 객체를 리스트에서 찾아내어 
		 그 학생의 모든 정보를 삭제해야 합니다
		 학생 정보를 삭제할 때 "XXX님의 정보를 삭제합니다 [Y/N]"
		 를 출력하셔서 한번 더 삭제 여부를 확인해 주세요
		 
		 - 찾는 학번이 없을 시 검색하지 못했다는 메세지를 출력하세요
		 */
		
		System.out.print("삭제하실 학생의 학번을 입력하세요 : ");
		String stuNum = sc.next();
		
		boolean flag = false;
		for (Student stu : students) {
			if (stuNum.equals(stu.getStuId())) {
				System.out.printf("%d님의 정보를 삭제합니다 [Y/N]\n", stu.getName());
				System.out.println("=> ");
				String answer = sc.next();
				
				if (answer.toLowerCase().equals("y")) {
					students.remove(stu);
					System.out.println("정상 처리되었습니다");
				} else {
					System.out.println("삭제를 취소합니다");
					return;
				}
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("등록되지 않은 학번 입니다");
		}
		
		
	
		
		
		
	
		
		
	}
	
	
	
	
	

}
