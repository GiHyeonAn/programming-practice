package poly.player;

public class Mage extends Player{

	int mana;
	
	Mage(String name) {
		super(name);
		this.mana = 55;
	}
	
	void characterInfo() {
		super.characterInfo();
		System.out.println("마나 : " + mana);
	} 
	
	public void blizzard(Player[] player) {
		System.out.printf("%s님이 눈보라 시전!!!\n", this.name);
		System.out.println("------------------------------------");
		for(Player p :player) {
			int damage = (int) ((Math.random()*6) + 10);
			p.hp -= damage;
			System.out.printf("%s님이 %d의 피해를 입었습니다 (남은체력 : %d)\n", p.name, damage, p.hp);
		}
	}
	
	
	
}
