import java.util.Arrays;

public class Largest_element{
    public static void main(String[] args) {
        int[] num = {1, 5, 3, 4, 5};
 
        // System.out.println(Arrays.toString(num));
        //in the above it is use to display the simple array.

        Arrays.sort(num);

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}