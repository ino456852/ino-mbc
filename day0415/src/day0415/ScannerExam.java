package day0415;

import java.util.Scanner;

public class ScannerExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을입력하세요 : ");
		String line = sc.nextLine();
		
		System.out.print("나이를 입력 해주세요 : ");
		int age = sc.nextInt();
		
		
		System.out.println("이름 : " + line);
		System.out.println("나이 : " + age + "세");
		
	}
}
