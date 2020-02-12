package api.lang.system;

public class SystemTime {

	public static void main(String[] args) {
		
		/*
		 - System클래스가 제공하는 currentTimeMillis()와
		 nanoTime()메서드는 1970년 1월 1일 자정을 기준으로
		 현재까지의 시간을 초로 변환한 유닉스 시간을 각각 long타입의
		 밀리초(1/1000), 나노초(1/10^9)로 리턴합니다
		 */
		
//		System.out.println(System.currentTimeMillis());
		
		
		long start = System.currentTimeMillis();
		
		long sum = 0;
		for(long i = 1; i<10000000000L; i++) {//long에서 100억 이상일 경우 뒤에 L을 붙인다
			sum += i;
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("실행에 걸린 시간 : " + (end - start) * 0.001 + "초");
		
		
		
	}

}
