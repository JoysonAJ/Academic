import javax.xml.catalog.Catalog;

class mythread extends Thread {

    int n;

    mythread(String msg, int m) {
        super(msg);
        n = m;
    }

    public void run() {
        System.out.println("The this is");
        try {
            for (int i = 0; i < n; i++) {
                System.out.println("learning from google meet");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class mythread2 extends Thread {
    int n;

    mythread2(String msg, int m) {
        super(msg);
        n = m;
    }

    public void run() {
        System.out.println("The this is");
        try {
            for (int i = 0; i < n; i++) {
                System.out.println("Using Whatsapp");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class prgs19 {
    public static void main(String[] args) {
        mythread m = new mythread("Meet", 10);
        mythread2 m2 = new mythread2("whatsapp", 8);
        m.start();
        m2.start();
    }
}
