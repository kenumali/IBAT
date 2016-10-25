/*
Write a program called PrintDiamond.java which will ask the user to enter a positive odd integer n that is between 3 and 19.

The program will use this information to print out a diamond shape of asterisks (ie *) shown below where n is the
width of a diamond (ie number of asterisks in the central line).

PROJECT TITLE: PrintDiamond
PURPOSE OF PROJECT: Requirements for IBAT
VERSION or DATE: 9.8.2016
HOW TO START THIS PROJECT: Run CMD > type javac PrintDiamond.java > type java PrintDiamond
AUTHOR: Kenneth Umali
USER INSTRUCTIONS: Input an odd integer between 3 and 19.
 
*/
import java.util.Scanner;
public class PrintDiamond {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter the diamond width, which must be an odd number: ");
			int n = Integer.parseInt(sc.next());
			if(isOdd(n) && isNumberBetween3And19(n)) {
				printFirstHalfOfDiamond(n);
				printSecondHalfOfDiamond(n);
			} else {
				//terminate the program if n isn't odd and greater than 19 or less than 3
				System.out.println("You must enter a positive odd integer that is between 3 and 19"); //input must be between 3 and 19 only
				System.exit(0);
			}
		} catch (NumberFormatException ex){
			//catch NumberFormatException if input is not a number then terminate the program
			System.out.println("You must enter a number only");
			System.exit(0);
		}
	}
	
	public static boolean isOdd(int n) {
		return n % 2 != 0;
	}
	
	public static boolean isNumberBetween3And19(int n) {
		return n > 2 && n < 20;
	}
	
	public static void printFirstHalfOfDiamond(int n) {
		for(int i = 0; i <= n; i++) {
			printSpaces(n, i);
			printAsterisk(i);
			System.out.println("");
		}
	}
	
	public static void printSecondHalfOfDiamond(int n) {
		for(int i = n - 1; i > 0; i--) {
			printSpaces(n, i);
			printAsterisk(i);
			System.out.println("");
		}
	}
	
	public static void printSpaces(int n, int i) {
		for(int space = 0; space < n - i; space++) { //print spaces
			System.out.print(" ");
		}
	}
	public static void printAsterisk(int i) {
		for(int asterisk = 0; asterisk < i; asterisk++) { //print asterisk
			System.out.print("* ");
		}
	}
}
/*
>javac PrintDiamond.java

>java PrintDiamond
Enter the diamond width, which must be an odd number: 3

  *
 * *
* * *
 * *
  *

>java PrintDiamond
Enter the diamond width, which must be an odd number: 9

        *
       * *
      * * *
     * * * *
    * * * * *
   * * * * * *
  * * * * * * *
 * * * * * * * *
* * * * * * * * *
 * * * * * * * *
  * * * * * * *
   * * * * * *
    * * * * *
     * * * *
      * * *
       * *
        *

>java PrintDiamond
Enter the diamond width, which must be an odd number: 1
You must enter a positive odd integer that is between 3 and 19

>java PrintDiamond
Enter the diamond width, which must be an odd number: 50
You must enter a positive odd integer that is between 3 and 19

>java PrintDiamond
Enter the diamond width, which must be an odd number: qwerty
You must enter a number only
	
*/