package api.lang.wrapper;

import java.util.Arrays;

public class WrapperExample {

	public static void main(String[] args) {
		
		int a = 100;
		boolean b = false;
		char c = 'A';
		double d = 5.56;
		
		//Boxing : 기본 데이터 타입을 참조 타입으로 변환하는 과정
		Integer v1 = new Integer(a);//값이 변경 불가
		Double v2 = new Double(d);
		Character v3 = new Character(c);
		Boolean v4 = new Boolean(b);
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		
		//AutoBoxing : new 연산자의 사용 없이 객체로 포장을 수행
		Integer x1 = a;
		Double x2 = d;
		Character x3 = c;
		Boolean x4 = b;
		Byte x5 = 50;
		
		//Unboxing : 객체화 된 타입을 기본 데이터 타입으로 변환
		int i = x1;
		double j = x2;
		
		Object[] oArr = {x1,x2,x3,x4,x5,100};
		System.out.println(Arrays.toString(oArr));
		
		//문자열 변환 기능
		//Wrapper클래스명.parse+기본타입명(문자열 or 문자열이 들어있는 변수)
		String s1 = "10";
		String s2 = "3.14";
		
		System.out.println(s1 + s2);
		
		int k = Integer.parseInt(s1);
		double m = Double.parseDouble(s2);
		
		System.out.println(k + m);
		
		
		
		
	}

}
