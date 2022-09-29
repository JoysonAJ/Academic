import java.rmi.Naming;

public class examServer {
    public static void main(String[] args) {
        try {
            examImplementx examImplementx = new examImplementx();
            Naming.rebind("obj", examImplementx);
        } catch (Exception e) {
            System.out.println("Exam server Problem" + e);
        }
    }
}
