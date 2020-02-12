package static_.arrayprint;

public class MainClass {

	public static void main(String[] args) {
		
		String[] sArr = {"홍길동", "김철수", "박영희"};
		int[] iArr = {1,2,3};
		char[] cArr = {'A','B','C'};
		
//		ArrayPrint ap = new ArrayPrint();
		
//		ArrayPrint.printArray(sArr);
//		ArrayPrint.printArray(iArr);
//		ArrayPrint.printArray(cArr);
		
//		ap.printArray(sArr);
//		ap.printArray(iArr);
//		ap.printArray(cArr);
		
		ArrayPrint ap = ArrayPrint.getInstance();
		
		ap.printArray(sArr);
		ap.printArray(iArr);
		ap.printArray(cArr);
		
		/*
		 - ArrayPrint클래스 내의 메서드는 굳이 객체 생성을 해서
		 기능을 사용할 필요가 없을 것 같습니다
		 - 그래서 객체 생성을 할 수 없도록 변경해 주세요 (싱글톤 x)
		 - printArray()는 현재 String[]만 받을 수 있는 메서드입니다
		 메서드 오버로딩을 통해 int[]와 char[]도 받을 수 있도록 해 주세요
		 - 객체생성을 할 수 없어졌기 때문에 printArray()를 객체 주소값을 참조하지 않고도
		 사용할 수 있게 키워드를 추가하세요 그리고 MainClass에서 메서드를 호출해 보세요
		 
		 - 다 끝났으면 싱클톤 디자인 패턴으로도 구출해 보세요
		 */
		
		
		

	}

}
