
public class Sorted_or_not {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // int[] arr = {99, 100, 101, 405, 705};
        // int[] arr = {22, 38, 75, 98, 83};

        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
