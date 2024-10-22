public class Remove_Duplicate{
     public static void main(String[] args) {

        int[] arr = {1,1,2,2,2,3,3,3};
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                System.out.println("The duplicate element are : " + arr[i+1]);
            }
        }        
    }
}