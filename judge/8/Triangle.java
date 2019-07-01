
public class Triangle extends Shape {
    public Triangle(double length) {
        super(length);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return getRound(Math.pow(this.length, 2) * Math.sqrt(3) / 4);
    }

    @Override
    public double getPerimeter() {
        return getRound(3 * this.length);
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
