package p9086;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		sc.nextLine();
		
		for (int j = 0; j < i; j++) {
			String s = sc.nextLine();
			System.out.println(s.charAt(0) +""+ s.charAt(s.length()-1));
		}
	}

}
