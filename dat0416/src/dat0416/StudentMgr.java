package dat0416;

public class StudentMgr {

	public static void main(String[] args) {
		// 학생3명 시험 점수 관리
		int score1 = 90;
		int score2 = 80;
		int score3 = 70;

		String name1 = "홍길동";
		String name2 = "김길동";
		String name3 = "박길동";
		// 총합
		int total = score1 + score2 + score3;
		System.out.println("total = " +total);
		System.out.println();
		// 평균
		double avg = (double)total / 3;
		System.out.println("avg = " +avg);
		
	}

}
