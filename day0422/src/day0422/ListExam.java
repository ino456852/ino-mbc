package day0422;

import java.util.ArrayList;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		sList.add("홍길동");
		sList.add("A");
		sList.add("김길동");
		System.out.println(sList);
		System.out.println(new String[]{"A","B"});
		sList.add(1,"박길동");
		System.out.println(sList);
		System.out.println(sList.contains("A"));
		System.out.println(sList.indexOf("A"));
		System.out.println(sList.remove(2));
		System.out.println(sList.remove("A"));
		System.out.println(sList);
		System.out.println(sList.size());
		
	}
}
