package kyle;

public class Audiobook extends LibraryContents implements Literature{

    private static int ABLength;


    public Audiobook(String title, String genre, int length) {
        super(title, genre);
    }


    public static int getABLength() {
        return ABLength;
    }
    public void setLength(int Length){
    }
    @Override
    public void written() { /////////////interface
    }
    @Override
    public void published() {  /////////////interface
    }
    @Override
    public void read() {  /////////////interface
    }
}
