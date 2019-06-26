public class Tester {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape triangle = shapeFactory.createShape(ShapeFactory.Type.Triangle, 7.5);
        Shape square = shapeFactory.createShape(ShapeFactory.Type.Square, 5);
        Shape circle = shapeFactory.createShape(ShapeFactory.Type.Circle, 5);
        System.out.println(triangle.getInfo());
        System.out.println(square.getInfo());
        System.out.println(circle.getInfo());
        System.out.println(square.getArea() > triangle.getArea());
        System.out.println(square.getPerimeter() > circle.getPerimeter());
        triangle.setLength(10.5);
        square.setLength(3.2);
        circle.setLength(0);
        System.out.println(triangle.getInfo());
        System.out.println(square.getInfo());
        System.out.println(circle.getInfo());
        System.out.println(square.getArea() > triangle.getArea());
        System.out.println(square.getPerimeter() > circle.getPerimeter());
    }
}
