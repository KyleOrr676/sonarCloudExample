package kyle;

public class Audiobook extends LibraryContents implements Literature{

    private static int ABLength;


    public Audiobook(String title, String genre, int length) {
        super(title, genre);
        ABLength = length;
    }


    public static int getABLength() {
        return ABLength;
    }
    public void setLength(int Length){
        this.ABLength=ABLength;
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
