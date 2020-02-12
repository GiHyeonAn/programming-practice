
public class PhoneFactory {

	public static void main(String[] args) {
		
		Phone basic = new Phone(); // 출력결과 : 기본 생성자 호출
		basic.showSpec(); 
//출력결과 :  *** 핸드폰의 정보 ***
//		  # 모델명 : 애니콜
//		  # 색상 : 회색
//		  # 가격 : 200000
		Phone galaxyNote10 = new Phone("갤럭시 노트 10");
		galaxyNote10.showSpec();
		
		Phone iPhone11 = new Phone("아이폰11", "화이트");
		iPhone11.showSpec();

	}

}
