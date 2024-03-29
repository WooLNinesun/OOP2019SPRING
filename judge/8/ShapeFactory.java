
public class ShapeFactory {
    public enum Type {
        Circle, Square, Triangle
    }

    /**
     * 
     * @param shapeType
     * @param length
     * @return returns an {shapeType} object which 'is-a' Shape object.
     */
    public Shape createShape(ShapeFactory.Type shapeType, double length) {
        switch (shapeType) {
        case Circle:
            return new Circle(length);
        case Square:
            return new Square(length);
        case Triangle:
            return new Triangle(length);
        }
        return null;
    }
}
