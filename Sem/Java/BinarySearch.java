import java.util.Scanner;

class Bsrch {
    int low, high;

    Bsrch(int n) {
        low = 0;
        high = n;
    }

    int[] sort(int a[], int n) {
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < (n - i - 1); j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }

    int Searching(int a[], int srch, int n) {
        int mid;
        high = n - 1;
        while (low <= high) {
            mid = (low + high) / 2;

            if (a[mid] == srch)
                return mid;

            if (a[mid] < srch)
                low = mid + 1;

            else
                high = mid - 1;
        }
        return -1;

    }

}

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ele, n, loc;
        System.out.println("Enter the size of array  : ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element into array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Bsrch b = new Bsrch(n);
        arr = b.sort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println(" ");

        System.out.println("Enter the Searching element :");
        ele = sc.nextInt();
        loc = b.Searching(arr, ele, n);
        if (loc == -1) {
            System.out.println("Element Doesn't exit in array");
            return;
        }
        System.out.println("Element " + ele + "found at location :" + loc);
    }
}
