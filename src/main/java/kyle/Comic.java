package kyle;

public class Comic extends Book implements Literature{

    public Comic(String Title, String Genre, String Author, int Length) {
        super(Title, Genre, Author, Length);
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