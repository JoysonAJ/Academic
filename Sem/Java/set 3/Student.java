import java.util.Scanner;

class studentDeatails {
    int regno, fee, total = 0;
    int marks[] = new int[3];
    float avrg;

    void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE REGISTER NUMBER : ");
        regno = sc.nextInt();
        System.out.println("ENTER THE FEE OF THE STUDENT");
        fee = sc.nextInt();
        System.out.println("ENTR THE MARKS OF THE STUDENT");
        for (int i = 0; i < 3; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        avrg = total / 3;
    }

    void Display() {
        System.out.println("REGISTER NUMBER =" + regno);
        System.out.println("FEE OF THE STUDENT" + fee);
        System.out.println("MARKS OF THE STUDENT ");
        for (int i = 0; i < 3; i++) {
            System.out.print(marks[i] + "\t");
        }
        System.out.println("PERCENTAGE OF THE STUDNET" + avrg);
    }

    void FeeFull(studentDeatails s1) {
        // studentDeatails re = new studentDeatails();
        int re;
        re = fee + s1.fee;
        System.out.println("The total of 2 students :" + re);
    }
}

public class Student {
    public static void main(String[] args) {
        studentDeatails st1 = new studentDeatails();
        studentDeatails st2 = new studentDeatails();
        st1.Input();
        st1.Display();
        st2.Input();
        st2.Display();
        // studentDeatails st3 = new studentDeatails();
        st1.FeeFull(st2);

    }

}