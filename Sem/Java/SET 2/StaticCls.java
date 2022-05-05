class car {
    static int i = 0;

    car() {
        i++;
    }

    void display() {
        System.out.println("i=" + i);
    }

    static void incr() {
        i += 2;
    }
}

public class StaticCls {
    public static void main(String[] args) {
        car c[] = new car[10];
        for (int i = 0; i < 4; i++) {
            c[i] = new car();
            c[i].display();
            System.out.println("after " + i + " Static function called");
            car.incr();
            c[i].display();
            System.out.println("-------------------------------------------");
        }
    }
}
