import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class PrintSuspectedFraudsters {
	public static void main(String[] args) {
		ArrayList<String> taxpayers = getNames("taxpayers.txt");
		ArrayList<String> unemployed = getNames("unemployed.txt");
		
		for(String name : checkFraudsters(taxpayers, unemployed)) {
			System.out.println(name);
		}
	}
	
	public static ArrayList<String> getNames(String filename) {
		ArrayList<String> names = new ArrayList<String>();
		try {
			Scanner scanner = new Scanner(new File(filename));
			while(scanner.hasNextLine()) {
				names.add(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find '" + filename + "' file.");
			System.exit(0);
		}
		return names;
	}
	
	public static ArrayList<String> checkFraudsters(ArrayList<String> taxpayers, ArrayList<String> unemployed) {
		ArrayList<String> fraudsters = new ArrayList<String>();
		taxpayers.retainAll(unemployed);
		fraudsters = taxpayers;
		return fraudsters;
	}
}

/*

Tax inspectors have available to them two text files, one called unemployed.txt and another called taxpayers.txt.
Each file contains a collection of names, one name per line. The inspectors regard anyone who name occurs in both 
files as a suspected fraudsters. Write a program called PrintSuspectedFraudsters.java which will prints the names of those 
suspected fraudsters.

The names should appear in the same order as in taxpayers.txt.

Your solution could use a method which reads a text file whose name is supplied as a parameter and returns an ArrayList of the
lines in that file.


unemployed.txt
-------------
Sarah Collins
Joe Murphy
Donal Smith
Rory Kelly
Mary Jones
Michael Walsh
Aidan Deasy

taxpayer.txt
------------
Paul Reynolds
Alice Keane
Aidan Deasy
Brian Robbins
Rory Kelly
Pamela McWillimas
Sarah Collins
Frank Dineen


>java ExSh11_Ex3Dodgy
Aidan Deasy
Rory Kelly
Sarah Collins

*/



