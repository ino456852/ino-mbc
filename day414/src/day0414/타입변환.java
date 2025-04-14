package day0414;

public class 타입변환 {
	public static void main(String[] args) {
		byte b1 = 65;
		int i1 = b1;
		
//		b1 = i1;
//		char c1 = b1;
		
		i1 = 129;
		b1 = (byte)i1;
		System.out.println(b1);
		System.out.println(Integer.toBinaryString(i1));
		
		int i2 = 44032;
		char c2 = (char)i2;
		System.out.println(c2);
		
//		c2 = c2 + 1;
		c2 = (char)(c2 + c2);
		
		
		int a = 1;
		int b = 2;
		
		System.out.println(1.0*a/b);
		
		System.out.println("1"+2+3);
		System.out.println(1+2+"3");
		System.out.println(1+"2"+3);
		
		char c3 = 'A';
//		short sv = c3;
		
		
		
	}
}
