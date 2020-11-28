package ru.iteco.patterns.visitor.shape;

public class AreaShapeVisitor extends ShapeVisitor {
	protected AreaShapeVisitor() {
		super("Area");
	}

	@Override
	public void visit(Rectangle shape) {
		super.visit(shape);
		System.out.println(shape.getA() * shape.getB());
	}

	@Override
	public void visit(Triangle shape) {
		super.visit(shape);
		System.out.println(0.5f * shape.getA() * shape.getB() * Math.sin(shape.getAngle()));
	}

	@Override
	public void visit(Circle shape) {
		super.visit(shape);
		System.out.println(Math.pow(shape.getR() * Math.PI, 2));
	}
}
