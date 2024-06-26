import java.util.Scanner;

import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */

    Scanner in = new Scanner(System.in);

    // Prompt user for height in meters
    //System.out.print("Enter your height in meters: ");
    double height = in.nextDouble();

     // Prompt user for weight in kg
     //System.out.print("Enter your weight in kilogram: ");
     double weight = in.nextDouble();

     // Calculate BMI
     double bmi = calculateBMI(height, weight);

     // Print out BMI
     System.out.println(bmi);

     in.close();
  }

   // Function to calculate BMI
  public static double calculateBMI(double height, double weight) 
   {
     return weight / (height * height);
   }
}