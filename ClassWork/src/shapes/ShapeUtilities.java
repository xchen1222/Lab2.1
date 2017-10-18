package shapes;

import java.util.Random;

public class ShapeUtilities {
    public static Shape randomShape()
    {
        Random rand = new Random();
        int x = rand.nextInt(3);

        switch (x) {
            case 0:
                return new Circle(rand.nextInt(100));
            case 1:
                return new Rectangle(rand.nextInt(50), rand.nextInt(50));
            case 2:
                return new Square(rand.nextInt(50));
        }
        return new Circle(rand.nextInt(100));

    }
    public static double sumArea(Shape [] shapes)
    {
        double total = 0;
        for(Shape x : shapes)
        {
            total += x.calculateArea();
        }
        return total;
    }

    public static double sumPerimeter(Shape[] shapes)
    {
        double total = 0;
        for(int x = 0; x<shapes.length; x++)
        {
            total += shapes[x].calculatePerimeter();
        }
        return total;
    }

}
