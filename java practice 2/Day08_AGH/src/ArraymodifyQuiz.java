import java.util.Arrays;
import java.util.Scanner;

public class ArraymodifyQuiz {

	public static void main(String[] args) {
		
		/*
		  - 배열을 선언하고 무지, 네오, 어피치, 라이언, 제이지를 저장하세요
		  
		  - 사용자에게 검색할 친구를 입력받아서 검색한 친구가 배열에 존재한다면 수정할 값을 다시 입력받으세요
		  
		  - 이름을 수정한 후에 "수정 후 결과 : ----" 를 출력해주세요
		  
		  - 사용자가 입력한 친구가 배열에 없다면 "xxx는 없는 이름입니다" 를 출력하세요
		  ex) 현재 저장된 친구들 :  [ㅇㅇㄹㅇㄹㅇㄹㅇㄹ]
		  수정할 카카오 친구 : 
		  000의 이름을 수정합니다
		  > 
		  변경 완료
		  변경후 정보 : [ㅇㄹㅇㄹㅇㄹㅇ]
		 */
		
		String[] names = {"무지", "네오", "어피치", "라이언", "제이지"};
		System.out.print("현재 저장된 친구들 : ");
		System.out.println(Arrays.toString(names));
		
		Scanner sc = new Scanner (System.in);
		System.out.print("수정할 카카오 친구 : ");
		String name = sc.next();
		int i;
		
		for (i = 0; i < names.length; i++) {
			if (name.equals(names[i])) {
				System.out.println(names[i] + "의 이름을 수정합니다");
				System.out.print("> ");
				names[i] = sc.next();
				System.out.println("변경 완료");
				System.out.print("변경 후 정보 : ");
				System.out.println(Arrays.toString(names));
				break;
			}
		}
		
		if (i == names.length) {
			System.out.println("없는 이름입니다");
		}
		
		sc.close();
		
		
		
	}

}
