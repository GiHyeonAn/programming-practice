package inherit.good;

/*
  - 자식 클래스, 하위 클래스(Child, Sub Class)
  
  - 부모 클래스로부터 멤버면수(필드)와 메서드를 물려받는 클래스를 자식클래스라고 합니다
  - 상속을 적용시키려면 자식 클래스의 선어부의 클래스 이름 뒤에 키워드  extends 를 쓰고
  물려받을 부모 클래스의 이름을 적으시면 됩니다
 */

public class Warrior extends Player {

	int rage;

	@Override //alt shift s Override 클릭
	void characterInfo() {
		super.characterInfo();
		System.out.println("분노 : " + rage);
	} 
	
//	void characterInfo() {
//		super.characterInfo();//물려받은 매서드를 그대로 유지하고 싶을 때 사용
//		System.out.println("분노 : " + rage);//부모로 부터 물려받은 매서드를 아예 처음부터 재정의
//	} 
	
	//
	
	
	
}
