package day0415;

import java.util.Scanner;

public class GugudanRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		for (int dan = 2; dan <= 4; dan++) {
			System.out.println("** " + dan + "단 **");
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " x " + i + " = " + dan*i);
			}
		}
	}
}
