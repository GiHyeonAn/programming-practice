package kr.co.dksrlgus.score.model;



public class Scores {
	
	private Long id;
	private String name;
	private Integer kor;
	private Integer eng;
	private Integer math;
	private Integer total;
	private Double average;
	
	public Scores() {}
	
	//generate using field
	public Scores(Long id, String name, Integer kor, Integer eng, Integer math, Integer total, Double average) {
		super();
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.average = average;
	}
	
	//getter setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getKor() {
		return kor;
	}

	public void setKor(Integer kor) {
		this.kor = kor;
	}

	public Integer getEng() {
		return eng;
	}

	public void setEng(Integer eng) {
		this.eng = eng;
	}

	public Integer getMath() {
		return math;
	}

	public void setMath(Integer math) {
		this.math = math;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal() {
		this.total = this.kor + this.eng + this.math;
	}

	public Double getAverage() {
		return average;
	}

	public void setAverage() {
		this.average = this.total / 3.0;
	}
	
	
	

}
