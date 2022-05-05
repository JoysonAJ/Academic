import java.util.Scanner;

class Distance {
    int feet;
    float inches;

    Distance() {
        feet = 0;
        inches = 0;
    }

    void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Inches :");
        inches = sc.nextFloat();
        System.out.println("Enter the Feet :");
        feet = sc.nextInt();
    }

    void Display() {

        if (inches >= 12) {
            float temp = inches;
            int ft = (int) inches / 12;

            inches = temp % 12;
            feet = feet + ft;
        }

        System.out.println("Feet is :" + feet);
        System.out.println("Inches are :" + inches);

    }

    Distance Add(Distance d1) {
        Distance d = new Distance();
        d.feet = feet + d1.feet;
        d.inches = inches + d1.inches;
        return d;

    }
}

public class DistanceArr {
    public static void main(String[] args) {
        Distance d1[] = new Distance[10];
        for (int i = 0; i < 10; i++) {
            d1[i] = new Distance();
            System.out.println("Distance Object " + (i + 1));
            d1[i].Input();
            d1[i].Display();
            System.out.println(" ");
        }
        System.out.println("-----------------------------");
        int i = 0;
        while (i < 9) {
            d1[i + 1] = d1[i + 1].Add(d1[i]);
            i++;
        }
        System.err.println("\n\n" + i + "\n\n");
        d1[i].Display();
    }
}
