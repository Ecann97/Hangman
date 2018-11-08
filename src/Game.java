import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Game 
{

private String hint;
private String word;
private String guess="";


public String getHint() {
	return hint;
}
public void setHint(String hint) {
	this.hint = hint;
}
public String getWord() {
	return word;
}
public void setWord(String word) {
	this.word = word;
}
public String getGuess() {
	return guess;
}
public void setGuess(String guess) {
	this.guess += guess;
}

public boolean isSolved()
{
	return generateMask().equals(word);
}
public String generateMask()
{

	String mask = "";
	for(int i = 0; i < word.length(); i++)
	{
		String currentChar = String.valueOf(word.charAt(i));
		if(guess.contains(currentChar))
		{
			mask += currentChar;
		}
		else
		{
			mask += "*";
		}
		}
		
	
	return mask;
}


	

public void getGuesses()
{

}
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
	
	@SuppressWarnings("resource")
	BufferedReader hT = new BufferedReader(new FileReader("hint.txt"));
	ArrayList<String> hint = new ArrayList<String>();
	String clue = hT.readLine();
	while(clue !=null)
	{
		word.add(clue);
		clue = hT.readLine();
	}
}
}



