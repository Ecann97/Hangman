
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
}



