package api.lang.stringbuilder;

public class StrTest {

	public static void main(String[] args) {
		
		//String 속도 체크
		
		long start;
		long end;
		
//		start = System.currentTimeMillis();
//		
//		String str = "A";
//		
//		for(int i =0; i<500000;i++) {
//			str = str + "A";
//		}
//		
//		end = System.currentTimeMillis();
//		
//		System.out.println("String의 실행시간 : " + (end - start) * 0.001 + "초");
		
		//StringBuilder 속도 체크
		
		start = System.currentTimeMillis();
		
		StringBuilder sb = new StringBuilder("A");
		
		for(int i =0; i<50000000;i++) {
			sb.append("A");
		}
		
		
		end = System.currentTimeMillis();
		
		System.out.println("StringBuilder의 실행시간 : " + (end - start) * 0.001 + "초");
		
		
		double b = 3.141592;
		System.out.println(Math.round(b*100)*0.01);
		
		System.out.printf("%.3f", b);
		
		
		
		
	}

}
