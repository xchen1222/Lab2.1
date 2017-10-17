package Shapes;


public class Runner {

    public static void main (String[] args)
    {
        Shape circle1 = new Circle(10);
        Shape rectangle1 = new Rectangle(10, 4);
        Shape square1 = new Square(10);

        Shape [] shapeArr = new Shape[10];

        for (int i = 0; i < shapeArr.length; i++)
        {
            shapeArr[i] = ShapeUtilities.randomShape();
        }

        for (Shape shape : shapeArr)
        {
            System.out.println(shape);
        }

        System.out.println("Total Area: " + ShapeUtilities.sumArea(shapeArr));

    }


}
