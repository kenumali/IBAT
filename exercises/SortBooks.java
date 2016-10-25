import java.util.ArrayList;
import java.util.Collections;

public class SortBooks
{
	public static void main(String[] args)
	{
			ArrayList<Book> arrayListOfBooks = new ArrayList<>();
			
			Book b1 = new Book("The Lion, the Witch and the Wardrobe",      "C. S. Lewis",     "Fantasy ",   1950,    9.99	);
			Book b2 = new Book("Harry Potter and the Deathly Hallows",      "J. K. Rowling",   "Fantasy",    2007,   27.99  );
			Book b3 = new Book("Harry Potter and the Half-Blood Prince",    "J. K. Rowling",   "Fantasy",    2005,   19.99  );
			Book b4 = new Book("Harry Potter and the Chamber of Secrets",   "J. K. Rowling",   "Fantasy",    1998,   11.99  );
			Book b5 = new Book("Harry Potter and the Prisoner of Azkaban",  "J. K. Rowling",   "Fantasy",    1998,   11.99  );
			Book b6 = new Book("Harry Potter and the Goblet of Fire",       "J. K. Rowling",   "Fantasy",    2000,   17.99  );
			Book b7 = new Book("Harry Potter and the Order of the Phoenix", "J. K. Rowling",   "Fantasy",    2003,   23.99  );
		    Book b8 = new Book("The Lion, the Witch and the Wardrobe",      "C. S. Lewis",     "Fantasy ",   1950,    9.99	);
			                   
		    System.out.println("\n");
            System.out.println("A B C D E F G H I J K L M N O P Q  R S   T U V W X Y Z");	
			System.out.println("              ^ 1 2 3 4 5 6 7 8 9 10 11 12             ");	
			System.out.println("\n");
			
            int compare_T_and_H	 = "The Lion, the Witch and the Wardrobe".compareTo("Harry Potter and the Chamber of Secrets");
            System.out.println("compare_T_and_H "+compare_T_and_H);				
						  
			int comparing_b1_and_b4    =   b1.compareTo(b4);
	        //  bookTitle                  "The Lion, the Witch and the Wardrobe".compareTo("Harry Potter and the Chamber of Secrets")  is 12 
						 
		    //  bookPrice                  9.99.compareTo(11.99)  is  -2    ie 10 - 12
			System.out.println("comparing_b1_and_b4 is "+comparing_b1_and_b4);   
			        
			          
			            
			int comparing_b4_and_b1   =   b4.compareTo(b1);
			//  bookTitle                 "Harry Potter and the Chamber of Secrets".compareTo("The Lion, the Witch and the Wardrobe") is -12
					
			//  bookPrice                 11.99.compareTo(9.99)  is  2      ie 12 - 10
			System.out.println("comparing_b4_and_b1 is "+comparing_b4_and_b1);   
			      
				       
			int comparing_b4_and_b4    =  b4.compareTo(b4);
			//  bookTitle                 "Harry Potter and the Chamber of Secrets".compareTo("Harry Potter and the Chamber of Secrets") is 0
					
			//  bookPrice                 11.99.compareTo(11.99)  is  0     ie 12 - 12
			System.out.println("comparing_b4_and_b4 is "+comparing_b4_and_b4);   
			
			
			arrayListOfBooks.add(b1);
			arrayListOfBooks.add(b2);
			arrayListOfBooks.add(b3);
			arrayListOfBooks.add(b4);
			arrayListOfBooks.add(b5);
			arrayListOfBooks.add(b6);
			arrayListOfBooks.add(b7);
			
			
			Collections.sort(arrayListOfBooks);
			
			for(int j=0; j < arrayListOfBooks.size(); j++)
			{ 
			    Book    tempBook    =  arrayListOfBooks.get(j);
                String  bookString  =  tempBook.toString();
				System.out.println( bookString );

				// or you could write the above three lines on one line 
				
				// System.out.println( arrayListOfBooks.get(j).toString() );
				
				// also when you are printing an object the println will call the toString method anyway so
                // the line below would work as well.		
				
             // System.out.println( arrayListOfBooks.get(j) );				
		    }
			
			
			boolean is_b1_equal_to_b4 = b1.equals(b4);
			System.out.println("is_b1_equal_to_b4 "+is_b1_equal_to_b4);
			
			boolean is_b1_equal_to_b8 = b1.equals(b8);
			System.out.println("is_b1_equal_to_b8 "+is_b1_equal_to_b8);
			
		}
}
/*
>javac SortBooks.java
Note: SortBooks.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

// when using the compareTo method that compares Book objects by bookTitle
// the arrayListOfBooks will be sorted in ascending order of book titles as shown below

>java SortBooks

A B C D E F G H I J K L M N O P Q  R S   T U V W X Y Z
              ^ 1 2 3 4 5 6 7 8 9 10 11 12


compare_T_and_H 12
comparing_b1_and_b4 is 12
comparing_b4_and_b1 is -12
comparing_b4_and_b4 is 0

bookTitle     :  Harry Potter and the Chamber of Secrets
author        :  J. K. Rowling
genre         :  Fantasy
yearPublished :  1998
bookPrice     :  11.99


bookTitle     :  Harry Potter and the Deathly Hallows
author        :  J. K. Rowling
genre         :  Fantasy
yearPublished :  2007
bookPrice     :  27.99


bookTitle     :  Harry Potter and the Goblet of Fire
author        :  J. K. Rowling
genre         :  Fantasy
yearPublished :  2000
bookPrice     :  17.99


bookTitle     :  Harry Potter and the Half-Blood Prince
author        :  J. K. Rowling
genre         :  Fantasy
yearPublished :  2005
bookPrice     :  19.99


bookTitle     :  Harry Potter and the Order of the Phoenix
author        :  J. K. Rowling
genre         :  Fantasy
yearPublished :  2003
bookPrice     :  23.99


bookTitle     :  Harry Potter and the Prisoner of Azkaban
author        :  J. K. Rowling
genre         :  Fantasy
yearPublished :  1998
bookPrice     :  11.99


bookTitle     :  The Lion, the Witch and the Wardrobe
author        :  C. S. Lewis
genre         :  Fantasy
yearPublished :  1950
bookPrice     :  9.99

is_b1_equal_to_b4 false
is_b1_equal_to_b8 true

##########################################################################################################################
// when using the compareTo method that compares Book objects by bookPrice
// the arrayListOfBooks will be sorted in ascending order of book price as shown below

>javac SortBooks.java
Note: SortBooks.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

>java SortBooks


A B C D E F G H I J K L M N O P Q  R S   T U V W X Y Z
              ^ 1 2 3 4 5 6 7 8 9 10 11 12


compare_T_and_H 12
comparing_b1_and_b4 is -2
comparing_b4_and_b1 is 2
comparing_b4_and_b4 is 0

bookTitle     :  The Lion, the Witch and the Wardrobe
author        :  C. S. Lewis
genre         :  Fantasy
yearPublished :  1950
bookPrice     :  9.99


bookTitle     :  Harry Potter and the Chamber of Secrets
author        :  J. K. Rowling
genre         :  Fantasy
yearPublished :  1998
bookPrice     :  11.99


bookTitle     :  Harry Potter and the Prisoner of Azkaban
author        :  J. K. Rowling
genre         :  Fantasy
yearPublished :  1998
bookPrice     :  11.99


bookTitle     :  Harry Potter and the Goblet of Fire
author        :  J. K. Rowling
genre         :  Fantasy
yearPublished :  2000
bookPrice     :  17.99


bookTitle     :  Harry Potter and the Half-Blood Prince
author        :  J. K. Rowling
genre         :  Fantasy
yearPublished :  2005
bookPrice     :  19.99


bookTitle     :  Harry Potter and the Order of the Phoenix
author        :  J. K. Rowling
genre         :  Fantasy
yearPublished :  2003
bookPrice     :  23.99


bookTitle     :  Harry Potter and the Deathly Hallows
author        :  J. K. Rowling
genre         :  Fantasy
yearPublished :  2007
bookPrice     :  27.99

is_b1_equal_to_b4 false
is_b1_equal_to_b8 true

*/
