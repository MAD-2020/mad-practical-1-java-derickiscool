import java.util.Scanner;



public class Question4
{
  public static void main(String[] args)
  {
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
     
    Scanner in = new Scanner(System.in);
    System.out.println("Please input number: "); //prompts user for base number
    int base = in.nextInt();    
    for (int j=base; j>0; --j ) // 
    {
    	String dot = "*";
    	String repeated = new String(new char[j]).replace("\0", dot); //regex for repeating string, j is the amount of times repeated
    	System.out.println(repeated); 
    }    
    in.close();
  }
}

