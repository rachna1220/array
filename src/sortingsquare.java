import java.util.Scanner;
public class sortingsquare {
    static void swaparray(int arr[], int i ,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }
    static void swap(int arr[], int i ,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse(int arr[]){
        int i=0,j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static int[] sortsquare(int arr[]){
        int n = arr.length;
        int ans[]=new int[n];
        int left=0, right=n-1;
        int k =0;
        while(left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k]=arr[left]*arr[left];
                k++;
                left++;
            }
            else{
                ans[k]=arr[right]*arr[right];
                k++;
                right--;
            }

        }
        return ans;
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
        int[] ans=sortsquare(array);

        System.out.println("sorted array");
        reverse(ans);

        printarray(ans);
    }
}


