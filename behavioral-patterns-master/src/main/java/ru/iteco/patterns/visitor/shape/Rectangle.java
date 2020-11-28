package ru.iteco.patterns.visitor.shape;

public class Rectangle extends Shape {
	private final int a;
	private final int b;

	public Rectangle(int a, int b) {
		super("Rectangle");
		this.a = a;
		this.b = b;
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

	@Override
	public String toString() {
		return "Rectangle(" +
				a +
				", " +
				b +
				')';
	}
}
