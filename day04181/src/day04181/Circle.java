package day04181;

public class Circle extends Shape {
	private int radius;

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return super.toString() + ", radius=" + radius;
	}

	@Override
	public void draw() {
		System.out.println("원 그리기=" + toString());
	}
}
