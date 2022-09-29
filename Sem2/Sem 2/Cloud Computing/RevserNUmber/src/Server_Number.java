import java.rmi.Naming;

public class Server_Number {
    public static void main(String[] args) {
        try{
            Implenetation_Number Object_Implenetation_Number = new Implenetation_Number();
                Naming.rebind("StringNamw",Object_Implenetation_Number);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
