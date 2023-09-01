import java.util.Scanner;
public class firstrepeatingno{
    static int repeatingno(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i]==arr[j] ) {
                    return arr[i];
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements one by one ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }

        System.out.println("first repeating element in the array is " + repeatingno(arr));


    }
}



