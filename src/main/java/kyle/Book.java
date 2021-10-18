package kyle;

public class Book extends LibraryContents implements Literature {


    private static String Author;
    private static int bookLength;


    public Book(String Title, String Genre, String Author, int bookLength) {
        super(Title, Genre);
        Book.Author = Author;
    }


    public static String getAuthor() {
        return Author;
    }
    public static void setAuthor(String Author) {
        Book.Author = Author;
    }
    public static int getBookLength(){
        return bookLength;
    }
    public static void setBookLength(int Length){
        Book.bookLength = Length;
    }
    @Override
    public void written() {  ////// Interface
    }
    @Override
    public void published() {  ////// Interface
    }
    @Override
    public void read() {  ////// Interface
    }
}