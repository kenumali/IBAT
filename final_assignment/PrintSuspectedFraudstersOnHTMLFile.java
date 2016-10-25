import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.PrintWriter;

public class PrintSuspectedFraudstersOnHTMLFile {
	public static void main(String[] args) {
		ArrayList<String> taxpayers = getNames("taxpayers.txt");
		ArrayList<String> unemployed = getNames("unemployed.txt");
		writeToHTMLFile(taxpayers, unemployed);
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
	
	public static void writeToHTMLFile(ArrayList<String> taxpayers0, ArrayList<String> unemployed0) {
		String html_code = "<html>"+
						   "<head></head>"+
						   "<body>"+
						        "<h2>List of Fraudsters</h2>"+
								"<ul>";
		try {
			PrintWriter writer = new PrintWriter("fraudsters.html");
			for(String name : checkFraudsters(taxpayers0, unemployed0)) {
				html_code = html_code.concat("<li>" + name + "</li>");
			}
			html_code = html_code.concat("<ul/></body></html>");
			writer.println(html_code);
			System.out.println("A file has been created.");
			writer.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Failed to create a file.");
			System.exit(0);
		}
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



