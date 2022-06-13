import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalDate;
import java.util.Date;

public interface date_Interface extends Remote {
    public Date Function(String s) throws RemoteException;
    public long Days(String d1,String d2) throws RemoteException;
}
