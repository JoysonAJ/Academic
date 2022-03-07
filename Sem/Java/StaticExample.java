class cars {
    static int count = 0;
    int ct = 0;

    cars() {
        count++;
        ct++;
    }

    static {
        System.out.println(" Number of Cars Owned by owner");
    }

    static void DisplayCount() {
        System.out.println("\nSo Total Cars =  " + count);
    }

    void Display() {
        System.out.println("\n New Car = " + ct);
    }
}

public class StaticExample {
    public static void main(String[] args) {
        cars c1 = new cars();
        c1.Display();
        cars.DisplayCount();

        cars c2 = new cars();
        c2.Display();
        cars.DisplayCount();

        cars c3 = new cars();
        c3.Display();
        cars.DisplayCount();

    }
}
