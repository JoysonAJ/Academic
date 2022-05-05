
//Dynamic Method Dispatch
import java.util.Scanner;

class employee {
    int id;
    String name;
    Double basic;

    void GetData() {
    }

    void Display() {
    }
}

class programmer extends employee {

    int work_hour;

    void GetData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NAME :");
        name = sc.next();
        System.out.println("ENTER THE ID :");
        id = sc.nextInt();
        System.out.println("ENTER THE BASIC PAY \t:");
        basic = sc.nextDouble();
        System.out.println("ENTER THE WORK HOUR \t:");
        work_hour = sc.nextInt();
    }

    void Display() {
        System.out.println("\n\nPROGRAMMER\n\n");
        System.out.println("THE NAME :" + name);
        System.out.println("THE ID :" + id);
        System.out.println("THE BASIC PAY \t:" + basic);
        System.out.println("THE WORK HOUR \t:" + work_hour);
    }
}

class HR extends employee {
    int work_hour;

    void GetData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NAME :");
        name = sc.next();
        System.out.println("ENTER THE ID :");
        id = sc.nextInt();
        System.out.println("ENTER THE BASIC PAY \t:");
        basic = sc.nextDouble();
        System.out.println("ENTER THE WORK HOUR \t:");
        work_hour = sc.nextInt();
    }

    void Display() {
        System.out.println("\n\nHR\n\n");
        System.out.println("THE NAME :" + name);
        System.out.println("THE ID :" + id);
        System.out.println("THE BASIC PAY \t:" + basic);
        System.out.println("THE WORK HOUR \t:" + work_hour);
    }
}

public class DyMethod {

    int Menu(int ch) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("1.Programmer");
        System.out.println("2. HR");
        System.out.println("ENTER THE CHOICE \t:");
        ch = sc.nextInt();
        return ch;
    }

    public static void main(String[] args) {
        int ch = 0, i = -1;

        DyMethod d = new DyMethod();
        // employee e;
        employee e[] = new employee[4];
        do {
            if (i < 3) {
                ch = d.Menu(ch);
                switch (ch) {
                    case 1:
                        e[++i] = new programmer();
                        e[i].GetData();
                        e[i].Display();
                        break;
                    case 2:
                        e[++i] = new HR();
                        e[i].GetData();
                        e[i].Display();
                        break;
                }
            }
        } while (ch < 3);

    }
}
