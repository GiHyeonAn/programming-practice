package this_super;

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
	
	
	
}
