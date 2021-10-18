package kyle;

public class Book extends LibraryContents implements Literature {


    private static String Author;
    private static int bookLength;


    public Book(String Title, String Genre, String Author, int bookLength) {
        super(Title, Genre);
        Book.Author = Author;
        Book.bookLength = bookLength;
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
    public void setLength(int Length){
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