import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PrintHistogram {
	public static void main(String[] args) {
		int[] histogramArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

		try {
			int x;
			Scanner sc = new Scanner(new File("histogram_input.txt"));
			while(sc.hasNextInt()) {
				x = sc.nextInt();
				if(x >= 0 && x <= 9) {
					histogramArray[0]++;
				} else if(x >= 10 && x <= 19) {
					histogramArray[1]++;
				} else if(x >= 20 && x <= 29) {
					histogramArray[2]++;
				} else if(x >= 30 && x <= 39) {
					histogramArray[3]++;
				} else if(x >= 40 && x <= 49) {
					histogramArray[4]++;
				} else if(x >= 50 && x <= 59) {
					histogramArray[5]++;
				} else if(x >= 60 && x <= 69) {
					histogramArray[6]++;
				} else if(x >= 70 && x <= 79) {
					histogramArray[7]++;
				} else if(x >= 80 && x <= 89) {
					histogramArray[8]++;
				} else if(x >= 90 && x <= 99) {
					histogramArray[9]++;
				} else if(x == -1) {
					break;
				}
			}
			for(int i = 0; i < histogramArray.length; i++) {
				System.out.printf("%s%s-%s%s: ",i,0,i,9);
				System.out.printf(convertToStars(histogramArray[i]) + "\n");
			}
		} catch (FileNotFoundException ex) {
			System.out.println("Cannot find 'histogram_input.txt' file.");
			System.exit(0);
		}
	}

	public static String convertToStars(int num){
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < num; i++) {
			builder.append("*");
		}
		return builder.toString();
	}

}


/*

Write a program called PrintHistogram which reads a sequence of integers in the range 0 to 99, inclusive, and prints a histogram
for the intervals 0-9, 10-19, ..., 90-99. 

The histogram appears on its side with an asterisk for each value in the associated range. A typical output looks like:

 0- 9: ********
10-19: *********************
20-29: *************
30-39: **********
40-49: ************************
50-59: *****************************
60-69: ****************
70-79: *****
80-89: *****************
90-99: *********************

You may assume that the output screen is wide enough.

==================================================================================================================================
>javac PrintHistogram.java

>java PrintHistogram
3
4
5
84
23
12
57
35
89
67
11
8
46
-1


 0- 9: ****
10-19: **
20-29: *
30-39: *
40-49: *
50-59: *
60-69: *
70-79:
80-89: **
90-99:

==================================================================================================================================
>type histogram_input.txt
3
4
5
84
23
12
57
35
89
67
11
8
46
-1

>java PrintHistogram < histogram_input.txt

 0- 9: ****
10-19: **
20-29: *
30-39: *
40-49: *
50-59: *
60-69: *
70-79:
80-89: **
90-99:
==================================================================================================================================
>java PrintHistogram
-1


 0- 9:
10-19:
20-29:
30-39:
40-49:
50-59:
60-69:
70-79:
80-89:
90-99:

*/


