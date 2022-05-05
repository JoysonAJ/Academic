

import java.util.Scanner;

class EmpDetails {
    int empid, salary, age;
    String name;

    void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name ");
        name = sc.next();
        System.out.println("Enter the employee id ");
        empid = sc.nextInt();
        System.out.println("Enter the Age");
        age = sc.nextInt();
        System.out.println("Enter the salary ");
        salary = sc.nextInt();
    }

    void Display() {
        System.out.println("THE NAME OF THE EMPLOYEE " + name);
        System.out.println("THE EMPLOYEE ID IS" + empid);
        System.out.println("THE AGE OF EMPLOYEE" + age);
        System.out.println("THE SALARY OF THE EMPLOYEE" + salary);
    }
}

class employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, salary = 0;
        System.out.println("Enter the number of employee \nwho are currently working");
        n = sc.nextInt();
        EmpDetails e[] = new EmpDetails[n];
        for (int i = 0; i < n; i++) {
            e[i] = new EmpDetails();
            e[i].Input();
            e[i].Display();
            salary += e[i].salary;
        }
        System.out.println("THE TOTAL PACKAGE SPEND ON EMPLOYEES IS" + salary);
    }
}