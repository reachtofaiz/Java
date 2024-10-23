public class Left_Rotate{
    public static void main(String[] args){
        // int[] arr = {1,2,3};
        int[] arr= {4, 0, 3, 2, 5 };
        int temp, i;

        for (i = 0; i < arr.length - 1; i++) {

            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;

        }
        for (int num : arr) {
            System.out.print(" " + num);
        }
        System.out.println();

    }
}
