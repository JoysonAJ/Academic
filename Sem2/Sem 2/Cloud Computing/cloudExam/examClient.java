import java.rmi.Naming;
import java.util.Scanner;

public class examClient {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        examData examDataObj;
        String inputVal;
        System.out.println("The input value for  string");
        inputVal = sc.next();
        try {
            examDataObj = (examData) Naming.lookup("rmi://localhost/obj");
            System.out.println("\n\n");
            examDataObj.display(inputVal);
        } catch (Exception e) {
            System.out.println("Eror from the examClient" + e);
        }
    }
}
