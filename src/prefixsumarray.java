import java.util.Scanner;
public class prefixsumarray {


    static int[] presum(int arr[]){
        int n = arr.length;

        for(int i=1; i<n;i++){
            arr[i]= arr[i-1] + arr[i];
        }
        return arr;
    }
    static void printarray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n; i++){
            System.out.print(arr[i]  + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int array[]= new int[n+1];
        System.out.println("enter elements of array");
        for(int i=1;i<=n;i++){
            array[i]=sc.nextInt();
        }
        int [] prsum=presum(array);

        System.out.println("enter number of queries");
        int q= sc.nextInt();
        while(q--> 0) {
            System.out.println("enter the range ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = prsum[r] - prsum[l - 1];
            System.out.println("sum is " + ans);
        }




    }
}


