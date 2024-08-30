
import java.util.Scanner;

public class Casecheck{
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
          char ch = input.next().charAt(0);
          System.out.println(ch);

          if (Character.isUpperCase(ch)) {
              System.out.println("The character is an capital letter");
          } else {
               System.out.println("The character is a small letter");
          }
     }

}