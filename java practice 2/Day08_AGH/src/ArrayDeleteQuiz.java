import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

	public static void main(String[] args) {
		
		String[] names = {"무지", "네오", "어피치", "라이언", "제이지"};
		System.out.print("현재 저장된 친구들 : ");
		System.out.println(Arrays.toString(names));
		
		Scanner sc = new Scanner (System.in);
		System.out.print("삭제할 카카오 친구 : ");
		String name = sc.next();
		
		/*
		 - 삭제할 별명을 입력받아서 해당 값을 삭제해 주세요
		 
		 - 삭제후 정보를 출력해 주세요
		 
		 - 없으면 없는 이름이라고도 출력해 주세요
		 */
		
		int i;
		
		for (i = 0; i < names.length-1; i++) {
			if (name.equals(names[i])) {
				System.out.println(names[i] + "의 이름을 삭제합니다");
				for (int j = 0; j < names.length-1; j++) {
					names[j] =  names[j+1];
				}
				break;
				
			}
		}
		
		if (i != name.length()) {
			String[] temp = new String[names.length-1];
			for(int k=0; k<temp.length; k++) {
				temp[k] = names[k];
			}
			names = temp;
			temp = null;
			System.out.println(Arrays.toString(names));
			
		} else {
			System.out.println("해당 이름은 존재하지 않습니다");
		}

		
		
		
		
		

	}

}
