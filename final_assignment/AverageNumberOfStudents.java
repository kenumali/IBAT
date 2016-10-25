/*

http://docs.oracle.com/javase/6/docs/api/java/util/Scanner.html

Constructor Summary
--------------------
Scanner(File source) 
Constructs a new Scanner that produces values scanned 
from the specified file.

Method Summary
---------------
boolean  |  hasNextLine() 
Returns true if there is another line in the input of this scanner.

boolean  |  hasNext() 
Returns true if this scanner has another token in its input.

int	  |  nextInt() 
Scans the next token of the input as an int.

String	  |  next() 
Finds and returns the next complete token from this scanner.

*/

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.NoSuchElementException;

public class AverageNumberOfStudents { 
	public static void main(String[] args) {
		try {
			final int num_of_students_in_large_class =  30; //  number of students that makes the class a large class 
			String courseName;
			int numberOfStudents = 0, sum = 0, average = 0, courseCount = 0;

			Scanner scanner = new Scanner(new File("courses.txt")); //reads the 'courses.txt' file
			PrintWriter writer = new PrintWriter("large.txt"); //creates a new file called 'large.txt' if only 'courses.txt' exists

			while(scanner.hasNextLine()) { //reads 'courses.txt' line by line
				courseName = scanner.next(); //only gets the course name
				numberOfStudents = scanner.nextInt(); //gets the number of students
				sum = sum + numberOfStudents;
				courseCount++; //increments the number of course
				if(numberOfStudents >= num_of_students_in_large_class) { //compare if a course is greater than or equals to 30
					writer.println(courseName + " " + numberOfStudents); //write the course and the number of students into the file
				}
			}
			writer.close();
			average = sum / courseCount; //computes for the average
			System.out.println("The average number of students per course is " + average);
			System.out.print("large.txt written successfully!");
		} catch (IOException e) {
			System.out.print("Cannot find 'courses.txt' file.");
			System.exit(0);
		} catch (NoSuchElementException e) { //catch exception if courses.txt file has empty lines at the end of it
			System.out.print("courses.txt file has empty lines at the end of it.");
			System.exit(0);
		}
	}
}

/*

A text file called courses.txt contains information on courses at a university, one line per course. 

Each line consists of two items:
(i) the course name (a single word), 
and 
(ii) the number of students enrolled on the course (a natural number).

Write a program called AverageNumberOfStudents.java which reads courses.txt, and prints the average number of
students per course (ignoring any fraction). 

courses.txt
-----------
Maths 35
Computing 125
Stats 15
Physics 27
Chemistry 29
French 54
Engineering 53
German 20
Biology 56
Law 30
Politics 21
Business 156
History 42
Philosophy 17
Architecture 28
Medicine 51


35  + 125 + 15 + 27 + 29 + 54 + 53 + 20 + 56 + 30 + 21 + 156 +  42 + 17 + 28 + 51 = 759

759 / 16 = 47.4375

Additionally creating a text file called large.txt which contains the names of all courses with at least 30 students. 


>javac AverageNumberOfStudents.java

>java AverageNumberOfStudents
Exception in thread "main" java.util.NoSuchElementException
at java.util.Scanner.throwFor(Scanner.java:907)
at java.util.Scanner.next(Scanner.java:1416)
at AverageNumberOfStudents.main(AverageNumberOfStudents.java:77)

you may get the runtime error above if the courses.txt files has empty lines at the end of it.


>java AverageNumberOfStudents
The average number of students per course is 47

-----------------------------------------------------------------------------
this program creates a file called large.txt shown below;

large.txt
----------
Maths 35
Computing 125
French 54
Engineering 53
Biology 56
Law 30
Business 156
History 42
Medicine 51

*/




