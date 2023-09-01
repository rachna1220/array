import java.util.Arrays;
import java.util.Scanner;
public class smallestlargestelement {
    static int[] smallarge(int[] arr){
        Arrays.sort(arr);
        int ans[]={arr[0], arr[arr.length-1]};
        return ans;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter" + n + "elements: ");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int ans[] =smallarge(arr);
        System.out.println("smallest element: " + ans[0]);
        System.out.println("largest element: " + ans[1]);



    }

}



