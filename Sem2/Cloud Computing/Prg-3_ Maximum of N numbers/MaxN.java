import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MaxN extends Remote {
    public int MaxOfN_Number(Integer arr[],int n) throws RemoteException;
}
