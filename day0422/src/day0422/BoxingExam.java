package day0422;

public class BoxingExam {
	
	public static void main(String[] args) {
		int i = 100;
//		Integer ii = new Integer(i);
		Integer ii = i; // 박싱
		int i2 = ii; //언박싱
		String s = "100";
		int r = 5 + Integer.parseInt(s);
		System.out.println(r);
	}
}
