package shapes;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *
 */
public class Circle implements Shape {

	// fields
	private int radius;
	private static double pi = 3.14;

	/**
	 * Constructor method
	 * 
	 * @param radius
	 */
	public Circle(int radius) {
		// to be implemented by student
		this.radius =  radius; 
	}

	@Override
	public double calculateArea() {
		// to be implemented by student
		return pi * radius * radius;
	}

	@Override
	public double calculatePerimeter() {
		// to be implemented by student
		return 2 * this.radius * pi;
	}

	@Override
	public String toString() {
		// to be implemented by student
		return "Circle Radius: " + radius + " Area: " + calculateArea() + " Perimeter: " + calculatePerimeter() ;
	}
}
