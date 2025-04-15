package day0415;

public class RefExam {

	public static void main(String[] args) {
		int i = 3, i2 = 3;
		System.out.println(i == i2);
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2)); 
		
		String s3 = "abc";
		String s4 = "abc";
		System.out.println(s3 == s4);
	}
}
