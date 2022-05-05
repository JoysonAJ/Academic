import java.util.Scanner;

class LinSrch {
    int n;
    int arr[];

    LinSrch(int sze) {
        n = sze;
        arr = new int[n];
    }

    void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    int Srch(int ele) {
        int i;
        for (i = 0; i < n; i++) {
            if (ele == arr[i]) {
                return i + 1;
            }
        }
        return -1;
    }
}

class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sze, ele, loc;
        System.out.println("Enter the Size of the array \t:");
        sze = sc.nextInt();
        LinSrch l = new LinSrch(sze);
        l.Input();
        System.out.println("Enter the Search element :");
        ele = sc.nextInt();
        loc = l.Srch(ele);
        if (loc == -1) {
            System.out.println("Not Found");
            return;
        }
        System.out.println("Found at the location" + loc);
    }
}