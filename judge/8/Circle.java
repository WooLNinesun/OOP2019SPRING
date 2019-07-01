
public class Circle extends Shape {
    public Circle(double length) {
        super(length);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return getRound(Math.PI * Math.pow(this.length, 2) / 4);

    }

    @Override
    public double getPerimeter() {
        return getRound(Math.PI * this.length);
    }

    /**
     * let {number} to round off to the 2nd decimal place.
     * 
     * @param number
     * @return
     */
    public double getRound(double number) {
        return (double) Math.round(number * 100) / 100;
    }
}
