class Outter_demo{
    
    void display_Outter(){
        System.out.println("This is Outter class");
        System.out.println("Calling inner class");
        Inner_demo inner = new Inner_demo();
        inner.Display_Inner();
        System.out.println("Value of x in Inner Classs "+inner.x);
    }

    class Inner_demo{
        int x=0;
        void Display_Inner(){
            System.out.println("--------------------");
            System.out.println("This is Inner class");
        }
    }
}

class Lab3_InnerClass{
    public static void main(String[] args) {
        System.out.println("\n\n");
        Outter_demo o = new Outter_demo();
        o.display_Outter();
    }
}

