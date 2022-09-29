public class exp {
    public static void main(String[] args) {

        String s="1,2,3,4,5,6";
        String arr[] = s.split(",");

        int n = arr.length;
        Integer arn[] = new Integer[n];
        for(int i=0;i<n;i++) {
            //int nw = Integer.parseInt(arr[i]);
            arn[i] = (Integer) Integer.parseInt(arr[i]);
        }

        for(int i=0;i<n;i++){
            System.out.print("\t"+arn[i]+"\t");
        }
    }


}
