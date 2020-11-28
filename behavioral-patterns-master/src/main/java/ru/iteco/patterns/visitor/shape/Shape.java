package ru.iteco.patterns.visitor.shape;

public abstract class Shape {
	private final String name;

	public Shape(String name) {
		this.name = name;
	}

	public abstract void accept(ShapeVisitor visitor);

	public String getName() {
		return name;
	}
}
