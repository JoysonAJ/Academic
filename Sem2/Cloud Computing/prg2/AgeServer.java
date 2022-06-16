import java.rmi.Naming;

public class AgeServer {
    public static void main(String[] args) {

        try {
            AgeImpl ag = new AgeImpl();
            Naming.rebind("FinalAnswer", ag);

        } catch (Exception e) {
            System.out.println("eror at AgeServer\n" + e);
        }
    }
}
