package kyle;

public class Novel extends Book implements Literature{


    public Novel(String Title, String Genre, String Author, int bookLength) {
        super(Title, Genre, Author, bookLength);
    }

    @Override
    public void written() {  ////// Interface
    }
    @Override
    public void published() {  ///// Interface
    }
    @Override
    public void read() {  ////// Interface
    }
}