package final_.field;

public class MainCalss {

	public static void main(String[] args) {

		Person kim = new Person("김철수");
//		kim.nation = "미국"; // (x) 불변의 값이기 때문에 빨간 줄
//		kim.name = "김마이클"; // (x) 불변의 값이기 때문에 빨간 줄
		kim.age = 30;
		
	}

}
