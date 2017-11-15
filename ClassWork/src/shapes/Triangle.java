package shapes;

public class Triangle implements Shape {
	
	// fields
	private int side; 
	private int height;

	/**
	 * Constructor method
	 * 
	 * @param side 
	 * @param height 
	 * Triangle is equilateral 
	 */
	public Triangle(int side , int height ) {
	this.side = side ; 
	this.height = height ; 
	}
	


	public double calculateArea() {
		return .5 * (side * height) ; 
	}


	public double calculatePerimeter() {
		return side * 3;  
	}


	public String toString() {
		return "Triangle Side: " + side + " Area: " + calculateArea() + " Perimeter: " + calculatePerimeter() ; 
	}
}
