//  Constructor Overloading 

class book {
    String title, author, subject;
    int price, edition;

    book(String t, String a, String s, int p, int e) {
        title = t;
        author = a;
        subject = s;
        price = p;
        edition = e;
    }

    book() {
        title = "";
        author = "";
        subject = "";
        price = 0;
        edition = 0;
    }

    void Display() {
        System.out.println("Title   \t" + title);
        System.out.println("Price   \t" + price);
        System.out.println("Author  \t" + author);
        System.out.println("Edition \t" + edition);
        System.out.println("Subject \t" + subject);
    }
}

class ConstructorOver {
    public static void main(String[] args) {
        book b1 = new book("Basic of Computer", "Charles Babage", "Compter", 300, 2);
        b1.Display();

        book b2 = new book();
        b2.Display();
    }
}