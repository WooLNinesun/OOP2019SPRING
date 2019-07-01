public abstract class Shape {
	protected double length;

	public Shape(double length) {
		this.length = length;
	}

	/**
	 * Setter for the length of this shape.
	 * 
	 * @param length
	 */
	public abstract void setLength(double length);

	/**
	 * Getter for the area of this shape.
	 * 
	 * @return the area of this shape.
	 */
	public abstract double getArea();

	/**
	 * Getter for the perimeter of this shape.
	 * 
	 * @return the perimeter of this shape.
	 */
	public abstract double getPerimeter();

	public String getInfo() {
		return "Area = " + getArea() + ", Perimeter = " + getPerimeter();
	}
}
