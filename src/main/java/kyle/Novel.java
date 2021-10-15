package kyle;

public class Novel extends Book implements Literature{

    private static String Author;
    private static int NovelLength;


    public Novel(String title, String genre, String Author, int Length) {
        super(title, genre, Author, Length);
        this.NovelLength = Length;
    }


    public void setLength(int Length){
        this.NovelLength = Length;
    }
    public static int getNovelLength(){
        return NovelLength;
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