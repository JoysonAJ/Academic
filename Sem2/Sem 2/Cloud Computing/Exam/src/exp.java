import java.rmi.Remote;
import java.rmi.RemoteException;

public interface exp extends Remote {
    public String display(String s) throws RemoteException;
}
