
import java.util.Scanner;

public class Reverse_number{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.println();
        System.out.print("Original number is ");
        int n = input.nextInt();
        int rem;
        int reverse = 0;
        while(n>0){
            rem = n % 10;
            reverse = reverse*10 + rem;
            n = n/10;
        }
        System.out.println("Reverse number is "+reverse);
    }
}
