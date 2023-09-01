import java.util.Scanner;
public class prefixsum {


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
        int array[]= new int[n];
        System.out.println("enter elements of array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println(" input arr");
        printarray(array);
         int [] arr=presum(array);
         printarray(arr);


    }
}

