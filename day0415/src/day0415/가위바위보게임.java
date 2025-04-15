package day0415;

import java.util.Scanner;

public class 가위바위보게임 {

	public static void main(String[] args) {
		int com = (int)(Math.random()*3)+1;
//		System.out.println("com = " + com);
		Scanner sc = new Scanner(System.in);
		System.out.println("가위=1, 바위=2, 보=3");
		System.out.print("입력 : ");
		int user = sc.nextInt();
		String result = "";
		
		if(com == user) {
			result = "무승부";
		} else if (com == 1) {
			if(user == 2) {
				result = "user승리";
			} else if (user == 3) {
				result = "com승리";
			}
		} else if (com == 2) {
			if(user == 1) {
				result = "com승리";
			} else if (user == 3) {
				result = "user승리";
			}
		} else if (com == 3) {
			if(user == 1) {
				result = "user승리";
			} else if (user == 2) {
				result = "com승리";
			}
		}
		System.out.println(result);
	}

}
