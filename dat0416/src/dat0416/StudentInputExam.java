package dat0416;

import java.util.Scanner;

public class StudentInputExam {

	public static void main(String[] args) {
		// 학생 점수 입력
		// 입력은 System.in -> 직접 사용 시 1byte 단위로 직접 처리
		// CJK(중국,일본,한국)는 한글자가 2byte
		// Scanner가 적당히 1,2,byte 처리해줌
		// Scanner는 java.util패키지 소속
		// 다른 소속 패키직를 사용시 import선언
		Scanner sc = new Scanner(System.in);
		// 입력 글자를 공백으로 구분
		// 숫자 입력 int score = sc.nextInt();
		// 글자 입력 String str = sc.next();
		// 한 줄 전체 입력 String str = sc.nextLine();

		System.out.println("학생1의 점수 입력 : ");
		int score1 = sc.nextInt();
		System.out.println("학생2의 점수 입력 : ");
		int score2 = sc.nextInt();
		System.out.println("학생3의 점수 입력 : ");
		int score3 = sc.nextInt();

		// 총합
		int total = score1 + score2 + score3;
		System.out.println("total = " + total);
		System.out.println();
		// 평균
		double avg = (double) total / 3;
		System.out.println("avg = " + avg);
		
		// 점수에 따른 학점 표시
		if (score1 >= 90) {
			System.out.println("A학점");
		} else if (score1 >= 80) {
			System.out.println("B학점");
		} else if (score1 >= 70) {
			System.out.println("C학점");
		} else {
			System.out.println("F학점");
		}

	}

}
