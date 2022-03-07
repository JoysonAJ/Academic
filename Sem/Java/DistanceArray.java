import java.util.Scanner;

class Distance {
    int feet;
    float inches;

    Distance() {
        feet = 0;
        inches = 0;
    }

    Distance(int feet, float inches) {
        this.feet = feet;
        this.inches = inches;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the feet And inches :\t");
        feet = sc.nextInt();
        inches = sc.nextFloat();
        System.out.print("\n");
    }

    void display() {
        if (inches >= 12) {
            float temp = inches;
            int ft = (int) inches / 12;

            inches = temp % 12;
            feet = feet + ft;
        }
        System.out.println("The Feet is : " + feet);
        System.out.println("The inches is:" + inches);
    }

    Distance add(Distance dd) {
        int f = feet + dd.feet;
        float in = inches + dd.inches;
        Distance temp = new Distance(f, in);
        return temp;
    }
}

public class DistanceArray {
    public static void main(String[] args) {
        Distance d[] = new Distance[10];
        for (int i = 0; i < 10; i++) {
            d[i] = new Distance();
            d[i].input();
        }
        Distance sum = new Distance();
        for (int i = 0; i < 10; i++) {
            sum = sum.add(d[i]);
        }
        System.out.println("---------------------------------------------");
        sum.display();
    }
}