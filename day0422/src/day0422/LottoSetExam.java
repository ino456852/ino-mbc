package day0422;

import java.util.HashSet;
import java.util.Set;

public class LottoSetExam {

	public static void main(String[] args) {
		Set<Integer> lottoSet = new HashSet<Integer>();
//		for (; lottoSet.size() < 6;) {
		while ( lottoSet.size() < 6) {
			int num = (int) (Math.random()*45)+1;
			lottoSet.add(num);
		}
		System.out.println(lottoSet);
	}

}
