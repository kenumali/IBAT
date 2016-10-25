import java.util.Scanner;
public class CreateLoginName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name and second name:");
		String name = sc.nextLine();
		System.out.println("firstName is " + getFirstName(name));
		System.out.println("secondName is " + getSecondName(name));
		System.out.println("firstNameFirstLetter lowercase: " + firstNameLowerCase(name));
		System.out.println("secondName lowercase: " + secondNameLowerCase(name));
		System.out.println("First 6 letters of secondName: " + secondNameFirstSixLetters(name));
		
		System.out.println("\nHello " + getFirstName(name) + " your username is " + createUsername(name));
	}
	
	public static String getFirstName(String name) {
		int separator = name.indexOf("$");
		return name.substring(0, separator);
	}
	
	public static String getSecondName(String name) {
		int separator = name.indexOf("$");
		return name.substring(separator + 1);
	}
	
	public static String firstNameLowerCase(String name) {
		name = getFirstName(name);
		return name.substring(0,1).toLowerCase();
	}
	
	public static String secondNameLowerCase(String name) {
		name = getSecondName(name);
		return name.substring(0, name.length()).toLowerCase();
	}
	
	public static String secondNameFirstSixLetters(String name) {
		name = getSecondName(name);
		if(name.length() >= 6) {
			return name.substring(0, 6);
		} else {
			return name;
		}
	}
	
	public static String createUsername(String name) {
		return secondNameLowerCase(secondNameFirstSixLetters(name)).concat(firstNameLowerCase(name));
	}
}
