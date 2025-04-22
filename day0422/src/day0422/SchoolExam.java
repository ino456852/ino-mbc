package day0422;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import day0422.school.Student;

public class SchoolExam {

	public static void main(String[] args) {
		// hashMap key 학번 value student 
		// 학생관리
		HashMap<String, Student> stMap = new HashMap<String, Student>();
		stMap.put("2024001", new Student("2024001","홍길동","컴공",1));
		stMap.put("2024002", new Student("2024002","김길동","사회학",1));
		System.out.println("저장갯수 = " + stMap.size());
//		Student student = stMap.get("홍길동");
		Student student = stMap.get("2024002");
		if(student == null) {
			System.out.println("없거나 삭제된 정보입니다");
		} else {
			System.out.println(student);
		}
		// 전체 출력. 모든 키를 추출
		Set<String> ks = stMap.keySet();
		ArrayList<String> kslist = new ArrayList<String>(ks);
		System.out.println("**등록된 학번 목록**");
		System.out.println(kslist.toString().replace("[", "").replace("]", "").trim() ); // 한줄로 출력하려면 foreach
		System.out.println(String.join(", " , kslist)); // 한줄로 출력하려면 foreach
//		for (String s : kslist) {
//			System.out.print(s + ",");
//		}
	}

}
