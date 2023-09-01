import java.util.Scanner;
public class arraysum {


    static int findarraysum(int arr[]) {
        int totalsum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalsum = totalsum + arr[i];
        }
        return totalsum;
    }

    static boolean equalsumpartition(int[] arr) {
        int totalsum = findarraysum(arr);
        int prefsum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefsum += arr[i];
            int suffixsum = totalsum - prefsum;
            if (suffixsum == prefsum) {
                return true;
            }
        }
        return false;
    }

    static void printarray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("enter elements of array");
        for (int i= 0; i < n; i++) {
            array[i] = sc.nextInt();
        }


        System.out.println("equal partition possible: " + equalsumpartition(array));

    }
}









