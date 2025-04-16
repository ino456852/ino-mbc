package dat0416;

public class Calculator {
	public int Sum(int x, int y) {
		int sum = x + y;
		return sum;
	}
	public int Subtract(int x, int y) {
		int subtraction = x - y;
		return subtraction;
	}
	public int Multiple(int x, int y) {
		int multiple = x * y;
		return multiple;
	}
	public int Divide(int x,int y) {
		int divide = x / y;
		return divide;
	}

	public static void main(String[] args) {

		Calculator Calc = new Calculator();

		int x = Calc.Sum(2, 3);

		System.out.println(x);
	}
}
