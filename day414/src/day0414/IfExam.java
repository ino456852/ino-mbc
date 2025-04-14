package day0414;

public class IfExam {
	public static void main(String[] args) {
		int score = 83;

		if (score >= 90) {
			System.out.println("A학점");
		} else if (score >= 80) {
			System.out.println("B학점");
		} else if (score >= 70) {
			System.out.println("C학점");
		} else {
			System.out.println("F학점");
		}
	}
}