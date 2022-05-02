import java.util.Scanner;

class passwordVali {
    String passwrd;
    String old = "Hello88World";
    String simple = "123456789";
    String last = "Password";

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password");
        passwrd = sc.next();
    }

    void validate() {
        char c;
        int num = 0, alpha = 0, l = 0, u = 0;
        if (passwrd.length() >= 8) {

            if (passwrd.equals(old)) {
                System.out.println("Simillar to Old Password");
                return;
            }

            if (passwrd.equals(simple) || passwrd.equals(last)) {
                System.out.println("Password is weak");
                return;

            }
            for (int i = 0; i < passwrd.length(); i++) {
                c = passwrd.charAt(i);
                if (Character.isLetter(c))
                    alpha++;
                if (Character.isDigit(c))
                    num++;
                if (Character.isLowerCase(c))
                    l++;
            }

        }
        System.out.println("The password details");
        System.out.println("number of latter" + alpha);
        System.out.println("number of Digits" + num);

    }
}

class prg7 {
    public static void main(String[] args) {
        passwordVali v = new passwordVali();
        v.input();
        v.validate();
    }
}