package dat0416;

import java.util.Arrays;

/**
 * 6개의 로또번호 생성 및 저장
 */
public class LottoMaker {
	int[] nums = new int[6];
	
	void make() {
		for (int i = 0; i < nums.length; i++) {
			int r = (int) (Math.random() * 45) + 1;
			boolean conf = false;
			for (int j : nums) {
				if (r == j) {
					conf = true;
					break;
				}
			}
			if (conf == false) {
				nums[i] = r;
			} else {
				i--;
			}
		}
		Arrays.sort(nums);
	}
}
