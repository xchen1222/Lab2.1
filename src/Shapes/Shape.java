package Shapes;

public interface Shape extends Comparable<Shape>{
    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public abstract double semiPerimeter();


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
