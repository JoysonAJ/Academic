class InvalidAgeException : Exception
{
    public InvalidAgeException(string message) : base(message)
    {
    }
}

class Person
{
    public int Age;

    public void SetAge(int age)
    {
        if (age < 0)
        {
            throw new InvalidAgeException("Age cannot be negative.");
        }

        Age = age;
    }
}

class Program
{
    static void Main(string[] args)
    {
        Person person = new Person();
        try
        {
            person.SetAge(-5);
        }
        catch (InvalidAgeException ex)
        {
            Console.WriteLine(ex.Message);
        }
    }
}

