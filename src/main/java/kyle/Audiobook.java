package kyle;

public class Audiobook extends LibraryContents implements Literature{

    private static int ABLength;


    public Audiobook(String title, String genre, int Length) {
        super(title, genre);
        ABLength = Length;
    }


    public static int getABLength() {
        return ABLength;
    }
    public static void setLength(int Length){
        Audiobook.ABLength = Length;
    }
    @Override
    public void written() { ///// Interface
    }
    @Override
    public void published() { ////// Interface
    }
    @Override
    public void read() {  ////// Interface
    }
}
