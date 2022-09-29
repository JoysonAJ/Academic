import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.*;

public class dateExp {

    public Date fun(String firstDate) {

        Calendar calendar = getInstance();
        String[] date1 = firstDate.split("-");

        calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(date1[0]));
        calendar.set(Calendar.MONTH, (Integer.parseInt(date1[1])) - 1);
        calendar.set(Calendar.YEAR, Integer.parseInt(date1[2]));

        Date newDAte = calendar.getTime();

        return newDAte;
    }

    public static void main(String[] args) {

        dateExp dt = new dateExp();

        Calendar calendar = getInstance();

        String firstDate = "1-4-2000";
        String nowDate = "1-6-2000";

        Date ns = dt.fun(firstDate);
        System.out.println(ns);

        Date ns2 = dt.fun(nowDate);
        System.out.println(ns2);



        long AnswerDate = ns2.getTime() - ns.getTime();

        System.out.println("\n\n\n");
        AnswerDate = AnswerDate/1000/60/60/24;
        System.out.println(AnswerDate);
        System.out.println("\n\n\n");


    }
}
