package obj_array;

public class Scores {
	
	/*
	 - 이름, 국어, 수학, 영어, 총점, 평균을 속성으로 가지는 클래스를 은닉 기술을 사용하여 구현해 주세요
	 - 생성자는 본인이 편한대로 선언하셔서 사용하세요. 기본 생성자는 하나 만드시는 것을 추천드립니다
	 */
	
	private String name;
	private int korean;
	private int mathmatics;
	private int english;
	private int total;
	private double average;
	
	
	public Scores(String name, int korean, int mathmatics, int english) {
		super();
		this.name = name;
		this.korean = korean;
		this.mathmatics = mathmatics;
		this.english = english;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getKorean() {
		return korean;
	}


	public void setKorean(int korean) {
		this.korean = korean;
	}


	public int getMathmatics() {
		return mathmatics;
	}


	public void setMathmatics(int mathmatics) {
		this.mathmatics = mathmatics;
	}


	public int getEnglish() {
		return english;
	}


	public void setEnglish(int english) {
		this.english = english;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal() {
		this.total = this.korean + this.mathmatics + this.english;
	}//더한 값을 직접 입력


	public double getAverage() {
		return average;
	}


	public void setAverage() {
		this.average = this.total/3.0;
	}


	public void scoresInfo() {
		System.out.printf("학생 이름 : %s\n", this.name);
		System.out.println("-----------------------");
		System.out.printf("국어 : %d점 영어 : %d점 수학 : %d점\n", this.korean, this.mathmatics, this.english);
		System.out.printf("총점 : %d점 평균 : %.2f점",this.total,this.average);
	}
	
	
	

}
