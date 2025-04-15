package day0415;

import java.util.Scanner;

public class GugudanInputRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 구구단 시작 번호 입력 : ");
		int start = sc.nextInt();
		System.out.print("원하는 구구단 끝 번호 입력 : ");
		int end = sc.nextInt();
		
		for (int i = start; i <= end; i++) {
			System.out.println("***** " + i + "단" + " *****");
			for (int j = 2; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
		}
		
//		for (int i = 2; i <= 9; i++) {
//		System.out.println("***** " + i + "단" + " *****");
//		for(int j = 2; j <= 9; j++) {
//			int sum = i * j;
//			System.out.println(i + " x " + j + " = " +sum);
//		}
//	}
	}
}
