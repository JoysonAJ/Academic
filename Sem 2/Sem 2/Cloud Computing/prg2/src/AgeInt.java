import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AgeInt extends Remote {
    public String AgeAnswer(String date1) throws RemoteException;
}
