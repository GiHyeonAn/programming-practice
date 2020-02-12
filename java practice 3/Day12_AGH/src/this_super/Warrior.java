package this_super;

public class Warrior extends Player {

	int rage;

	
	Warrior(String name) {
		super(name);
//		this.name = name;
		this.rage = 60;
	}
	
	
	@Override //alt shift s Override 클릭
	void characterInfo() {
		super.characterInfo();
		System.out.println("분노 : " + rage);
	} 
	

	
	
	
}
