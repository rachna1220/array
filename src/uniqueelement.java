import java.util.Scanner;
public class uniqueelement {
    static int unique(int arr[]) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] ==arr[j] ) {
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for(int i =0;i<n;i++){
            if(arr[i] != -1){
                ans=arr[i];
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


        System.out.println(  "unique element is : " + unique(arr));


    }
}



