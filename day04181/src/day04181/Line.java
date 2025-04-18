package day04181;

public class Line extends Shape {
	private int x2, y2;

	public Line() {
		// TODO Auto-generated constructor stub
	}

	public Line(int x, int y, int x2, int y2) {
		super(x, y);
		this.x2 = x2;
		this.y2 = y2;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	@Override
	public String toString() {
		return super.toString() + ", x2=" + x2 + ", y2=" + y2;
	}

	@Override
	public void draw() {
		System.out.println("선 그리기 = " + toString());
	}

}
