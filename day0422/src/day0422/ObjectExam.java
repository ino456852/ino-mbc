package day0422;

public class ObjectExam {

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
	}

}
