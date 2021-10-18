package kyle;

public class Novel extends Book implements Literature{

    private static String NovelAuthor;
    private static int NovelLength;


    public Novel(String title, String genre, String Author, int Length) {
        super(title, genre, Author, Length);
        Novel.NovelLength = Length;
        Novel.NovelAuthor = Author;
    }

    public static int getNovelLength(){
        return NovelLength;
    }
    public void setLength(int Length){
        NovelLength = Length;
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