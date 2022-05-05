class OutterClass{
    static int i=0;

    static class Inner{
        int j = 50;
        void Display_Inner(){
            System.out.println("---------Static Class ------------");
            System.out.println("Variable in Inner class "+i);
            System.out.println("Variable in Ouuter class");
        }
    }
}

public class staticNasted {
    public static void main(String[] args) {
        OutterClass.Inner innerObj = new OutterClass.Inner();
        innerObj.Display_Inner();
    }
}
