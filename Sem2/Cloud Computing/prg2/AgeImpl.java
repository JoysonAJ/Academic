import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDate;
import java.time.Period;

public class AgeImpl extends UnicastRemoteObject implements AgeInt {

    AgeImpl() throws RemoteException {

    }
    @Override
    public String AgeAnswer(String date1) throws RemoteException {
        String[] dates = date1.split("-");

        LocalDate dob = LocalDate.of(Integer.parseInt(dates[2]), Integer.parseInt(dates[1]), Integer.parseInt(dates[0]));
        LocalDate now = LocalDate.now();

        Period pr = Period.between(dob, now);

        String answer = " " + pr.getYears() + "Years " + pr.getMonths() + " Months  " + pr.getDays() + " Days ";

        return answer;
    }
}
