package day0422;

import day0422.school.Member;
import day0422.school.Student;

public class EqualsExam {
	
	public static void main(String[] args) {
		Member m1 = new Member("100", "홍길동");
		Member m2 = new Member("100", "홍길동");
		System.out.println(m1 == m2);
		System.out.println(m1.equals(m2));
		
		Student st1 = new Student("200", "김길동", "컴공", 1);
		Student st2 = new Student("200", "김길동", "컴공", 1);
		System.out.println(st1.equals(st2));
	}
}
