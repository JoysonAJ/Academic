//Illustrate constructor in inheritance

class room {
    int length, breadth;

    room(int x, int y) {
        length = x;
        breadth = y;
    }

    int area() {
        return (length * breadth);
    }
}

class GuestRoom extends room {
    int height;

    GuestRoom(int x, int y, int z) {
        super(x, y);
        height = z;
    }

    int volume() {
        return (length * breadth * height);

    }
}

public class House {
    public static void main(String[] args) {
        GuestRoom r = new GuestRoom(14, 12, 10);
        int area1 = r.area();
        int volume1 = r.volume();
        System.out.println("Area is equal to " + area1);
        System.out.println("Volumne is equal to" + volume1);
    }
}
