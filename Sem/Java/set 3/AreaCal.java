// Method Overloading

class cal {

    void CalArea(int s) {
        System.out.println("THE AREA OF THE SQUARE \t" + (s * s));
    }

    void CalArea(int l, int b) {
        System.out.println("THE AREA OF THE RECTANGLE \t" + (l * b));
    }

    void CalArea(double r) {
        System.out.println("THE AREA OF CIRCLE OF CIRCLE \t" + (3.14 * r * r));
    }
}

public class AreaCal {
    public static void main(String[] args) {
        cal c = new cal();
        c.CalArea(5);
        c.CalArea(4, 5);
        c.CalArea(2.5);
    }
}
