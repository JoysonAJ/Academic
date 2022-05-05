// Adding of 2 object 
import java.util.Scanner;

class Cmplx {
    int real, img;

    void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real part : \t");
        real = sc.nextInt();
        System.out.println("Enter the imaginary part : \t");
        img = sc.nextInt();
    }

    void Display() {
        System.out.println(real + "+" + img + "j");
    }

    Cmplx Add(Cmplx c2) {
        Cmplx temp = new Cmplx();
        temp.real = real + c2.real;
        temp.img = img + c2.img;
        return temp;
    }

    Cmplx Subtract(Cmplx c2) {
        Cmplx temp = new Cmplx();
        temp.real = real - c2.real;
        temp.img = img - c2.img;
        return temp;
    }
}

public class Complex {
    public static void main(String[] args) {
        Cmplx c1 = new Cmplx();
        c1.Input();
        c1.Display();
        Cmplx c2 = new Cmplx();
        c2.Input();
        c2.Display();
        Cmplx c3 = new Cmplx();
        c3 = c1.Add(c2);
        c3.Display();
        c3 = c1.Subtract(c2);
        c3.Display();

    }

}
