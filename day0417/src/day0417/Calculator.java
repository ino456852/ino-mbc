package day0417;

public class Calculator {
	final static double PI = 3.141592;
	
	public int sum(int x, int y) {
		int sum = x + y;
		return sum;
	}

	public int subtract(int x, int y) {
		int subtraction = x - y;
		return subtraction;
	}

	public int multiple(int x, int y) {
		int multiple = x * y;
		return multiple;
	}

	public int divide(int x, int y) {
		int divide = x / y;
		return divide;
	}

	public int sum(int...values) {
		int total = 0;
		for (int i : values) {
			total += i;
		}
		return total;
	}
//	public static void info () {
//		System.out.println();
//	}
}
