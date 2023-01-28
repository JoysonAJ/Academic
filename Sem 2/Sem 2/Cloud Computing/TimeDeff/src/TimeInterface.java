import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TimeInterface extends Remote {
    public Boolean AnsTime(int Time1, int Time2, int Condition) throws RemoteException;

    public String TimeAnswer(String time1, String time2) throws RemoteException;
}
