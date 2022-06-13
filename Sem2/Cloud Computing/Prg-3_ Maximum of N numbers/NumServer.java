import java.rmi.Naming;

public class NumServer {
    public static void main(String[] args) {
        try{
            MaxNumber_impl mx = new MaxNumber_impl();
            Naming.rebind("Maximun_Numbers",mx);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
