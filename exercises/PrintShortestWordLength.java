import java.util.Scanner;
public class PrintShortestWordLength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a sentence below: ");
		
		String input_string = sc.next();
		
		int short_string_len = getShortestWordLength(input_string);
		
		System.out.println("\nThe length of the shortest word in the sentence above is: " + short_string_len + "\n");
	}
	
	public static int getShortestWordLength(String str) {
		String[] words = str.split(""); //remove all whitespaces in the sentence
		
		String shortestWord = words[0];
		
		for(int i=0; i < words.length; i++) {
			if(words[i].length() <= shortestWord.length()) { //compares each word to each other
				shortestWord = words[i];
			}
		}
		return shortestWord.length();
	}
}
