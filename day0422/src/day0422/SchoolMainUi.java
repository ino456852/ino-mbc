package day0422;

import java.util.ArrayList;
import java.util.Scanner;

import day0422.school.Member;
import day0422.school.Student;

public class SchoolMainUi {

	public static void main(String[] args) {
		// 학생과 교수저장소
		ArrayList<Member> members = new ArrayList<Member>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("** 저장 인원수: " + members.size());
			int menu = showMainMenu(sc); // 메인메뉴
			System.out.println(menu + "번 입력");
			if (menu == 1) {
				int menu2 = showRegistMenu(sc); // 구성원 등록 메뉴
				System.out.println(menu2 + "번 입력");
				if (menu2 == 1) { // 학생입력
					Student st = readStudent(sc);
					System.out.println("입력학생 : " + st);
					members.add(st);
					System.out.println("저장완료");
				}
			} else if (menu == 2) {
				System.out.println("[ 전체 출력 ]");
				for (Member member : members) {
					System.out.println(member);
				}
			} else if(menu == 0){
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}
	}

	// 학생 정보 입력
	private static Student readStudent(Scanner sc) {
		System.out.println("[ 학생등록 ]");
		System.out.print("학번 : ");
		String hakbun = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("전공 : ");
		String jungong = sc.next();
		System.out.print("학년 : ");
		int haknyun = Integer.parseInt(sc.next());
		return new Student(hakbun, name, jungong, haknyun);
	}

	private static int showRegistMenu(Scanner sc) {
		System.out.println("등록할 구성원 종류 선택 : ");
		System.out.println("1. 학생");
		System.out.println("2. 교수");
		System.out.println("0. 이전 메뉴");
		System.out.print("선택 : ");
		int menu = Integer.parseInt(sc.next());
		return menu;
	}

	private static int showMainMenu(Scanner sc) {
		System.out.println("=== 드림 대학교 구성원 관리 프로그램 ===");
		System.out.println("1. 구성원 등록");
		System.out.println("2. 목록 보기");
		System.out.println("0. 종료");
		System.out.print("선택 : ");
		int menu = Integer.parseInt(sc.next());
		return menu;
	}
}
