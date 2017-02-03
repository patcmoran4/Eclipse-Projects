import java.util.Scanner;

public class PopOnTheWall 
{
	public static void main(String arg[])
	{
		Scanner keyboard;
		
		int numberOfBottles;
		int numberOfBottlesTracked;
		int bottles;
		int numberOfStanzas;
		int stanzas;
		keyboard = new Scanner(System.in);
		
		numberOfBottles = checkInputValue(keyboard);
		
		System.out.print("Enter the number of stanzas to sing:");
		numberOfStanzas = keyboard.nextInt();
		//for()
		for(stanzas = 0; numberOfStanzas >= stanzas; stanzas++)
		{
			for(bottles = numberOfBottles; bottles >= 0; bottles--)
				{
					if(numberOfStanzas != stanzas)
					{
							System.out.print("\n");
							System.out.println(bottles + " Bottles of pop on the wall");
							System.out.println(bottles +" bottles of pop");
							System.out.println("If one of those bottles should happen to fall");
							numberOfBottlesTracked = bottles;
							System.out.println(numberOfBottlesTracked + " bottles of pop on the wall");
							System.out.print("\n");
					}	
					else
					{
						break;
					}
				}
		}
			
		
		
	}
	public static int checkInputValue(Scanner keyboard)
	  {
		
		int numberOfBottles;
		
		System.out.print("Enter the number of bottles:");
		numberOfBottles = keyboard.nextInt();
		
		boolean questionResult = true;
	    while(!questionResult)
	    {
	    	if(!keyboard.hasNextInt())
	    	{
	    		System.out.print("Enter the number of bottles:");
	    		numberOfBottles = keyboard.nextInt();
	    	}
	    	else if(numberOfBottles >= 0)
	    	{
	    		System.out.print("Enter the number of bottles:");
	    		numberOfBottles = keyboard.nextInt();
	     	}
	    	
	    	else
	    	{
	    		questionResult = true;
	    	}
	 
	    }
	    return numberOfBottles;

	  }
}
