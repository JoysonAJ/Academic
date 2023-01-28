import java.rmi.Naming;

public class Server_Num {
    public static void main(String[] args) {
        try{
            AddImplentaion NwObj = new AddImplentaion();
            Naming.rebind("Sums",NwObj);
        }catch(Exception e){
            System.out.println("Eror"+e);
        }
    }
}
