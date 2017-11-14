package shapes;

public class Triangle implements Shape {
	
	private int side; 
	private int height;

	public Triangle(int side , int height ) {
	this.side = side ; 
	this.height = height ; 
	}
	


	public double calculateArea() {
		// To be written by student
		return .5 * (side * height) ; 
	}


	public double calculatePerimeter() {
		// To be written by student
		return side * 3;  
	}


	public String toString() {
		return "Triangle Side: " + side + " Area: " + calculateArea() + " Perimeter: " + calculatePerimeter() ; 
	}
}
