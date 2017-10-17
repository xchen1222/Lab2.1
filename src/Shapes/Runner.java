package Shapes;

public class Runner {

    public static void main (String[] args)
    {
        Shape circle1 = new Circle(10);
        Shape rectangle1 = new Rectangle(10, 4);
        Shape square1 = new Square(10);

        Shape [] shapeArr = new Shape[10];

        Shape.sumArea(shapeArr);

        System.out.print("Total Area = " + (square1.calculateArea() + circle1.calculateArea() + rectangle1.calculateArea()));
    }


}
