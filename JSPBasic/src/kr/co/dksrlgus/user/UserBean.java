package kr.co.dksrlgus.user;

/*
자바 빈
- 자바빈은 데이터베이스와의 반복데이터 작업을 쉽게 처리하기 위한 클래스입니다
- 일반적으로 데이터베이스와의 컬럼과 1:1로 매칭되는 멤버변수를 선언합니다
- 자바빈 클래스는 은닉(캡슐화)을 사용하여 데이터를 보호합니다
*/

public class UserBean {
	
	private String id;
	private String pw;
	private String name;
	private String email;
	
	
	/*
	  	자바빈 클래스는 일반적으로 기본생성자 1개(필수)와 모든 멤버변수를 초기화하는
	  	생성자(선택)를 1개 선언합니다(생성자 선언은 굳이 선언할 필요가 없다)
	 */
	
	public UserBean() {}
	
	public UserBean(String id, String pw, String name, String email) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
	} //굳이 필요하진 않다

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
