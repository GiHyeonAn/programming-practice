
public class ForExample {

	public static void main(String[] args) {
		
		//1~10까지의 누적합을 구하는 로직
		
		int total = 0;
//		int n = 1; 
//		
//		while(n <= 10) {
//			total += n;
//			n++;
//		}
		
		for(int n = 1; n <= 10; n++) {
			total += n;
		}
		
		
		//48~150사이의 정수 중 8의 배수를 for를 사용하여 가로로 출력하세요
		
		for(int a = 48; a <= 150; a++) {
			if (a%8 == 0) {
				System.out.print(a + " ");
			}
		}
		System.out.println(" ");
		
		//1~60000까지의 정수 중 177의 배수의 갯수를 구해보세요
		int t = 0;
		for(int b = 1; b <= 60000; b++) {
			if (b%177 == 0) {
				t ++;
			}
		}
		System.out.println(t);
		
		

	}

}
