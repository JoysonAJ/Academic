import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class expImpl extends UnicastRemoteObject implements exp {
    public expImpl() throws RemoteException {
    }

    public String display(String s) throws RemoteException {
        return s;
    }
}
