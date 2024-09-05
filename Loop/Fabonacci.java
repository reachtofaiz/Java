import java.util.Scanner;

public class Fabonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int sum;

        // System.out.println(a);
        // System.out.println(b);

        if (n == 1) {
            System.out.println(a);
        } else if (n == 2) {

            System.out.println(a);
            System.out.println(b);

        } else if(n > 2){

            System.out.println(a);
            System.out.println(b);

            for (int i = 3; i <= n; i++) {
                sum = a + b;
                a = b;
                b = sum;
                System.out.println(sum);
            }
        }

        input.close();
    }
}
