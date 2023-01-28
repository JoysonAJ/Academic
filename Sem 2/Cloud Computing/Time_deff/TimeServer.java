import java.rmi.Naming;

public class TimeServer {
    public static void main(String[] args) {
        try{
            TimeInterface tm = new TimeImplemnt();
            Naming.rebind("TimeDeff",tm);
        }catch (Exception e1){
            System.out.println(e1);
        }
    }
}
