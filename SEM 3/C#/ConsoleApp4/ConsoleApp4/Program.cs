class Person
{
    public string Name;
    public int Age;

    public Person(string name, int age)
    {
        Name = name;
        Age = age;
    }

    public void displayData()
    {
        Console.WriteLine("Name: " + Name);
        Console.WriteLine("Age: " + Age);
    }
}

class Student : Person
{
    public string School;

    public Student(string name, int age, string school) : base(name, age){
        School = school;
    }

    public void displayData(){
        base.displayData();
        Console.WriteLine("School: " + School);
    }
}

class Program
{
    static void Main(string[] args)
    {
        Student student = new Student("Nevil", 20, "XYZ High School");
        student.displayData();
    }
}
