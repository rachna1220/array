    public class Main{
        static void printarray(int arr[] ){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int array[]= new int[5];
        array[0]=5;
        array[1]=6;
        array[2]=7;
        array[3]=8;
        array[4]=9;
        System.out.println("original arry");
        printarray(array);
        System.out.println("copied array");
        int arr_2[]=array;
        printarray(arr_2);
        arr_2[0]=0;
arr_2[2]=0;
        System.out.println("original array after changing arr_2");
        // both array copied as well as original get change
        //because array is an object and we are making change in the address of second array
        // which is pointing to the address of 1 aaray
        printarray(array);
        System.out.println("copied array after changing arr_2");
        printarray(arr_2);

    }

}








