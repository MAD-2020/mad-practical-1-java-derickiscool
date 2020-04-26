import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Pleas enter a number: "); //Inputs user for number
    int number = in.nextInt(); //reads input as integer
    int newnum = number * number; //multiplies number by itself
    System.out.println("New number is: " + newnum); //prints answer
    in.close(); // close scanner
    				
    
    
  }
}
