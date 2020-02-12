package this_super;

public class Hunter extends Player{

	String pet;
	
	Hunter(String name) {
		super(name);
		this.pet = "개";
	}
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("애완동물 : " + pet);
	}

	
	
	
}
