package kyle;

public class Book extends LibraryContents implements Literature {


    private static String Author;
    private static int BookLength;


    public Book(String Title, String Genre, String Author, int BookLength) {
        super(Title, Genre);
    }


    public static String getAuthor() {
        return Author;
    }
    public static void setAuthor(String Author) {
    }
    public void setLength(int Length){
        this.BookLength = Length;
    }
    public static int getBookLength(){
        return BookLength;
    }
    @Override
    public void written() {  ////////interface
    }
    @Override
    public void published() {  ////////interface
    }
    @Override
    public void read() {  ////////interface
    }
}