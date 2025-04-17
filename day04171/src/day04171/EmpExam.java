package day04171;

public class EmpExam {

	public static void main(String[] args) {
		Emp e1 = new Emp("홍길동",30);
//		e1.age = 35;
		e1.printInfo();
		e1.setAge(35);
		e1.setName("김길동");
		
		System.out.println(e1.getAge());
		
		System.out.println(e1.getName());
	}

}
