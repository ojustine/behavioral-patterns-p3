package ru.iteco.patterns.visitor.shape;

public class PerimeterShapeVisitor extends ShapeVisitor {

	protected PerimeterShapeVisitor() {
		super("Perimeter");
	}

	@Override
	public void visit(Rectangle shape) {
		super.visit(shape);
		System.out.println((shape.getA() + shape.getB()) * 2);
	}

	@Override
	public void visit(Triangle shape) {
		super.visit(shape);
		int a = shape.getA();
		int b = shape.getB();
		int ang = shape.getAngle();
		System.out.println(Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(ang)));
	}

	@Override
	public void visit(Circle shape) {
		super.visit(shape);
		System.out.println(2 * shape.getR() * Math.PI);
	}
}
