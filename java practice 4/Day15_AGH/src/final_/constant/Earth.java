package final_.constant;

public class Earth {

	/*
	 - 상수(constant)
	 - 상수는 고정된 불변의 값입니다. 따라서 어디에서 접근해도
	 같은 값이 나와야 하며, 값 변경도 불가능해야 합니다
	 - 따라서 자바에서는 상수를 선언할 때  static, final을 함께 사용합니다
	 - 자바에서는 상수를 대문자로 입력하는것이 관례
	 */
	
	static final double RADIUS = 6400; //이클립스에서는 상속일 때 기울임과 굵은 글씨로 표시된다
	static final double SURFACE_AREA;
	static {
		SURFACE_AREA = RADIUS * RADIUS * Math.PI * 4;
	}
	
	public static void main(String[] args) {
		System.out.println("지구의 반지름 : " + Earth.RADIUS + "km");
		System.out.println("지구의 표면적 : " + Earth.SURFACE_AREA + "km");
	}
	
	
}
