package ru.iteco.patterns.visitor.shape;

public abstract class ShapeVisitor {
	private final String operation;

	protected ShapeVisitor(String operationName) {
		this.operation = operationName;
	}

	public void visit(Rectangle shape) {
		System.out.print(this.getOperation() + " of " + shape.getName() + " is ");
	}

	public void visit(Triangle shape) {
		System.out.print(this.getOperation() + " of " + shape.getName() + " is ");
	}

	public void visit(Circle shape) {
		System.out.print(this.getOperation() + " of " + shape.getName() + " is ");
	}

	public String getOperation() {
		return operation;
	}
}
