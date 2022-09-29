import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.Naming;

public class expClient extends JFrame implements ActionListener {
    JTextField t1, t2;
    JLabel l1;
    JButton ans;

    public expClient() {
        l1 = new JLabel("Enter the text");

        t1 = new JTextField(20);
        t2 = new JTextField(20);

        ans = new JButton("SUBMIT");

        ans.addActionListener(this);

        getContentPane().setLayout(new GridLayout(5, 10));

        getContentPane().add(l1);
        getContentPane().add(t1);

        getContentPane().add(ans);
        getContentPane().add(t2);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            exp expObj = (exp) Naming.lookup("rmi://localhost/StringName");
            String s = t1.getText();
            t2.setText(expObj.display(s));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        try {
            expClient expClientObj = new expClient();
            expClientObj.setVisible(true);
            expClientObj.pack();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
