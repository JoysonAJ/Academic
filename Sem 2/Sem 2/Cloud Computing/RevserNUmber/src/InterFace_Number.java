import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterFace_Number extends Remote {
    public String Return_Number(String Input_Text) throws RemoteException;
}
