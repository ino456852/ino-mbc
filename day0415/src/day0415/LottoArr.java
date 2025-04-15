package day0415;

import java.util.Iterator;

public class LottoArr {

	public static void main(String[] args) {

		int[] lottoArr = new int[6];
//		lottoArr[0] = (int) (Math.random() * 45) + 1;
//		lottoArr[1] = (int) (Math.random() * 45) + 1;
//		lottoArr[2] = (int) (Math.random() * 45) + 1;
//		lottoArr[3] = (int) (Math.random() * 45) + 1;
//		lottoArr[4] = (int) (Math.random() * 45) + 1;
//		lottoArr[5] = (int) (Math.random() * 45) + 1;

		for (int i = 0; i < lottoArr.length; i++) {
			while(lottoArr[i] == lottoArr[i]) {
				lottoArr[i] = (int) (Math.random() * 45) + 1;
				
			}
//			while(lottoArr[i] == lottoArr[i]) {
//				lottoArr[i] = (int) (Math.random() * 45) + 1;	
//			}
//			if(lottoArr[i] == lottoArr[i]) {
//				lottoArr[i] = (int) (Math.random() * 45) + 1;
//			}
		}

		for (int i = 0; i <= 5; i++) {
				System.out.println(lottoArr[i]);
		}

//		System.out.println(lottoArr[0]);
//		System.out.println(lottoArr[1]);
//		System.out.println(lottoArr[2]);
//		System.out.println(lottoArr[3]);
//		System.out.println(lottoArr[4]);
//		System.out.println(lottoArr[5]);
	}
}
