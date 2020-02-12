package obj_array;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {
		
		/*
		 - 학생 점수를 토대로 객체를 생성하여 보고나할 배열을 선언하세요
		 배열 크기는 100개로 하겠습니다
		 - 스캐너를 사용하여 이름, 국어, 영어, 수학점수를 입력받으세요
		 - 총점과 평균(소수점 둘째자리까지)까지 계산한 후 한 학생의 객체를 생성하고 배열에 넣어주세요
		 - 이름을 입력받는 란에 '그만'이라고 입력하면 입력을 종료하고 반복문을 탈출시켜 주세요
		 - 반복문이 종료되면 학생의 이름과 성적 정보가 반복문을 통해 출력될 수 있도록 Scores클래스에
		 점수 정보에 대한 메서드를 선언한 후 반복 호출하여 모든 학생의 성적 정보를 표현해 주세요(scoresInfo)
		 */
		
		Scores[] scores = new Scores[100]; 
		int i;
		Scanner a = new Scanner(System.in);
		for(i = 0;i < scores.length;i++) {
			System.out.print("이름 : ");
			String name = a.next();
			if (name.equals("그만")) {
				break;
			}
			System.out.print("국어 : ");
			int korean = a.nextInt();
			System.out.print("영어 : ");
			int english = a.nextInt();
			System.out.print("수학 : ");
			int mathmatics = a.nextInt();
			
			Scores score = new Scores(name, korean, english, mathmatics);
			score.setTotal();
			score.setAverage();
			
			scores[i] = score;
			
		}
		
		for(Scores s : scores) {
			if(s == null)break;
			s.scoresInfo();
		}
		
		a.close();

	}

}
