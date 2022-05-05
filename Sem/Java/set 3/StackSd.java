import java.util.Scanner;

interface stack {
    void push(int item);

    void pop();

    void Display();
}

class fstack implements stack {
    int top, i;
    int arr[];
    int max;

    fstack(int m) {
        top = -1;
        max = s;
        arr = new int[max];
    }

    public void push(int item) {
        if (top == (arr.length - 1)) {
            System.out.println("Stack is fulll");
            return;
        }
        arr[++top] = item;
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Removed item from stack is :" + arr[top--]);
    }

    public void Display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        for (i = 0; i < top; i++) {
            System.out.print("\t" + arr[i]);
        }
        System.out.println(" ");
    }
}

class DyStack implements stack {
    int top, i;
    int arr[];
    int max;

    DyStack(int m) {
        top = -1;
        max = s;
        arr = new int[max];
    }

    int Mularray(int[] a,m){
        int nw[] = new int[m*2];
        for(int i=0;i<a.length;i++){
            nw[i]=a[i];
        }
        return a;
    }
}

public class StackSd {
    void Fixstack() {
        Scanner sc = new Scanner(System.in);
        int ch,ele;
        System.err.println("Enter size of array");
        int m=sc.nextInt();
        fstack f= new fstack(m);
        System.out.println("1.PUSH \n 2.POP \n 3.DISPLAY \n 4.Exit");
        System.out.println("Enter your Choice");
        Scanner sc = new Scanner(System.in);
        switch{
            case 1:
                System.out.println("Enter the element :");
                ele=sc.nextInt();
                f.push(ele);
                break;
            case 2:
                f.pop();
                break;
            case 3:
                f.Display();
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSd s= new StackSd();
        int c;
        do{
            System.out.println("1.FIXED STACK ");
            System.out.println("1.DYNAMIC STACK ");
            System.out.println("1.ENTER THE CHOICE ");
            c=sc.nextInt();
            switch(ch){
                case 1:
                    s.Fixstack();
                    break;
            }
        } while (ch < 3);
    }
}
