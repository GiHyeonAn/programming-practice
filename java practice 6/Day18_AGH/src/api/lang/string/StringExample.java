package api.lang.string;

import java.util.Arrays;

public class StringExample {

	public static void main(String[] args) {
		
		String s1 = "hello java";
		
		//charAt(index) : 문자열의 특정 인덱스의 문자값을 리턴
		char c = s1.charAt(4);
		System.out.println("4번 인덱스의 문자값 : " + c);
		
		//substring(index) : 문자열의 특정 범위의 문자를 추출
		String s2 = s1.substring(6); // 인텍스 6번부터 끝까지 추출
		System.out.println(s2);
		
		//0~5번 미만까지 추출(끝값이 미만으로 처리됨)
		System.out.println(s1.substring(0, 5));
		
		//length(): 문자열의 총 길이를 리턴
		System.out.println("s1의 총 문자 갯수 : " + s1.length());
		
		//indexOf(문자열) : 특정 단어의 인덱스를 리턴
		//단어를 검색하면 해당 단어의 첫 글자의 인덱스를 리턴
		//찾는 단어가 없다면 -1로 리턴
		
		//hello java
		int idx = s1.indexOf("o");
		System.out.println("o의 인덱스 : " + idx);
		
		idx = s1.indexOf("java");
		System.out.println("java의 첫글자 인덱스 : " + idx);//첫글자를 리턴합니다
		
		idx = s1.indexOf("안녕");
		System.out.println(idx);
		
		//toLowerCase(), toUpperCase() 
		//문자열을 각각 소문자, 대문자로 일괄 변경
		
		String s4 = "Hello JAVA WOrlD";
		System.out.println(s4.toLowerCase());
		System.out.println(s4.toUpperCase());
		
		//trim() : 문자열의 앞 뒤 공백을 제거
		String name = "         홍길동           ";
		System.out.println(name.trim() + "님 안녕하세요");
		
		//replace(old, new)
		//문자열 내부에 old문자값을 전부 찾아 new 문자열로 일괄 대체
		String java = "java study, java program, java coffee";
		System.out.println(java.replace("java", "자바"));
		System.out.println(java.replace(",", ""));
		
		//split(구분문자열)
		//문자열을 구분문자열 기준으로 분리하여 String[]로 리턴
		String pet = "강아지, 고양이, 짹짹이";		
		String[] pets = pet.split(", ");
		System.out.println(Arrays.toString(pets));
		System.out.println(pets[1]);
		
	}

}
