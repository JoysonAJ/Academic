import java.util.Scanner;

interface Stack {

    void Push(int x);

    void Pop();

    void Display();

}

class FixedStack implements Stack {
    int top, n;
    int arr[];

    FixedStack(int max) {
        top = -1;
        n = max;
        arr = new int[n];
    }

    public void Push(int x) {
        if (top == (n - 1)) {
            System.out.println("\t Stack Is Full");
            return;
        }
        arr[++top] = x;
    }

    public void Pop() {
        if (top == -1) {
            System.out.println("\tStack is Empty");
            return;
        }
        System.out.println("Element deleted is :" + arr[top--]);
    }

    public void Display() {
        if (top == -1) {
            System.out.println("\tStack is Empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println(" ");
    }
}

class DynamicStack implements Stack {
    int top, n;
    int arr[];

    DynamicStack(int max) {
        top = -1;
        n = max;
        arr = new int[n];
    }

    public void Push(int x) {
        int temp[];
        if (top == (n - 1)) {
            n *= 2;
            temp = new int[n];
            for (int i = 0; i <= top; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
            arr[++top] = x;
            return;
        }
        arr[++top] = x;
    }

    public void Pop() {
        if (top == -1) {
            System.out.println("---- Stack is Empty -------");
            return;
        }
        System.out.println("Element deleted is :" + arr[top--]);
    }

    public void Display() {
        if (top == -1) {
            System.out.println("----- Stack is Empty --------");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println(" ");
    }
}

class StackObj {

    int StackSize() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("\n Enter the size of the Stack \t:");
        n = sc.nextInt();
        return n;
    }

    int Menu() {
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.print("\t\t1.PUSH");
        System.out.print("\t2.POP");
        System.out.print("\t3.DISPLAY\n");
        System.out.print("Enter Your Choice \t:");
        ch = sc.nextInt();
        System.out.println(" ");
        return ch;
    }

    int Input() {
        Scanner sc = new Scanner(System.in);
        int ele;
        System.out.print("Enter the element \t: ");
        ele = sc.nextInt();
        return ele;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch, ch1, n, ele;
        StackObj s = new StackObj();
        do {
            System.out.println("\n\t1.Fixed Stack");
            System.out.println("\t2.Dynamic Stack");
            System.out.print("\tEnter Your Choice \t:");
            ch = sc.nextInt();
            Stack st;
            switch (ch) {
                case 1:
                    n = s.StackSize();
                    st = new FixedStack(n);
                    do {
                        ch1 = s.Menu();
                        switch (ch1) {
                            case 1:
                                ele = s.Input();
                                st.Push(ele);
                                break;
                            case 2:
                                st.Pop();
                                break;
                            case 3:
                                st.Display();
                                break;
                        }
                    } while (ch1 < 4);
                    break;
                case 2:
                    n = s.StackSize();
                    st = new DynamicStack(n);
                    do {
                        ch1 = s.Menu();
                        switch (ch1) {
                            case 1:
                                ele = s.Input();
                                st.Push(ele);
                                break;
                            case 2:
                                st.Pop();
                                break;
                            case 3:
                                st.Display();
                                break;
                        }
                    } while (ch1 < 4);
                    break;
            }
        } while (ch < 3);
    }
}