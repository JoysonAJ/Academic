import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddImplentaion extends UnicastRemoteObject implements AddInt{
    AddImplentaion() throws RemoteException{

    }

    @Override
    public double AddNumers(double n1, double n2) throws RemoteException {
        return n1+n2;
    }
}
