package day0415;

import java.util.Scanner;

public class 숫자맞추기게임 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int comNum = (int) (Math.random() * 100) + 1;
		int count = 0;
		System.out.println(comNum);
		boolean right = false;

		while (!right) {
			count++;
			System.out.print("숫자를 입력 하세요 : ");
			int userInput = sc.nextInt();
			if (userInput == comNum) {
				System.out.println("정답!");
//				right = true;
				break;
			} else {
				if (count == 7) {
					System.out.println("멍청이!");
					break;
				}
				if (userInput > comNum) {
					System.out.println("낮춰주세요");
				} else {
					System.out.println("높여주세요");
				}
			}
		}
	}
}
