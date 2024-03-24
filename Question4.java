import java.util.Scanner;

public class Question4 {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      // Prompt user to enter the size of the base of the triangle
      //System.out.print("Enter the size of the base of the triangle: ");
      int baseSize = scanner.nextInt();

      // Print the right angle triangle
      for (int i = 0; i < baseSize; i++) {
          for (int j = 0; j <= i; j++) {
              // Print asterisk for the first and last row, and first and last column
              if (i == 0 || i == baseSize - 1 || j == 0 || j == i)
                  System.out.print("*");
              else
                  System.out.print(" ");
          }
          System.out.println(); // Move to the next line after printing each row
      }

      scanner.close();
  }
}

/* public class Question4
{
  public static void main(String[] args) 
  {
      Scanner in = new Scanner(System.in);

      // Prompt user to enter an integer
      //System.out.print("Enter the size of the base of the triangle: ");
      int baseSize = in.nextInt();

      // Print the right angle triangle
      for (int i = 1; i <= baseSize; i++) 
      {
          // Inner loop to print '*' characters
          for (int j = 1; j <= i; j++) 
          {
              System.out.print("* ");
          }
          System.out.println(); // Move to the next line after printing each row
      }

      in.close();
  }
}
 */
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */

