package day0422;

public class SystemExam {

	public static void main(String[] args) {
//		System.out.println(System.currentTimeMillis());
//		System.out.println(System.nanoTime());
		String s = "자바 프로그래밍 프로젝트 ";
		
//		System.out.println(s.charAt(3));
		
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
		int ss = s.indexOf("프로");
		System.out.println(ss);
		ss = s.indexOf("프로",ss+"프로".length());
		System.out.println(ss);
		
		ss = s.indexOf("프로",ss+"프로".length());
		System.out.println(ss);
		
		System.out.println( s.replace("자바", "JAVA") );
		System.out.println(s);
		
		System.out.println(s.substring(3,5));
		
		System.out.println("   abc   ".trim().length());
		String s2 = "90,80,70";
		String [] sa = s2.split(",");
		for (String s3 : sa) {
			System.out.print(s3);
		}
		
		
	}
	

}
