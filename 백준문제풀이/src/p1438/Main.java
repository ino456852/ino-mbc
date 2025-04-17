package p1438;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int start = sc.nextInt();
		String star = ""; 
		for (int i = 1; i <= start; i++) {
			star += "*";
			System.out.println(star);
		}
	}
}
