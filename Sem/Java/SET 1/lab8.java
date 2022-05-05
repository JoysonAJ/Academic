/*
demonstrate static class variable,static block, static method count class 
*/

class cars
{
    static int count=0; 
    cars()
    {
        count++;
    }

    void display()
    {
        System.out.println(count);
    }

    static void clr()
    {
        count=0;
    }
    static{
        //code runs before main
        System.out.println("cars are being generated");

    }



    
}

public class lab8 {
    public static void main(String args[])
    {
        //static variable increments as the objects of class cars are created.
        cars a=new cars();
        a.display();
        cars a1=new cars();
        a.display();
        cars a2=new cars();
        a.display();
        cars a3=new cars();
        a1.display();
        cars a4=new cars();
        a2.display();
        a4.display();

        //calling static method.
        cars.clr();
        
        a3.display();
    }
    
}
