package api.lang.obj;

public class Person {
	
	String name;
	int age;
	String gender;
	
	
	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "이름 : "+ this.name + ", 나이 : " + this.age + "세, 성별 : " + this.gender;
	}

	
	
	
	
	

}
