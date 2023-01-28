interface IMovable
{
    void Move();
}

class Car : IMovable
{
    public int CurrentSpeed { get; set; }

    public void Move()
    {
        CurrentSpeed += 10;
        Console.WriteLine("Car is moving at " + CurrentSpeed + " km/h.");
    }
}

class Person : IMovable
{
    public int CurrentSteps { get; set; }

    public void Move()
    {
        CurrentSteps++;
        Console.WriteLine("Person has taken " + CurrentSteps + " steps.");
    }
}

class Program
{
    static void Main(string[] args)
    {
        IMovable car = new Car();
        car.Move();

        IMovable person = new Person();
        person.Move();

    }
}


