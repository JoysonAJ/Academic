import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.Naming;
import java.sql.Time;

public class TimeClient extends JFrame implements ActionListener {
    JTextField t1,t2,t3;
    JLabel l1,l2;
    JButton btn;

    public TimeClient(){
        super("Time Deference Program");
        t1 = new JTextField(30);
        t2 = new JTextField(30);
        t3 = new JTextField(30);

        l1 = new JLabel("Enter the First Time ");
        l2 = new JLabel("Enter the Second Time");

        btn = new JButton("Time Deference ->");

        btn.addActionListener(this);

        getContentPane().setLayout(new GridLayout(4,5));

        getContentPane().add(l1);
        getContentPane().add(t1);

        getContentPane().add(l2);
        getContentPane().add(t2);

        getContentPane().add(btn);
        getContentPane().add(t3);

    }

  @Override
  public void actionPerformed(ActionEvent e){
        try{
            String time1 = t1.getText();
            String time2 = t2.getText();
            TimeInterface mint = (TimeInterface) Naming.lookup("rmi://localhost/TimeDeff");
            t3.setText(mint.TimeAnswer(time1,time2));

        }catch (Exception e11){
            System.out.println(e11);
        }
    }
    public static void main(String[] args) {
        try {
            TimeClient TClient = new TimeClient();
            TClient.setVisible(true);
            TClient.pack();


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
