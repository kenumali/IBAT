import java.util.*;

public class WordSetHashSet {
	public static void main(String[] args) {
		HashSet<String> distinctWords = new HashSet<String>();
		Scanner scanner = new Scanner(System.in);
		String sentence;
		
		System.out.print("Enter a sentence: ");
		sentence = scanner.nextLine();
		
		if(getFullStop(sentence) < 0) {
			System.out.println("Full stop(\".\") is missing");
			System.exit(0);
		} else {
			sentence = getSentenceUntilFullStop(sentence);
			//trims whitespaces at the beginning and end of the string, also used regex for replacing extra spaces with only a single spaces
			sentence = removeExtraSpaces(sentence);
			String[] words = sentence.split(" ");
			for(String word : words) {
				word = replaceSpecialCharacters(word); //this returns word without special characters instead returning an empty string
				if(!word.equals("")) { //this checks if the word is not empty, it will add to the HashSet
					distinctWords.add(word.toLowerCase()); //converts all words to lowercase so that it will not read "A" and "a" as different word
				}
			}
		}
		System.out.println(getHashSetSize(distinctWords) + " distinct words");
	}
	
	public static int getFullStop(String sentence) {
		return sentence.indexOf("."); //gets the first full stop index
	}
	
	public static String getSentenceUntilFullStop(String str) {
		return str.substring(0, getFullStop(str));
	}
	
	public static String removeExtraSpaces(String str) {
		return str.trim().replaceAll("\\s+", " ");
	}
	
	public static int getHashSetSize(HashSet<String> hs) {
		return hs.size();
	}
	
	public static String replaceSpecialCharacters(String str) {
		return str.replaceAll("[^A-Za-z]", "");
	}
}


/*

In mathematics, a set is a collection of distinct objects. Write a program called WordSet which reads a sequence of words 
and prints a count of the number of distinct words. 

The program will know when it has reached the last word in the sentence as it will have a full stop at the end of it.

note: the maximum number of words in a sentence will be 100 or 20.


>java WordSet
should I stay or should I go.
5 distinct words

>java WordSet
go or  stay should I stay or should I go.
5 distinct words

>java WordSet
hello this is a test this will see if the code works.
11 distinct words

*/