package day0417;

public class CalcMain {

	public static void main(String[] args) {
		/* calc 에 숫자를 저장
		   계산 메서드를 호출 */
		Calculator c = new Calculator();
		
		int result = c.sum(100, 200);
		System.out.println(result);
		
		int result1 = c.subtract(100, 200);
		System.out.println(result1);
		
		int result2 = c.multiple(100, 200);
		System.out.println(result2);
		
		int result3 = c.divide(100, 200);
		System.out.println(result3);
		
		int r4 = c.sum(1, 3,5);
		System.out.println(r4);
		int r5 = c.sum(1, 3,5,7,9);
		System.out.println(r5);
		
//		Calculator.pi = 3.1;
		
		
	}

}
