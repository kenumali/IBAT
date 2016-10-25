public class Book implements Comparable{
	
	private  String   bookTitle;
	private  String   author;
	private  String   genre;
	private  int      yearPublished;
	private  double   bookPrice;
	
	public Book(String titleParam, String authorParam, String genreParam, int yearParam, double priceParam) {
		bookTitle = titleParam;
		author = authorParam;
		genre = genreParam;
		yearPublished = yearParam;
		bookPrice = priceParam;
	}
	
	public String getBookTitle() {
		return this.bookTitle;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public String getGenre() {
		return this.genre;
	}
	
	public int getYearPublished() {
		return this.yearPublished;
	}
	
	public double getBookPrice() {
		return this.bookPrice;
	}
	
	public void setBookTitle(String title) {
		this.bookTitle = title;
	}
	
	public void setAuthor(String name) {
		this.author = name;
	}
	
	public void setGenre(String genreX) {
		this.genre = genreX;
	}
	
	public void setYearPublished(int year) {
		this.yearPublished = year;
	}
	
	public void setBookPrice(double price) {
		this.bookPrice = price;
	}
	
	public boolean equals(Object obj) {
		Book book = (Book) obj;
		if(this.bookTitle.equals(book.bookTitle) && this.author.equals(book.author)
			&& this.genre.equals(book.genre) && this.yearPublished == book.yearPublished
			&& this.bookPrice == book.bookPrice) {
			return true;
		} else {
			return false;	
		}
	}
	
	//compareTo in terms of bookTitle
	public int compareTo(Object obj) {
		Book book = (Book) obj;
		return this.bookTitle.compareTo(book.bookTitle);
		//return (int)(this.bookTitle.charAt(0) - book.bookTitle.charAt(0)); --- longer way
	}
	
	//compareTo in terms of bookPrice
	/*public int compareTo(Object obj) {
		Book book = (Book) obj;
		double diff_bookPrice = this.bookPrice - book.bookPrice;
		return (int)diff_bookPrice;
	}*/
	
	//compareTo in terms of yearPublished
	/*public int compareTo(Object obj) {
		Book book = (Book) obj;
		return this.yearPublished - book.yearPublished;
	}*/
	
	public String toString() {
		String str = "\n" + "bookTitle     : " + this.bookTitle + "\n" +
							"author	      : " + this.author + "\n" +
							"genre	      : " + this.genre + "\n" +
							"yearPublished : " + this.yearPublished + "\n" +
							"bookPrice     : " + this.bookPrice + "\n";
		return str;
	}
}
