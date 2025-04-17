package p2439;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int start = sc.nextInt();
		String star = " ";
		for (int i = 0; i <= start; i++) {
			System.out.print(" "); 
		}
		for (int j = start; j > start-1 ; j--) {
			star += "*";
			System.out.println(star);
		}
	}
}
