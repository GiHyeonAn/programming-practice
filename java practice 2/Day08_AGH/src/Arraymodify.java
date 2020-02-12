import java.util.Arrays;
import java.util.Scanner;

public class Arraymodify {

	public static void main(String[] args) {
		
		String[] foods = {"삼겹살","족발","피자","햄버거"};
		System.out.println(Arrays.toString(foods));
		
		foods[2] = "짜장면";
		foods[0] = "탕수육";
		System.out.println(Arrays.toString(foods));
		
		System.out.println("---------------------------------");
		
		//배열의 인덱스 번호 탐색
		
		Scanner sc = new Scanner(System.in);
		System.out.print("탐색할 음식을 입력하세요 : ");
		String name = sc.next();
		int idx;
		
		for(idx = 0; idx<foods.length; idx++) {
			if (name.equals(foods[idx])) {
				System.out.println("탐색 완료!");
				System.out.println("인덱스 번호 : " + idx + "번");
				break;
			} 
		}
		if (idx >= 4) {
			System.out.println("없는 음식입니다");
		}
		
		

	}

}
