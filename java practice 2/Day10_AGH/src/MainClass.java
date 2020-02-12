
public class MainClass {

	public static void main(String[] args) {
		
		/*
		 - 객체를 생성하지 않았을 때의 예시를 보고
		 빵 객체를 생성할 수 있는 클래스(설계도)를 작성해 보세요
		 -클래스 이름은 Bread로 통일하겠습니다
		 -MainClass에서 똑같이 피자빵과 초코케이크, 야채고로케를 호출해보세요
		 */
		
		
		Bread pizza = new Bread("피자빵", 1000);
		pizza.info();
		
		Bread c = new Bread("초코케이크", 1500);
		c.info();
		
		Bread y = new Bread();
		y.name = "야채고로케";
		y.price = 2000;
		y.info();
		
		

	}

}
