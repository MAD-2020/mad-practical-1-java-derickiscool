import java.util.Scanner;
import java.lang.Math; //Imports math 

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in); //Creates a new scanner 
    System.out.println("Enter Height: "); //Input user for height
    double height = in.nextDouble();  // Reads input and stores it as height
    System.out.println("Enter Weight: "); //Input user for Weight
  
    double weight = in.nextDouble(); //Reads next input and stores it as weight
    double bmi = weight / Math.pow(height/100, 2) ; //calculate BMI
    System.out.println("Your bmi is: " + bmi); // Print BMI
    in.close(); //close scanner       
  } 
}
