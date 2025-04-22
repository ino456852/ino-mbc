package day0422;

import java.util.ArrayList;
import java.util.List;

public class LottoListExam {

	public static void main(String[] args) {
		List<Integer> lottoList = new ArrayList<Integer>();
		
		for (int i = 0; i < 6; i++) {
			int num = (int) (Math.random()*45) +1;
			if (lottoList.contains(num) == false) {
				lottoList.add(num);
			} else {
				System.out.println(num + "중복");
				i--;
			}
		}
		System.out.println(lottoList);
	}

}
