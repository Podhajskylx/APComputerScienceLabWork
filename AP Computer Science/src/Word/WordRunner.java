package Word;
import static java.lang.System.*;

public class WordRunner { 
	public static void main(String [] args) {
		
		Word one = new Word("chicken");
		System.out.println("the word is " + one);
		System.out.println("num vowles == " + one.getNumVowels());
		System.out.println("num chars == " + one.getLength());
		
		one.setWord("alligator");
		System.out.println("\n\n" + "the word is " + one);
		System.out.println("num vowles == " + one.getNumVowels());
		System.out.println("num chars == " + one.getLength());
		
		one.setWord("elephant");
		System.out.println("\n\n" + "the word is " + one);
		System.out.println("num vowles == " + one.getNumVowels());
		System.out.println("num chars == " + one.getLength());
		
		
	}
}
