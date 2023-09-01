
import java.util.Scanner;
public class zeroand1 {
    static void sortzeroone(int arr[]){
        int n = arr.length;
        int zero=0;
        for(int i=0;i<n;i++){
            if( arr[i]== 0){
                zero++;

            }
        }
        for(int i = 0;i<n;i++){
            if(i<zero){
                arr[i]=0;
            }
            else {
                arr[i]=1;
            }
        }
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
        System.out.println(" original arr");
        printarray(array);
        System.out.println("sorted array");
        sortzeroone(array);
        printarray(array);
    }
}
