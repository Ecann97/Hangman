import java.util.*; 
public class Hangclass {
	//I need some words to seed into the program
	
	//static String s2 = "Their";
	//static String s3 = "Museum";
	//static String s4 = "Rough";
	//static String s5 = "House";
	static Game g = new Game();
	
	
	public static void main(String[] args)
	{
		g.setHint("Meow");
		g.setWord("Cat");
		 
		int c = 0;
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	
	//Random r = new Random(4);
	// ^^ this can be used to add randomness to game.
	//if(r.nextInt()==0);
	//^^ can be used to randomly generate a word without use of arrays.
	
	//This example will be using the s1 string marked as "cat"
		
	//Game ends when the number of guesses is at the word length
	while(c<g.getWord().length())
	{
		
		for(int i=0; i <g.getWord().length(); i++)
		
		{
			System.out.println(" Guess a letter ");
			System.out.println("Hint " + g.getHint());
			System.out.println("Mask " + g.generateMask());
			@SuppressWarnings("unused")
			String userGuess = sc.nextLine();
			g.setGuess(userGuess);
			
			if(c<g.getWord().length())
			{
				if(g.getWord().contains(userGuess))
				
				{
					System.out.println("Correct.  You have " + (g.getWord().length()-c) + " guesses left.");
				}
				else
				{
					c+=1;
					System.out.println("Incorrect.  You have " + (g.getWord().length()-c) + " guesses left. ");
				}
		
			}
			else
			{
				System.out.println("Game Over");
			}
				
				
		}
	}
	
		
		
			
		
		
	
	}

}


