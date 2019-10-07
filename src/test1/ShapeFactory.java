package test1;

public class ShapeFactory {

	public Shape getShape(String shapeType) {
		if (shapeType == null)
		return null;
		if (shapeType.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}else if (shapeType.equalsIgnoreCase("triangle")) {
			return new Triangle();
		}
		return null;
	}
}
