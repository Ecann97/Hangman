import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*; 
import java.util.ArrayList;

public class Hangclass {
	
	
	
	static Game g = new Game();
	
	 public static void main(String[] args) throws IOException {
	
		@SuppressWarnings("resource")
		BufferedReader bR = new BufferedReader(new FileReader("word.txt"));
		ArrayList<String> word = new ArrayList<String>();
		String line = bR.readLine();
		while(line != null)
		{
			word.add(line);
			line = bR.readLine();
		}
		bR.close();
		
		@SuppressWarnings("resource")
		BufferedReader hT = new BufferedReader(new FileReader("hint.txt"));
		ArrayList<String> hint = new ArrayList<String>();
		String clue = hT.readLine();
		while(clue !=null)
		{
			hint.add(clue);
			clue = hT.readLine();
		}
		hT.close();
	
		for(@SuppressWarnings("unused") String str: word)
	{
		
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	@SuppressWarnings("resource")
	Scanner bt = new Scanner(System.in);
	
	



System.out.println("To select a game, input a value from 0 to 3.  You can guess until the word is unmasked");
	int userInput = bt.nextInt();
	
	g.setWord(word.get(userInput));
	g.setHint(hint.get(userInput));
	
	while(g.isSolved()==false)
	{
		
				
		
			System.out.println(" Guess a letter ");
			System.out.println("Hint " + g.getHint());
			System.out.println("Mask " + g.generateMask());
			@SuppressWarnings("unused")
			String userGuess = sc.nextLine();
			g.setGuess(userGuess);
			
			if(g.isSolved()==true)
			{
				
			}
			
			
			
		}		
				
		
	
	
		
		
			
		
		
	
	}

}

}



