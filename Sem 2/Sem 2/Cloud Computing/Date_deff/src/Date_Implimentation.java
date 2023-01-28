import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.getInstance;

public class Date_Implimentation extends UnicastRemoteObject implements date_Interface {

    Date_Implimentation() throws RemoteException {
    }

    public Date Function(String Dates) throws RemoteException {
        Calendar calendar = getInstance();
        String[] date1 = Dates.split("-");

        calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(date1[0]));
        calendar.set(Calendar.MONTH, (Integer.parseInt(date1[1])) - 1);
        calendar.set(Calendar.YEAR, Integer.parseInt(date1[2]));

        Date newDAte = calendar.getTime();

        return newDAte;
    }

    @Override
    public long Days(String d1, String d2) throws RemoteException {
        Date Firstdate = this.Function(d1);
        Date SecondDate = this.Function(d2);

        System.out.println(Firstdate);
        System.out.println(SecondDate);

        long AnswerDate = SecondDate.getTime() - Firstdate.getTime();
        AnswerDate = AnswerDate/1000/60/60/24;
        System.out.println(AnswerDate);
        return AnswerDate;

    }
}
