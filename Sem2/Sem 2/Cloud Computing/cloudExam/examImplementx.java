import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class examImplementx extends UnicastRemoteObject implements examData {

    examImplementx() throws RemoteException{

    }

    @Override
    public void display(String text) throws RemoteException {
        System.out.println("The Displayeed result is :"+text);

    }
}
