abstract class Shape
{
    public abstract double GetArea();
}

class Square : Shape
{
    public double Side;

    public Square(double side)
    {
        Side = side;
    }

    public override double GetArea()
    {
        return Side * Side;
    }
}

class Circle : Shape
{
    public double Radius;

    public Circle(double radius)
    {
        Radius = radius;
    }

    public override double GetArea()
    {
        return Math.PI * Radius * Radius;
    }
}

class Program
{
    static void Main(string[] args)
    {
        Shape shape1 = new Square(4);
        Shape shape2 = new Circle(4.5);

        Console.WriteLine("Area of square: " + shape1.GetArea());
        Console.WriteLine("Area of circle: " + shape2.GetArea());
    }
}
