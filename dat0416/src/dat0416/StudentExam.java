package dat0416;

public class StudentExam {

	public static void main(String[] args) {
		Student s1 = new Student();

		s1.name = "백인호";
		s1.tel = "01029432189";

		System.out.println("학생이름 = " + s1.name);
		System.out.println("학생이름연락처 = " + s1.tel);

		Student s2 = new Student();

		s2.name = "김길동";
		s2.tel = "010-222-333";
	}

}
