package dat0416;

import java.util.Scanner;

public class StudentArrayExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		동일한 타입의 변수를 연속해서 할당받는 방법 : 배열
//		점수를 저장한 배열 
		int[] scores = new int[3];

		System.out.println("학생1의 점수 입력 : ");
		scores[0] = sc.nextInt();
		System.out.println("학생2의 점수 입력 : ");
		scores[1] = sc.nextInt();
		System.out.println("학생3의 점수 입력 : ");
		scores[2] = sc.nextInt();

		// 총합
		int total = scores[0] + scores[1] + scores[2];
		System.out.println("total = " + total);
		System.out.println();
		// 평균
		double avg = (double) total / 3;
		System.out.println("avg = " + avg);

		
	}

}
