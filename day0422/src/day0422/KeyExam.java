package day0422;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class KeyExam {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>(); 
		m.put("홍길동", 100);
		m.put("홍길동", 200);
		m.put("김길동", 200);
		System.out.println(m);
		
		System.out.println(m.size());
		Collection<Integer> values = m.values();
		ArrayList<Integer> arrayList = new ArrayList<Integer>(values);
		Collection<? extends String> keySet;
		
		
		System.out.println(values);
		System.out.println(m.keySet());
		
	}

}
