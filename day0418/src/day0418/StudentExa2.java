package day0418;

public class StudentExa2 {
	
	public static void main(String[] args) {
		Student s1 = new Student("20244001","홍길동","사회학과",1);
		WorkingStudent w1 = new WorkingStudent("20244003","최길동","건축학과",1,20,20000);
		System.out.println(w1.getId());
		
		Student s2 = w1;
		System.out.println(s2.toString());
	}
}
