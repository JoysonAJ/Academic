import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.Naming;

public class Client_Number extends JFrame implements ActionListener {

    JLabel l1;
    JTextField t1,t2;
    JButton btn1;

    public Client_Number(){
        l1 = new JLabel("Enter the Number");

        t1 = new JTextField(20);
        t2 = new JTextField(20);

        btn1 = new JButton("Reverse");

        btn1.addActionListener(this);

        getContentPane().setLayout(new GridLayout(5,10));

        getContentPane().add(l1);

        getContentPane().add(t1);

        getContentPane().add(btn1);

        getContentPane().add(t2);

    }

    public void actionPerformed(ActionEvent ae){
       try{
           InterFace_Number nw = (InterFace_Number) Naming.lookup("rmi://localhost/StringNamw");
           String s1 = t1.getText();
           t2.setText(nw.Return_Number(s1));
       }catch (Exception e){
           System.out.println(e);
       }
    }

    public static void main(String[] args) {
        Client_Number cl = new Client_Number();
        cl.setVisible(true);
        cl.pack();
    }
}
