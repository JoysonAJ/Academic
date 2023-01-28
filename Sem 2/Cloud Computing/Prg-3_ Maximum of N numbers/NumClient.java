import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.Naming;


public class NumClient extends JFrame implements ActionListener {
    JTextField t1,t2,ans;
    JLabel l1,l2,lAns;
    JButton btn;

    public NumClient(){
        super("Lab program 3 -> nth maximum element");
        l1 = new JLabel("Enter the Numbers");
        l2 = new JLabel("Enter n value");

        t1 = new JTextField(20);
        t2 = new JTextField(20);

        ans = new JTextField(20);

        btn = new JButton(" Results ");

        btn.addActionListener(this);

        getContentPane().setLayout(new GridLayout(4,5));

        getContentPane().add(l1);
        getContentPane().add(t1);

        getContentPane().add(l2);
        getContentPane().add(t2);

        getContentPane().add(btn);
        getContentPane().add(ans);


    }
    @Override
    public void actionPerformed(ActionEvent e){
        try{
            MaxN mn = (MaxN) Naming.lookup("rmi://localhost/Maximun_Numbers");
            String text = t1.getText();
            String[] strArr =text.split(",");
            int sizeArr = strArr.length;
            Integer[] Numbers = new Integer[sizeArr];
            for(int i=0;i<sizeArr;i++){
                Numbers[i] = (Integer) Integer.parseInt(strArr[i]);
            }
            int n2 = Integer.parseInt(t2.getText());
            ans.setText(" "+mn.MaxOfN_Number(Numbers,n2));
        }catch(Exception e2){
            System.out.println("Eror ->"+e2);
        }
    }

        public static void main(String[] args) {
            try {
                NumClient nm = new NumClient();
                nm.setVisible(true);
                nm.pack();
            } catch (Exception e1) {
                System.out.println(e1);
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