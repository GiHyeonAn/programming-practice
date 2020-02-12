package poly.player;

public class Player { 

	 
	
	
	String name;
	int level;
	int atk;
	int hp;
	
	
	Player() {

		level = 1;
		atk = 5;
		hp = 50;
	}
	
	Player(String name) {
		this();
		this.name = name;
//		level = 1;
//		atk = 5;
//		hp = 50;
	}
	
	Player(String name, int hp) {
		this(name);
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
