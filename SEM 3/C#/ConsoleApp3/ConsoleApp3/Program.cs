class Student
{
    string Name;
    int Age;
    string Grade;

    public Student(string name, int age, string grade)
    {
        Name = name;
        Age = age;
        Grade = grade;
    }

    public void displayStudents()
    {
        Console.WriteLine(Name + ", " + Age + ", " + Grade);
    }
}

class Program
{
    static void Main(string[] args)
    {
        Student student1 = new Student("Shravan ", 20, "A");
        Student student2 = new Student("John", 19, "B");
        student1.displayStudents();
        student2.displayStudents();
    }
}
