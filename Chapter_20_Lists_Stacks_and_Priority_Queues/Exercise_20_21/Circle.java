package Exercise_20_21;

public class Circle extends GeometricObject {
	private double radius;

	public Circle() {

	}

	public Circle(double radius) {
		this.radius = radius;

	}

	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		setFilled(filled);
		setColor(color);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

}
