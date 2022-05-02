class table {
    synchronized void Display(int val) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(val + "*" + i + "=" + (val * i));
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class mythread extends Thread {
    table t;
    int n;

    mythread(int n, table t) {
        this.t = t;
        this.n = n;
    }

    public void run() {
        t.Display(n);
    }
}

public class prg21 {
    public static void main(String[] args) {
        table t = new table();
        mythread m1 = new mythread(4, t);
        mythread m2 = new mythread(5, t);
        m1.start();
        m2.start();

    }
}
