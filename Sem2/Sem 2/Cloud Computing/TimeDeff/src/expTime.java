import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class expTime {
    public static void main(String[] args) {

        String time1 = "6:59:00";
        String time2 = "7:00:10";


        String[] t1Ary = time1.split(":");
        String[] t2Ary = time2.split(":");


            int hrs = 0, ms = 0, scs = 0;

            hrs = Integer.parseInt(t1Ary[0]) - Integer.parseInt(t2Ary[0]);

            if (hrs < 0)
                hrs += 24;

            ms = Integer.parseInt(t1Ary[1]) - Integer.parseInt(t2Ary[1]);

            if (ms < 0) {
                ms += 60;
                hrs--;
            }

            scs = Integer.parseInt(t1Ary[2]) - Integer.parseInt(t2Ary[2]);

            if (scs < 0) {
                scs += 60;
                ms--;
            }

            System.out.println(hrs);
            System.out.println(ms);
            System.out.println(scs);


    }
}
