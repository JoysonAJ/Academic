import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.rmi.Naming;

public class AgeClient extends JFrame implements ActionListener {

    JLabel l1;
    JTextField in1, out1;
    JButton ans;

    public AgeClient() {
        l1 = new JLabel("Enter the Date of Birth");

        in1 = new JTextField(20);
        out1 = new JTextField(20);

        ans = new JButton("Age ->");

        ans.addActionListener(this);

        getContentPane().setLayout(new GridLayout(5, 5));

        getContentPane().add(l1);
        getContentPane().add(in1);

        getContentPane().add(ans);
        getContentPane().add(out1);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {

            AgeInt ag = (AgeInt) Naming.lookup("rmi://localhost/FinalAnswer");
            String date1 = in1.getText();
            out1.setText(ag.AgeAnswer(date1));
        } catch (Exception e1) {
            System.out.println("Eror at age Client override \n" + e1);
        }
    }

    public static void main(String[] args) {
        try {
            AgeClient agcli = new AgeClient();
            agcli.setVisible(true);
            agcli.pack();
        } catch (Exception e1) {
            System.out.println("Eror at age Client main \n" + e1);
        }
    }
}
