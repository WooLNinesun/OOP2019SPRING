
public class Square extends Shape {
    public Square(double length) {
        super(length);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return getRound(Math.pow(this.length, 2));
    }

    @Override
    public double getPerimeter() {
        return getRound(4 * this.length);
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
