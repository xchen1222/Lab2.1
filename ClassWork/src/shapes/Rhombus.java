package shapes;

public class Rhombus implements Shape {
	
	// fields
	private int side1; 
	private int side2;
	private int sideside; 

	/**
	 * Constructor method
	 * 
	 * @param side1 = diagonal 
	 * @param side2 = diagonal 
	 * @param sideside = actual sides
	 */
	public Rhombus (int side1 , int side2, int sideside) {
	this.side1 = side1 ; 
	this.side2 = side2 ; 
	this.sideside = sideside ; 
	}
	


	public double calculateArea() {
		return .5 * (side1 * side2) ; 
	}


	public double calculatePerimeter() {
		return sideside * 4;  
	}


	public String toString() {
		return "Rhombus Side: " + sideside + " Area: " + calculateArea() + " Perimeter: " + calculatePerimeter() ;  

	}
}
	
