package day0414;

public class OprExam2 {
	public static void main(String[] args) {
		int cnt = 0;
		cnt = cnt + 1;
		System.out.println(cnt);
		
		cnt += 1;
		System.out.println(cnt);
		
		cnt ++;
		System.out.println(cnt++);
		
		System.out.println(cnt);
		
		System.out.println(++cnt);
		
		int x = 1;
		int c3 = x++ + ++x + x++;  // c3 = 7 x = 4 // 1 + 3 + 3
//		System.out.println(c3);
		
		System.out.println("c3 = " + c3 + " , " + "x = " + x);
	}
}
