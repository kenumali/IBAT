# IBAT
Contains files and codes during my short course in IBAT

You can test my codes using Command Prompt
-press Shift+Right Click
-Select 'Open command window here'
-Compile it using javac 'java file you want to compile'.java
-Run the file using java 'java file you want to run'

Program's Description inside the final_assignment folder:
1. AverageNumberOfStudents.java
  - reads a text file called 'course.txt' that contains information on courses and the number of students enrolled
  - add all the number of students
  - compare each number of students to num_of_students_in_large_class
  - creates a file called 'large.txt' that contains the course and student count larger or equals to num_of_students_in_large_class
  - compute for the average and print it out
  
2. DNA_Sequence.java
  - search for the DNA String in a String called dnaDatabase
  - prints out the immediate character before and after the DNA
  
3. DNA_SequenceFileInput.java
  - reads a text file called 'DNA_sequence_input.txt'
  - set dnaDatabase to the file that has been read
  - search for the DNA String in dnaDatabase
  - prints out the immediate character before and after the DNA
  
4. DNA_SequenceFileInputWithFileOutput.java
  - reads a text file called 'DNA_sequence_input.txt'
  - set dnaDatabase to the file that has been read
  - search for the DNA String in dnaDatabase
  - creates a file called 'DNA_sequence_output.txt' that contains the immediate character before and after the DNA
  
5. PrintDiamond.java
  - asks the user to enter a positive odd integer n that is between 3 and 19
  - the program will print out a diamond shape of asterisks where n is the number of asterisks in the center line of the diamond
  
6. PrintHistogram.java
  - reads a sequence of integers inside 'histogram_input.txt' file in the range of 0 to 99, inclusive
  - prints a histogram for the intervals 0-9, 10-19, ..., 90-99
  - the histogram appears on its side with an asterisk value in the associated range
  
7. PrintSuspectedFraudsters.java
  - reads two files that contains a collection of names, called 'unemployed.txt' and 'taxpayers.txt'
  - anyone whose name occurs in both files is regarded as a suspected fraudster
  - print the name of those suspected fraudsters
  
8. PrintSuspectedFraudstersOnHTMLFile.java
  - reads two files that contains a collection of names, called 'unemployed.txt' and 'taxpayers.txt'
  - anyone whose name occurs in both files is regarded as a suspected fraudster
  - creates an HTML file called 'fraudsters.html' that shows the names of the suspected fraudsters
  
9. PrintSuspectedFraudstersOnTextFile.java
  - reads two files that contains a collection of names, called 'unemployed.txt' and 'taxpayers.txt'
  - anyone whose name occurs in both files is regarded as a suspected fraudster
  - creates a text file called 'fraudsters.txt' that shows the names of the suspected fraudsters
  
10. WordSetArrayList.java
  - asks the user for a sentence, should have a full stop '.'
  - print out the number of unique words

10. WordSetHashSet.java
  - asks the user for a sentence, should have a full stop '.'
  - print out the number of unique words
