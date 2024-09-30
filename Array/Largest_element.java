// Method number 1
/*
import java.util.Arrays;

public class Largest_element {

    public static void main(String[] args) {

        // int[] arr = {5, 4, 8, 1, 3};
        // int[] arr = {63,2,5,8,55};
        int[] arr = { 5, -2, 23, 7, 87, -42};

        Arrays.sort(arr);
        System.out.print(arr[arr.length - 1] );
        System.out.println("");
    }
}
*/

// method 2. This is approach is called recursive approach

public class Largest_element{
    public static void main(String[] args) {
        // int[] arr = {8, 2, 6, 10, 7, 9};
        // int[] arr = {63,2,5,8,55};
        int[] arr = { 5, -2, 23, 7, 87, -42};
    
        int max;
        
        max = arr[0];
        // System.out.println(max);

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
            System.out.println("The largest element is " + max);
    }
}