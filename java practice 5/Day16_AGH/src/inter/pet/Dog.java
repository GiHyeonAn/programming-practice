package inter.pet;

public class Dog extends Animal implements IPet {

	@Override
	public void play() {
		System.out.println("강아지는 방에서 놀아요");
	}

	@Override
	public void eat() {
		System.out.println("강아지는 사료를 먹어요");
	}

}
