package shapes;

public class Square extends Rectangle {
	
	// fields
	int side;

	/**
	 * Constructor method
	 * 
	 * @param side
	 */
	public Square(int side) {
		super(side, side);
		this.side = side;
	}
	public double calculateArea() {
		return side* side ; 
	}
	public double calculatePerimeter() { 
		return side*4 ; 
	}
	@Override
	public String toString() {
		return "Square Side: " + side + " Area: " + calculateArea() + " Perimeter: " + calculatePerimeter() ;
	}

}
