
public class Triangle extends Shape {
    public Triangle(double length) {
        super(length);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return getRound(Math.pow(this.length, 2) * Math.sqrt(3) / 4);
    }

    public double getPerimeter() {
        return getRound(3 * this.length);
    }

    public double getRound(double number) {
        return (double) Math.round(number * 100) / 100;
    }
}
