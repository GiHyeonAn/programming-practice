package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListDelete {

	public static void main(String[] args) {
		
		List<String> kakao = new  ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		kakao.add("무지");kakao.add("네오");kakao.add("어피치");
		kakao.add("라이언");kakao.add("제이지");
		
		System.out.println("현재 저장된 친구들 : " + kakao);
		System.out.print("삭제할 카카오 친구 : ");
		String name = sc.next();
		
		kakao.remove(name);
		System.out.println(kakao);
		
		sc.close();
		
		
		
		
		
		
	}

}
