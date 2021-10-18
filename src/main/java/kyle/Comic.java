package kyle;

public class Comic extends Book implements Literature{

    public static int comicLength;


    public Comic(String Title, String Genre, String Author, int Length) {
        super(Title, Genre, Author, Length);
        comicLength = Length;
    }

    @Override
    public void setLength(int Length){
        Comic.comicLength = Length;
    }
    public static int getComicLength(){
        return comicLength;
    }
    @Override
    public void written() {  ///// Interface
    }
    @Override
    public void published() {  ///// Interface
    }
    @Override
    public void read() {  ///// Interface
    }
}