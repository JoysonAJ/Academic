import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class TimeImplemnt extends UnicastRemoteObject implements TimeInterface {
    TimeImplemnt() throws RemoteException { }

    public Boolean AnsTime(int Time1, int Time2, int Condition) throws RemoteException {

        if (Time1 < Condition && Time2 < Condition)
            return true;
        return false;

    }

    public String TimeAnswer(String time1, String time2) throws RemoteException {
        String[] t1Ary = time1.split(":");
        String[] t2Ary = time2.split(":");

        Boolean Hous, min, secds;

        Hous = AnsTime(Integer.parseInt(t1Ary[0]), Integer.parseInt(t2Ary[0]), 24);
        min = AnsTime(Integer.parseInt(t1Ary[1]), Integer.parseInt(t2Ary[1]), 60);
        secds = AnsTime(Integer.parseInt(t1Ary[2]), Integer.parseInt(t2Ary[2]), 60);

        if ((Hous == true) && (min == true) && (secds == true)) {

            int hrs = 00, ms = 00, scs = 00;

            hrs = Integer.parseInt(t2Ary[0]) - Integer.parseInt(t1Ary[0]);

            if (hrs < 0)
                hrs += 24;

            ms = Integer.parseInt(t2Ary[1]) - Integer.parseInt(t1Ary[1]);

            if (ms < 0) {
                ms += 60;
                hrs--;
            }

            scs = Integer.parseInt(t2Ary[2]) - Integer.parseInt(t1Ary[2]);

            if (scs < 0) {
                scs += 60;
                ms--;
            }
            return  hrs + ":" + (long)ms + ":" + (long)scs;
        } else {
            if (Hous == false)
                return "Hours should with the \n 24 range";
            else if (min == false)
                return "Mintues should not exceeded 60";
            else
                return "Seconds should not exceeded 60";
        }
    }
}
