
class mythread implements Runnable {
    Thread t1;
    int n;

    mythread(String msg, int m) {
        t1 = new Thread(msg);
        n = m;
    }

    public void run() {
        System.out.println("The this is" + t1.getName());
        try {
            for (int i = 0; i < n; i++) {
                System.out.println("learning from google meet");
                t1.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class mythread2 implements Runnable {
    int n;
    Thread t2;

    mythread2(String msg, int m) {
        t2 = new Thread(msg);
        n = m;
    }

    public void run() {
        System.out.println("The this is" + t2.getName());
        try {
            for (int i = 0; i < n; i++) {
                System.out.println("Using Whatsapp");
                t2.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class prg20 {
    public static void main(String[] args) {
        mythread m = new mythread("Meet", 10);
        mythread2 m2 = new mythread2("whatsapp", 8);
        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m2);
        t1.start();
        t2.start();
    }
}
