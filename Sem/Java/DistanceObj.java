class Distance {
    int feet;
    float inches;

    Distance() {
        feet = 0;
        inches = 0;
    }

    Distance(int f, float i) {
        feet = f;
        inches = i;
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

class DistanceObj {
    public static void main(String[] args) {
        Distance d1 = new Distance(12, 105.5f);
        d1.Display();
        Distance d2 = new Distance(8, 27.5f);
        d2.Display();
        Distance d3 = new Distance();
        d3 = d2.Add(d1);
        d3.Display();
    }
}