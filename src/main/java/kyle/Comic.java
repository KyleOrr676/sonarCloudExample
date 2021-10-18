package kyle;

public class Comic extends Book implements Literature{

    public static int ComicLength;


    public Comic(String Title, String Genre, String Author, int Length) {
        super(Title, Genre, Author, Length);
        ComicLength = Length;
    }


    public void setLength(int Length){
        ComicLength = Length;
    }
    public static int getComicLength(){
        return ComicLength;
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