import java.util.Scanner;
public class pairsum {
    static int Pairsum(int arr[], int target) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
        return ans;

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
        System.out.println("enter target sum ");
        int target = sc.nextInt();
        System.out.println( Pairsum(arr,target));


    }
}


