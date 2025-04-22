package day0422;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {

	public static void main(String[] args) {
		Set<String> ss = new HashSet<String>();
		ss.add("abc");
		ss.add("abc");
		ss.add("abc");
		System.out.println(ss);
		ss.add("asd");
		ss.add("xyz");
		System.out.println(ss);
		
		Iterator<String> it = ss.iterator();
		while (it.hasNext()) {			
			String st = it.next();
			System.out.println(st);
		}
	}

}
