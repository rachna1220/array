public class ary {
    static void changearray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
    static void changevalue(int a){
        a=100;
    }
    static void printarray(int arr[]){
        for(int i =0;i<arr.length; i++){
            System.out.print( arr[i] + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a=5;
        changevalue(a);
        System.out.println(a);
        int arr[] = new int[3];
        arr[0]=5;
        arr[1]=6;
        arr[2]=7;
        changearray(arr);
        printarray(arr);

    }

}
