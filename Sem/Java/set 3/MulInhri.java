// Multiople Inheritance

import java.util.Scanner;

class student {
    int regno, age;
    String name;

    void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name \t :");
        name = sc.next();
        System.out.println("Enter the Register number \t:");
        regno = sc.nextInt();
        System.out.println("Enter the age \t:");
        age = sc.nextInt();
    }

    void Output() {
        System.out.println("name :\t" + name);
        System.out.println("Register Number:\t" + regno);
        System.out.println("Age \t:" + age);
    }
}

class exam extends student {
    int marks[] = new int[3];

    void Input() {
        Scanner sc = new Scanner(System.in);
        super.Input();
        System.out.println("Enter 3 subjects marks \t:");
        for (int i = 0; i < 3; i++) {
            marks[i] = sc.nextInt();
        }
    }

    void Output() {
        super.Output();
        for (int i = 0; i < 3; i++) {
            System.out.println("Marks in subject" + (i + 1) + "is " + marks[i]);
        }
    }
}

class result1 extends exam {
    int total = 0;

    void Cal() {
        for (int i = 0; i < 3; i++) {
            total += marks[i];
        }
    }

    void Output() {
        super.Output();
        System.out.println("The total of the student" + total);
    }
}

public class MulInhri {
    public static void main(String[] args) {
        result1 re = new result1();
        re.Input();
        re.Cal();
        re.Output();
    }
}
