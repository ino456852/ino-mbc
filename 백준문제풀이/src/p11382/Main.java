package p11382;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		String num = sc.next();
		
		String sum = num.toString().replace(" ", "+");
		
		
		System.out.println(sum);
	}
}
