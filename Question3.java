import java.util.Scanner;

public class Question3
{
  public static void main(String[] args) 
  {
      Scanner in = new Scanner(System.in);

      // Prompt user to enter an integer
      System.out.print("Enter an integer: ");
      int number = in.nextInt();

      // Calculate the square of the entered number
      int square = number * number;

      // Print out the result
      System.out.println("The square of " + number + " is: " + square);

      in.close();
  }
}
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */

