import java.util.Scanner;
public class moveelmnts {
    static void swaparray(int arr[], int i ,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }
    static void sortzeroone(int arr[]){
        int n = arr.length;
        int left=0,right=n-1;
        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                swaparray(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
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
        sortzeroone(array);
        System.out.println("sorted array");
        printarray(array);
    }
}

