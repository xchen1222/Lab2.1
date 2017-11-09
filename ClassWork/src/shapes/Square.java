package shapes;

public class Square extends Rectangle {

	int side;

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
		// To be written by student
		return "Square Side: " + side + " Area: " + calculateArea() + " Perimeter: " + calculatePerimeter() ;
	}

}
