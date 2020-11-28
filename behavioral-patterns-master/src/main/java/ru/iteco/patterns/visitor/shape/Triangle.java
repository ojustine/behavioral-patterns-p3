package ru.iteco.patterns.visitor.shape;

public class Triangle extends Shape {
	private final int a;
	private final int b;
	private final int angle;

	public Triangle(int a, int b, int angle) {
		super("Triangle");
		this.a = a;
		this.b = b;
		this.angle = angle;
	}

	@Override
	public void accept(ShapeVisitor visitor) {
		visitor.visit(this);
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getAngle() {
		return angle;
	}

	@Override
	public String toString() {
		return "Triangle(" +
				a +
				", " +
				b +
				", " +
				angle +
				")";
	}
}
