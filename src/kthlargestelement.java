import java.util.Arrays;
import java.util.Scanner;
public class kthlargestelement {
    static int largest (int[] arr ,int k){
        Arrays.sort(arr);


return arr[k-1];
    }
    static int smallest(int[] arr ,int k){
        Arrays.sort(arr);
        return arr[arr.length-k];
    }


    public static void main(String[] args) {
        System.out.println("enter value of k");
        Scanner sc = new Scanner(System.in);
        int k= sc.nextInt();

        System.out.println("enter size of array ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter" + n + "elements: ");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int l=largest(arr,k);
        int s=smallest(arr,k);
        System.out.println("largest element: " + l);
        System.out.println(" smallest element " + s);



    }

}




