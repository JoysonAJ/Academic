import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Implenetation_Number extends UnicastRemoteObject implements InterFace_Number {

    public  Implenetation_Number() throws  RemoteException{

    }
    @Override
    public String Return_Number(String Input_Text) throws RemoteException {
        int n = Integer.parseInt(Input_Text);
        int rem,rev,ans;
        while(n>0){
            rem = n %10;
        }
        return null;
    }
}
