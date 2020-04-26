import java.util.Scanner;
import java.util.*;


public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter number of integers: ");
    int usernumber = in.nextInt();
    List<Integer> list=new ArrayList<Integer>();
    for (int i=0;i<usernumber;++i )
    {
    	System.out.println("Enter number: ");
    	int number = in.nextInt();
    	list.add(number);
    	
    }
    int selectcount = 0;
    int modenum = 0;
    for (int i=0;i<usernumber;++i)
    {
    	
    	int selectnum = list.get(i);
    	int count = 0;
    	for (int j=0;j<list.size();++j)
    	{
    		
    		if (selectnum == list.get(j))
    		{
    			count +=1;
    		}
    	}    	
    	if (count>selectcount) 
    	{
    		selectcount = count;
    		
    		modenum = selectnum;
    		System.out.println(selectnum);
    		
    	}    	
    }
    System.out.println("The mode is: "+ modenum);
    
    
  }
}

