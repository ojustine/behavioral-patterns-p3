package ru.iteco.patterns.visitor.shape;

public class DrawShapeVisitor extends ShapeVisitor {
	private final int x;
	private final int y;

	protected DrawShapeVisitor(int x, int y) {
		super("Draw");
		this.x = x;
		this.y = y;
	}

	@Override
	public void visit(Rectangle shape) {
		super.visit(shape);
		System.out.println(shape + " at point [" + x + ":" + y + "]");
	}

	@Override
	public void visit(Triangle shape) {
		super.visit(shape);
		System.out.println(shape + " at point [" + x + ":" + y + "]");
	}

	@Override
	public void visit(Circle shape) {
		super.visit(shape);
		System.out.println(shape + " at point [" + x + ":" + y + "]");
	}
}
