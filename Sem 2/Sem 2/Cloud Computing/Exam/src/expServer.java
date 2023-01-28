import java.rmi.Naming;

public class expServer {
    public static void main(String[] args) {
        try{
            expImpl expImplObj = new expImpl();
            Naming.rebind("StringName",expImplObj);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
