package api.lang.obj;

public class MainClass {

	public static void main(String[] args) {
		
		Person hong = new Person("홍길동" , 23, "남자");
		Person kim = new Person("김영희" , 25, "여자");
		
		String str = "안녕하세요";
		System.out.println(str);
		
		System.out.println(hong.toString()); //.toString()없어도 출력 값은 같다
		
		System.out.println(hong.hashCode());
		
		System.out.println(hong.equals(kim));
//		System.out.println(hong == kim); //위와 동일
		
		
		
		

	}

}
