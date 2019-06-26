
public class Square extends Shape {
    public Square(double length) {
        super(length);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return getRound(Math.pow(this.length, 2));
    }

    public double getPerimeter() {
        return getRound(4 * this.length);
    }

    public double getRound(double number) {
        return (double) Math.round(number * 100) / 100;
    }
}
