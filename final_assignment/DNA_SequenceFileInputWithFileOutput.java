import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class DNA_SequenceFileInputWithFileOutput {
	public static void main(String[] args) {
		final String DNA = "GTTCAG";
		String dnaDatabase;
		int firstIndex, secondIndex;
		try {
			Scanner scanner = new Scanner(new File("DNA_sequence_input.txt"));
			PrintWriter writer = new PrintWriter("DNA_sequence_output.txt");
			while(scanner.hasNextLine()) {
				dnaDatabase = scanner.nextLine();
				firstIndex = dnaDatabase.indexOf(DNA);
				while(firstIndex >= 0) {
					secondIndex = firstIndex + DNA.length();
					writer.println(dnaDatabase.charAt(firstIndex - 1) + " " + dnaDatabase.charAt(secondIndex));
					firstIndex = dnaDatabase.indexOf(DNA, firstIndex + 1);
				}
			}
			writer.close();
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find 'DNA_sequence_input.txt' file.");
			System.exit(0);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("You cannot place the DNA sequence at the beginning/end of the string.");
			System.exit(0);
		}
	}
}