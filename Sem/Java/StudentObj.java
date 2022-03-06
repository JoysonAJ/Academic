import java.util.Scanner;

class Student {
    int regno;
    String Name, College, Course;
    float CGPA;

    Student() {
        regno = 0;
        Name = "";
        College = "";
        Course = "";
        CGPA = 0;
        System.out.println("Default Constructor ");
    }

    Student(int regno, String Name, String College, String Course, float CGPA) {
        this.regno = regno;
        this.Name = Name;
        this.College = College;
        this.Course = Course;
        this.CGPA = CGPA;
        System.out.println("Parameterized Constructor ");
    }

    void Display() {
        System.out.println("The Register Number :" + regno);
        System.out.println("The Name Of The Studnet :" + Name);
        System.out.println("The Course  :" + Course);
        System.out.println("The name of the Collge :" + College);
        System.out.println("The CGPA of the Student :" + CGPA);
        System.out.println("\n-------------------------------------------------");
    }
}

class StudentObj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student st = new Student();
        st.Display();

        int regno;
        String Name, College, Course;
        float CGPA;
        System.out.println("Enter the name of the Student");
        Name = sc.next();
        System.out.println("Enter the register number :");
        regno = sc.nextInt();
        System.out.println("Enter the Course name :");
        Course = sc.next();
        System.out.println("Enter the college name :");
        College = sc.next();
        System.out.println("Enter the CGPA :");
        CGPA = sc.nextFloat();
        Student st2 = new Student(regno, Name, College, Course, CGPA);
        st2.Display();

    }
}
