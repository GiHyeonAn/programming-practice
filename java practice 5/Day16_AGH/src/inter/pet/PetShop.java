package inter.pet;

public class PetShop {
	
	/*
	 - instanceof 키워드를 사용하여 pet과 연관된 객체들이 메서드의 매개변수를 통해 들어왔을 때
	 ex)강아지를 돌봅니다 등의 형식이 각 객체에 맞게 출력될 수 있도록 로직을 작성해 보세요
	 -메서드 이름은 void carePet(???)
	 - MainClass에서 carePet()을 호출해서 강아지 고양이 금붕어 다 출력해 보세요
	 */
	
	public void carePet(IPet p) {
		if(p instanceof Dog) {
			System.out.println("강아지");
		} else if (p instanceof Cat) {
			System.out.println("고양이");
		} else if (p instanceof GoldFish) {
			System.out.println("금붕어");
		}
	}
	

}
