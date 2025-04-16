package dat0416;

import java.util.Scanner;

public class StudentForExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] scores = new int[3];

		for (int i = 0; i < 3; i++) {
			System.out.print("학생" + (i + 1) + "의 점수 입력 : ");
			scores[i] = sc.nextInt();
		}
		// 총합
		int total = scores[0] + scores[1] + scores[2];
		System.out.println("total = " + total);
		// 평균
		double avg = (double) total / 3;
		System.out.println("avg = " + avg);
	}

}
