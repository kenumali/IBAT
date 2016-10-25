import java.util.Scanner;
public class SocialSecurityLetterString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the numbers in your social security number");
    String input = sc.next();
    System.out.println("The security character for the input numbers " + input + " is " + convertToLetter(input));
  }
  
  public static String convertToLetter(String str) {
    int sum = 0, j = 0;
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ", temp = "";
    for(int i = 0; i < str.length(); i += 2) {
      j = i + 2;
      temp = str.substring(i, j);
      sum = sum + Integer.parseInt(temp);
    }
    return alphabet.charAt(sum % 26)+"";
  }
}
