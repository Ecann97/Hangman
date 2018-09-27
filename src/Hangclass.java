import java.util.*; 
public class Hangclass {
	//I need some words to seed into the program
	static String s1 = "cat";
	//static String s2 = "Their";
	//static String s3 = "Museum";
	//static String s4 = "Rough";
	//static String s5 = "House";
	 
	
	
	public static void main(String[] args)
	{
		int c = 0;
	@SuppressWarnings("resource")
	Scanner console = new Scanner(System.in);
	
	//Random r = new Random(4);
	// ^^ this can be used to add randomness to game.
	//if(r.nextInt()==0);
	//^^ can be used to randomly generate a word without use of arrays.
	
	//This example will be using the s1 string marked as "cat"
		System.out.println("*** " + "3 letter word  ");
	//Game ends when the number of guesses is at the word length
		for(int i=0; i <= s1.length(); i++)
		{
			System.out.println("Guess a letter ");
			@SuppressWarnings("unused")
			String g = console.next();
			
			
				if(s1.contains(g))
				{
					System.out.println("Correct.  Guess another letter");
				}
				else
				{
					c = c+1;
					System.out.println("Incorrect.  You have " + (s1.length()-c) + " " + "guesses left.  Guess another letter.");
				}
				
				
		}
	
	
	}

}
