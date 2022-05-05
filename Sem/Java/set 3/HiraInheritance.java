// Hirarchiel Inheritance

import java.util.Scanner;

class account {
    int acccno;
    String name;

    void GetData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number \t:");
        acccno = sc.nextInt();
        System.out.println("Enter the name \t:");
        name = sc.next();
    }

    void Display() {
        System.out.println("Account Number \t:" + acccno);
        System.out.println("Name of customer \t:" + name);
    }
}

class SB extends account {
    double balance;

    void GetData() {
        super.GetData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Balnce");
        balance = sc.nextDouble();
    }

    void Display() {
        super.Display();
        System.out.println("Balance \t" + balance);
    }
}

class FD extends account {
    double balance;

    void GetData() {
        super.GetData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Balnce");
        balance = sc.nextDouble();
    }

    void Display() {
        super.Display();
        System.out.println("Balance \t" + balance);
    }
}

class Current extends account {
    double balance;

    void GetData() {
        super.GetData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Balnce");
        balance = sc.nextDouble();
    }

    void Display() {
        super.Display();
        System.out.println("Balance \t" + balance);
    }
}

class ShortIntrest extends FD {
    int term;
    double rate;

    void GetData() {
        super.GetData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rate \t:");
        rate = sc.nextDouble();
        System.out.println("Enter the term \t:");
        term = sc.nextInt();
    }

    void Display() {
        super.Display();
        System.out.println("Rate of Intrest \t :" + rate);
        System.out.println("Term is \t:" + term);
    }
}

class MidTerm extends FD {
    int term;
    double rate;

    void GetData() {
        super.GetData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rate \t:");
        rate = sc.nextDouble();
        System.out.println("Enter the term \t:");
        term = sc.nextInt();
    }

    void Display() {
        super.Display();
        System.out.println("Rate of Intrest \t :" + rate);
        System.out.println("Term is \t:" + term);
    }
}

class LongTerm extends FD {
    int term;
    double rate;

    void GetData() {
        super.GetData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rate \t:");
        rate = sc.nextDouble();
        System.out.println("Enter the term \t:");
        term = sc.nextInt();
    }

    void Display() {
        super.Display();
        System.out.println("Rate of Intrest \t :" + rate);
        System.out.println("Term is \t:" + term);
    }
}

public class HiraInheritance {

    int MainMenu(int ch) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("1.SB");
        System.out.println("2. FD");
        System.out.println("3 .CURRENT");
        System.out.println("ENTER THE CHOICE \t:");
        ch = sc.nextInt();
        return ch;
    }

    void SbMenu() {
        SB s = new SB();
        s.GetData();
        s.Display();
    }

    void FdMenu() {
        int ch;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("!.short-term");
            System.out.println("2.Medium-term");
            System.out.println("3.Long-term");
            System.out.println("ENTER THE CHOICE \t:");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("-------Short Term----------------");
                    ShortIntrest sr = new ShortIntrest();
                    sr.GetData();
                    sr.Display();
                    break;
                case 2:
                    System.out.println("-------Mid Term----------------");
                    MidTerm md = new MidTerm();
                    md.GetData();
                    md.Display();
                    break;

                case 3:
                    System.out.println("-------Long Term----------------");
                    LongTerm lg = new LongTerm();
                    lg.GetData();
                    lg.Display();
                    break;
            }
        } while (ch < 4);
    }

    void CurMenu() {
        Current cr = new Current();
        cr.GetData();
        cr.Display();
    }

    public static void main(String[] args) {
        int ch = 0;
        do {
            HiraInheritance h = new HiraInheritance();
            ch = h.MainMenu(ch);
            switch (ch) {
                case 1:
                    h.SbMenu();
                    break;
                case 2:
                    h.FdMenu();
                    break;
                case 3:
                    h.CurMenu();
                    break;
            }
        } while (ch < 4);
    }
}
