
import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
        Sum();
        Sum();
    }

    static void Sum(){
        int x,y,sum;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your first number = ");
        x = in.nextInt();

        System.out.print("Enter your second number = ");
        y = in.nextInt();

        sum = x + y;

        System.out.println("Your sum is  "+ sum);

    }
}