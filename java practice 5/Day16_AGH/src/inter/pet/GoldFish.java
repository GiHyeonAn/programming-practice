package inter.pet;

public class GoldFish extends Fish implements IPet {

	@Override
	public void play() {
		System.out.println("금붕어는 어항에서 놀아요");
	}

	@Override
	public void swim() {
		System.out.println("금붕어는 어항에서 헤엄쳐요");
	}

}
