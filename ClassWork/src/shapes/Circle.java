package shapes;

public class Circle implements Shape{
    //fields
    private int radius;
    private static double pi = 3.14;

    public Circle(int radius)
    {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * pi;
    }

    @Override
    public double calculatePerimeter()
    {
        return radius*2*pi;
    }

    @Override
    public String toString()
    {
        return "Circle Radius: " + radius + " Area: " + this.calculateArea() + " Perimeter: " + this.calculatePerimeter();
    }
}
