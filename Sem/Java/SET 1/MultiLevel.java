import java.util.Scanner;

class Box {
    float length, breath, height;

    Box() {
        length = breath = height = 0;
    }

    Box(Float length, Float breath, Float height) {
        this.length = length;
        this.breath = breath;
        this.height = height;
    }

    void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH: ");
        length = sc.nextFloat();
        System.out.println("ENTER THE BREATH");
        breath = sc.nextFloat();
        System.out.println("ENTER THE HEIGHT");
        height = sc.nextFloat();
    }

    void Display() {
        System.out.println("LENGTH:" + length);
        System.out.println("BREATH:" + breath);
        System.out.println("HEIGHT:" + height);
    }

    float volume() {
        return length * breath * height;
    }

}

class Boxweight extends Box {
    float weight;

    Boxweight() {
        super();
        weight = 0;
    }

    Boxweight(Float l, Float b, Float h, Float w) {
        super(l, b, h);
        weight = w;
    }

    void Input() {
        Scanner sc = new Scanner(System.in);
        super.Input();
        System.out.println("ENTER THE WEIGHT");
        weight = sc.nextFloat();
    }

    void Display() {
        super.Display();
        System.out.println("WEIGHT:" + weight);
    }

}

class Boxshipment extends Boxweight {
    float cost;

    Boxshipment() {
        super();
        cost = 0;
    }

    Boxshipment(Float l, float b, float h, float w, float c) {
        super(l, b, h, w);
        cost = c;
    }

    void Input() {
        Scanner sc = new Scanner(System.in);
        super.Input();
        System.out.println("ENTER COST");
        cost = sc.nextInt();
    }

    void Display() {
        super.Display();
        System.out.println("COST:" + cost);
    }
}

class MultiLevel {
    public static void main(String args[]) {
        System.out.println("------------------------------------");
        Boxshipment b1 = new Boxshipment(4.0f, 2.0f, 5.0f, 10.0f, 15.0f);
        b1.Display();
        System.out.println("VOLUME OF BOX:" + b1.volume());
        System.out.println("------------------------------------");
        
        Boxshipment b2 = new Boxshipment();
        b2.Input();
        b2.Display();
        System.out.println("VOLUME OF BOX:" + b2.volume());
    }
}