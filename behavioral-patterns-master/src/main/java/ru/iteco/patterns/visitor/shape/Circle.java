package ru.iteco.patterns.visitor.shape;

public class Circle extends Shape {
	private final int r;

	public Circle(int r) {
		super("Circle");
		this.r = r;
	}

	@Override
	public void accept(ShapeVisitor visitor) {
		visitor.visit(this);
	}

	public int getR() {
		return r;
	}

	@Override
	public String toString() {
		return "Circle(" +
				r +
				')';
	}
}
