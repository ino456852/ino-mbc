package p25314;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int Long = sc.nextInt();
		if (Long % 4 == 0) {
			for (int i = 1; i <= Long / 4; i++) {
					System.out.print("long ");
			}
		}
		System.out.println("int");
	}

}
