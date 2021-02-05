package Word;
import static java.lang.System.*;


public class Word {
	
	private static String vowels = "AEIOUaeiou";
	// add an instance variable 
	private String word;
	
	// create a constructor
	public Word(String w) {
		word = w;
		
	}
	//create other methods 
	
	//Get number of characters in the word
	public int getLength() {
	
		return word.length();
	}
	
	//get amount of vowels in the word
	public int getNumVowels() {
		int vowelCount = 0;
		for (int i = 0; i < word.length(); i++) {
			char c  = word.charAt(i);
			for (int j = 0; j < vowels.length(); j++) {
				if ( c == vowels.charAt(j)) {
					vowelCount = vowelCount + 1;
				}
			}
			
		}
		return vowelCount;
	}


	public void setWord(String w) {
		word = w;
		
	}
	//create a toString method
	public String toString()
	{
		return (word);
	}

	

}
