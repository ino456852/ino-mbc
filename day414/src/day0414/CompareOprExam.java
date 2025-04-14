package day0414;

public class CompareOprExam {
	public static void main(String[] args) {
		int year = 2025;
		int birth = 2001;
		int age = year - birth;
		
		System.out.println(age);
		
		boolean isAdult = age < 19;
		System.out.println(isAdult);
		
		String adultStr = (age < 19) ? "미성년" : "성인";
		
		System.out.println(adultStr);
	}
}
