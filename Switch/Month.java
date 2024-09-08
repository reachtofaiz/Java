
import java.util.Scanner;

public class Month {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of the month ");
        int month = input.nextInt();

        switch (month) {
            case 1:
                System.err.print("First month is ");
                System.err.println("January");
                break;
            case 2:
                System.err.print("Second month is ");
                System.err.println("February");
                break;
            case 3:
                System.err.print("Third month is ");
                System.err.println("March");
                break;
            case 4:
                System.err.print("Forth month is ");
                System.err.println("April");
                break;
            case 5:
                System.err.print("Fifth month is ");
                System.err.println("May");
                break;
            case 6:
                System.err.print("Sixth month is ");
                System.err.println("June");
                break;
            case 7:
                System.err.print("Seventh month is ");
                System.err.println("July");
                break;
            case 8:
                System.err.print("Eighth month is ");
                System.err.println("August");
                break;
            case 9:
                System.err.print("Ninth month is ");
                System.err.println("September");
                break;
            case 10:
                System.err.print("Tenth month is ");
                System.err.println("October");
                break;
            case 11:
                System.err.print("Eleventh month is ");
                System.err.println("November");
                break;
            case 12:
                System.err.print("Twelveth month is ");
                System.err.println("December");
                break;
            default:
                System.err.println("Enter valid number");
        }
    }
}
