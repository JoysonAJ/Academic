import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AddInt extends Remote {
    public double AddNumers(double n1, double n2) throws RemoteException;
}
