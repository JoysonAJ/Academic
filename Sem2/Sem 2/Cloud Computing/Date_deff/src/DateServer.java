import java.rmi.Naming;

public class DateServer {
    public static void main(String[] args) {
        try{
            Date_Implimentation dt = new Date_Implimentation();
            Naming.rebind("DatesObj",dt);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
