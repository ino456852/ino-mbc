package p2439;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int start = sc.nextInt();
		
		for (int i = 1; i <= start; i++) { // start 가 5라면 i=1가 start=5 이하니까 내려감 
			for (int j = 1; j <= start-i ; j++) { // j=1가 start-i = 4 이하니까 공백 출력하고 올라감
				System.out.print(" "); 
				
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			
			System.err.println();
		}
	}
}
