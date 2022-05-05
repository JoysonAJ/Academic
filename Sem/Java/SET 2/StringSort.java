import java.util.Scanner;
import java.util.Arrays;

public class StringSort {

    String[] Sorting(String a[], int n) {
        String temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i].compareTo(a[j]) > 0) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array  : ");
        n = sc.nextInt();
        String arr[] = new String[n];
        System.out.println("Enter the element into array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println(" ");
        StringSort s = new StringSort();
        arr = s.Sorting(arr, n);
        System.out.println("After Sorting ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println(" ");
    }
}
