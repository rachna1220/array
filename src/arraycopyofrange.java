import java.util.Arrays;

public class arraycopyofrange {
    static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int array[] = new int[5];
        array[0] = 5;
        array[1] = 6;
        array[2] = 7;
        array[3] = 8;
        array[4] = 9;
        System.out.println("original arry");
        printarray(array);
        System.out.println("copied array");
        int arr_2[] = Arrays.copyOfRange(array, 0, array.length); //if we write 4 in place of arr.length
        // then elements upto 3rd index will get copied.
        printarray(arr_2);
    }
}