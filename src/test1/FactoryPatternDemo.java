package test1;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shapetriangle = shapeFactory.getShape("triangle");
		shapetriangle.draw();
		
		Shape shapeRectangle = shapeFactory.getShape("Rectangle");
		shapeRectangle.draw();
	}
	

}
