package kyle;

public class Book extends LibraryContents implements Literature {


    private static String Author;
    private static int BookLength;


    public Book(String Title, String Genre, String Author, int BookLength) {
        super(Title, Genre);
        Book.Author = Author;

    }


    public static String getAuthor() {
        return Author;
    }
    public static void setAuthor(String Author) {
        Author = Author;
    }
    public void setLength(int Length){
        BookLength = Length;
    }
    public static int getBookLength(){
        return BookLength;
    }
    @Override
    public void written() {
    }
    @Override
    public void published() {
    }
    @Override
    public void read() {
    }
}