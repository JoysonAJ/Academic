import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.Naming;


public class ClientJava extends JFrame implements ActionListener {
    JLabel l1, l2;
    JTextField t1, t2, res;
    JButton jb1;

    ClientJava() {

        super("The Sume of the two Numbers");
        l1 = new JLabel("Enter the Number1 -> ");
        l2 = new JLabel("Enter the Number2 -> ");

        t1 = new JTextField(20);
        t2 = new JTextField(20);

        res = new JTextField(20);

        jb1 = new JButton("Click here");

        jb1.addActionListener(this);

        getContentPane().setLayout(new GridLayout(3, 2));

        getContentPane().add(l1);
        getContentPane().add(t1);

        getContentPane().add(l2);
        getContentPane().add(t2);

        getContentPane().add(jb1);
        getContentPane().add(res);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.println("Hello World");
        try {
            AddInt A = (AddInt) Naming.lookup("rmi://localhost/Sums");
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());

            res.setText(""+A.AddNumers(num1,num2));

        } catch (Exception er) {
            System.out.println("Eror genrated" + er);
        }
    }

    public static void main(String[] args) {
        try {
            ClientJava c = new ClientJava();
            c.setVisible(true); // for the java promt
            c.pack();
            //c.setSize(500,500);
            /*AddInt obj;
            obj = (AddInt) Naming.lookup("rmi://localhost/Sums");
            System.out.println("The sums of 2 numbers"+obj.AddNumers(4,4));*/
        } catch (Exception e) {
            System.out.println("The Eror is " + e);
        }
    }

}






/*
public class ClientJava {
    public static void main(String[] args) {
        try {

//            Phase 1
            AddInt obj;
                obj = (AddInt) Naming.lookup("rmi://localhost/Sums");
            System.out.println("The sums of 2 numbers"+obj.AddNumers(4,4));
        }catch (Exception e){
            System.out.println("The Eror is "+e);
        }
    }
}
 */