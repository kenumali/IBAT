import java.util.ArrayList;
import java.util.Collections;

public class BookTest1
{ 
	    public static void main(String[] args)
		{
			Book b1 = new Book("The Lion, the Witch and the Wardrobe",      "C. S. Lewis",     "Fantasy ",   1950,    9.99	);
			Book b2 = new Book("Harry Potter and the Deathly Hallows",      "J. K. Rowling",   "Fantasy",    2007,   27.99  );
			Book b3 = new Book("Harry Potter and the Half-Blood Prince",    "J. K. Rowling",   "Fantasy",    2005,   19.99  );
			Book b4 = new Book("Harry Potter and the Chamber of Secrets",   "J. K. Rowling",   "Fantasy",    1998,   11.99  );
			Book b5 = new Book("Harry Potter and the Prisoner of Azkaban",  "J. K. Rowling",   "Fantasy",    1998,   11.99  );
			Book b6 = new Book("Harry Potter and the Goblet of Fire",       "J. K. Rowling",   "Fantasy",    2000,   17.99  );
			Book b7 = new Book("Harry Potter and the Order of the Phoenix", "J. K. Rowling",   "Fantasy",    2003,   23.99  );
		    Book b8 = new Book("The Lion, the Witch and the Wardrobe",      "C. S. Lewis",     "Fantasy ",   1950,    9.99	);
			
		
		    System.out.println("\n\n----------------------------------------------------------------------------------------");
			System.out.println("b1.toString()\n-------------"+b1.toString() );
			System.out.println("----------------------------------------------------------------------------------------");
			
			
			System.out.println("b1.getBookTitle():     "+b1.getBookTitle() );
			System.out.println("\nb1.setBookTitle(\"New b1 Title\") \n");
			b1.setBookTitle("New b1 Title");
			System.out.println("b1.getBookTitle():     "+b1.getBookTitle() );
			System.out.println("\n----------------------------------------------------------------------------------------");
			
			System.out.println("b1.getAuthor():        "+b1.getAuthor() );
			System.out.println("\nb1.setAuthor(\"New b1 Author\") \n");
			b1.setAuthor("New b1 Author");
			System.out.println("b1.getAuthor():        "+b1.getAuthor() );
			System.out.println("\n\n----------------------------------------------------------------------------------------");
			
			
			System.out.println("b1.getGenre():         "+b1.getGenre() );
			System.out.println("\nb1.setGenre(\"New b1 Genre\") \n");
			b1.setGenre("New b1 Genre");
			System.out.println("b1.getGenre():         "+b1.getGenre() );
			System.out.println("\n\n----------------------------------------------------------------------------------------");
			
			System.out.println("b1.getYearPublished():  "+b1.getYearPublished() );
			System.out.println("\nb1.setYearPublished(1234) \n");
			b1.setYearPublished(1234);
			System.out.println("b1.getYearPublished():  "+b1.getYearPublished() );
			System.out.println("\n\n----------------------------------------------------------------------------------------");
			
			System.out.println("b1.getBookPrice():      "+b1.getBookPrice() );
			System.out.println("\nb1.setBookPrice(567.89) \n");
			b1.setBookPrice(567.89);
			System.out.println("b1.getBookPrice():      "+b1.getBookPrice() );
			
			System.out.println("\n\n----------------------------------------------------------------------------------------");
			System.out.println("b1.toString()\n-------------"+b1.toString() );
			System.out.println("----------------------------------------------------------------------------------------");
			
	    }
}

/*

>javac BookTest1.java

>java BookTest1

----------------------------------------------------------------------------------------
b1.toString()
-------------
bookTitle     :  The Lion, the Witch and the Wardrobe
author        :  C. S. Lewis
genre         :  Fantasy
yearPublished :  1950
bookPrice     :  9.99

----------------------------------------------------------------------------------------
b1.getBookTitle():     The Lion, the Witch and the Wardrobe

b1.setBookTitle("New b1 Title")

b1.getBookTitle():     New b1 Title

----------------------------------------------------------------------------------------
b1.getAuthor():        C. S. Lewis

b1.setAuthor("New b1 Author")

b1.getAuthor():        New b1 Author


----------------------------------------------------------------------------------------
b1.getGenre():         Fantasy

b1.setGenre("New b1 Genre")

b1.getGenre():         New b1 Genre


----------------------------------------------------------------------------------------
b1.getYearPublished():  1950

b1.setYearPublished(1234)

b1.getYearPublished():  1234


----------------------------------------------------------------------------------------
b1.getBookPrice():      9.99

b1.setBookPrice(567.89)

b1.getBookPrice():      567.89


----------------------------------------------------------------------------------------
b1.toString()
-------------
bookTitle     :  New b1 Title
author        :  New b1 Author
genre         :  New b1 Genre
yearPublished :  1234
bookPrice     :  567.89

----------------------------------------------------------------------------------------
*/
