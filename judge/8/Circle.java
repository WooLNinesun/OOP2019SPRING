
public class Circle extends Shape {
    public Circle(double length) {
        super(length);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return getRound(Math.PI * Math.pow(this.length, 2) / 4);

    }

    public double getPerimeter() {
        return getRound(Math.PI * this.length);
    }

    public double getRound(double number) {
        return (double) Math.round(number * 100) / 100;
    }
}
