package day04181;

public class MemberExam {

	public static void main(String[] args) {
		int cnt = 0; // 저장 할 위치
		Student[] sa1 = new Student[100];
		sa1[cnt++] = new Student("100", "김길동", "컴공", "1");
		sa1[cnt++] = new Student("200", "이길동", "수학과", "2");
		System.out.println("저장된 학생 수=" + cnt);
		// 저장된 전체 학생 정보 출력
		for (int i = 0; i < cnt; i++) {
			System.out.println(sa1[i]);
		}
		int cnt2 = 0;
		Professor[] pa1 = new Professor[100];
		pa1[cnt2++] = new Professor("200", "박길동", "컴공", "교수");
		pa1[cnt2++] = new Professor("300", "최길동", "화학", "교수");

		for (int i = 0; i < cnt2; i++) {
			System.out.println(pa1[i]);
		}
		Member[] ma1 = new Member[100];
		int cnt3 = 0;
		ma1[cnt3++] = new Student("100", "김길동", "컴공", "1");
		ma1[cnt3++] = new Student("200", "이길동", "수학과", "2");
		ma1[cnt3++] = new Professor("200", "박길동", "컴공", "교수");
		ma1[cnt3++] = new Professor("300", "최길동", "화학", "교수");
		System.out.println("저장된 멤버갯수=" + cnt3);
		System.out.println("모든 멤버 출력");

		for (int i = 0; i < cnt3; i++) {
			System.out.println(ma1[i].toString());
		}
	}

}
