package kyle;

public class DVD extends LibraryContents implements Media {

    private static String Director;
    private static int DVDLength;


    public DVD(String title, String genre, String Director, int DVDLength) {
        super(title, genre);
        this.Director = Director;
        this.DVDLength = DVDLength;
    }


    public void setDirector(String director) {
        this.Director = director;
    }
    public static String getDirector() {
        return Director;
    }
    public void setLength(int Length) {
        this.DVDLength = Length;
    }
    public static int getDVDLength() {
        return DVDLength;
    }
    @Override
    public void watched() {
    }
    @Override
    public void listened() {
    }
}

