package this_super;

public class Player { 

	 
	
	String name;
	int level;
	int atk;
	int hp;
	
	
	
	Player() {
		System.out.println("Player의 1번 생성자 호출");
//		System.out.println("this의 주소값 : " + this);
		level = 1;
		atk = 5;
		hp = 50;
	}
	
	Player(String name) {
		this();//첫번째 줄에 입력해야 합니다
		System.out.println("Player의 2번 생성자 호출");
//		System.out.println("this의 주소값 : " + this);
		this.name = name;
//		level = 1;
//		atk = 5;
//		hp = 50;
	}
	
	Player(String name, int hp) {
		this(name);
		System.out.println("player의 3번 생성자 호출");
//		this.name = name;
		this.hp = hp;
	}
	
	
	
	void characterInfo() {
		System.out.println("캐릭터정보");
		System.out.println("아이디 : " + name);
		System.out.println("레벨 : " + level);
		System.out.println("공격력 : " + atk);
		System.out.println("체력 : " + hp);
//		System.out.println("이 메서드를 부른 객체의 이름 : " + this.name);
	}
	
}
