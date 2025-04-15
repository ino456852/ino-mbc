package day0415;

import java.util.Scanner;

public class GugudanInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 구구단 번호 입력 : ");
		int dan = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " x " + i + " = " + dan*i);
		}
	}
}
