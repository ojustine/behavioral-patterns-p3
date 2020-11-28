package ru.iteco.patterns.visitor.shape;

public class Main {
	public static void main(String[] args) {
		Shape[] shapes = {
							new Rectangle(10, 15),
							new Circle(8),
							new Triangle(4, 3, 30)
						};

		ShapeVisitor areaVisitor = new AreaShapeVisitor();
		ShapeVisitor perimetrVisitor = new PerimeterShapeVisitor();
		ShapeVisitor drawVisitor = new DrawShapeVisitor(0, 0);

		for (Shape shape : shapes) {
			shape.accept(areaVisitor);
			shape.accept(perimetrVisitor);
			shape.accept(drawVisitor);
		}
	}
}
