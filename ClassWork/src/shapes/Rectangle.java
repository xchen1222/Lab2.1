package shapes;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *
 */
public class Rectangle implements Shape {
	
	// fields
	private int length;
	private int width;

	/**
	 * Constructor method
	 * 
	 * @param length 
	 * @param width
	 */
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}


	public double calculateArea() {
		return (this.length) * (this.width);
	}


	public double calculatePerimeter() {		
		return ((this.length) + (this.width))*2;
	}


	public String toString() {
		return "Rectangle Width: " + width + " Length: " + length + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
