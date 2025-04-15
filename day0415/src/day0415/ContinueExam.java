package day0415;

public class ContinueExam {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				continue;
			} else if (i > 5) {
				break;
			}
			System.out.println(i);
		}
	}
}
