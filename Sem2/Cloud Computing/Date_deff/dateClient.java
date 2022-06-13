import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.Naming;
import java.time.LocalDate;

public class dateClient extends JFrame implements ActionListener {
    JTextField d1,d2,ans;
    JLabel l1,l2;
    JButton Answer;

    public dateClient(){
        super("Defferance between the two Dates");

        l1 = new JLabel("First date (DD-MM-YYYY");
        l2 = new JLabel("Second date (DD-MM-YYYY");

        d1 = new JTextField(20);
        d2 = new JTextField(20);

        ans = new JTextField(20);

        Answer = new JButton(" Results ");

        Answer.addActionListener(this);

        getContentPane().setLayout(new GridLayout(4,5));

        getContentPane().add(l1);
        getContentPane().add(d1);

        getContentPane().add(l2);
        getContentPane().add(d2);

        getContentPane().add(Answer);
        getContentPane().add(ans);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            date_Interface dt = (date_Interface) Naming.lookup("rmi://localhost/DatesObj");
            String date1, date2;
            date1 = d1.getText();
            date2 = d2.getText();
            ans.setText(String.valueOf(dt.Days(date1,date2)));
        }catch (Exception e1){
            System.out.println(e1);
        }

    }
    public static void main(String[] args) {
        try {
            dateClient Client = new dateClient();
            Client.setVisible(true);
            Client.pack();
          /*  date_Interface dt = (date_Interface) Naming.lookup("rmi://localhost/DatesObj");
            String date1, date2;
            date1 = "1-4-2000";
            date2 = "1-6-2000";
            System.out.println(dt.Days(date1, date2));*/
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
