import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Arrays;
import java.util.Comparator;

public class MaxNumber_impl extends UnicastRemoteObject implements MaxN {
    MaxNumber_impl() throws RemoteException {

    }

    @Override
    public int MaxOfN_Number(Integer arr[],int n) throws RemoteException {
        //Integer arr[] = {5, 4, 3, 3, 9, 4, 6, 4, 5};
        Arrays.sort(arr, Comparator.reverseOrder());
        int nw = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1])
                arr[nw++] = arr[i];
        }

        if (nw > n) {
            System.out.println( arr[n - 1]);
            return arr[n - 1];
        }
        return 0;
    }


}
