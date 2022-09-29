import java.rmi.Remote;
import java.rmi.RemoteException;

public interface examData extends Remote {
    public void display(String text) throws RemoteException;
}
