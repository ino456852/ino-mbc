package day0417;

/** 학생 정보를 저장 하는 클래스 */
public class Student {
	// 정보를 저장할 변수 선언
	String name;
	String id;
	String pd;
	int age;

	public Student() {};
	
	public Student(String name, String id, String pd, int age) {
		super();
		this.name = name;
		this.id = id;
		this.pd = pd;
		this.age = age;
	}
	
	

	public void pintInfo() {
		System.out.println("name = " + name + ",id = " + id + ",pd = " + pd + ",age = " + age );
	}

}
