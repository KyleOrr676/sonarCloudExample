package kyle;

public class DVD extends LibraryContents implements Media {

    private static String Director;
    private static int DVDLength;


    public DVD(String title, String genre, String Director, int DVDLength) {
        super(title, genre);
    }

    public void setDirector(String director) {
        Director = director;
    }
    public static String getDirector() {
        return Director;
    }
    public void setLength(int Length) {
        DVDLength = Length;
    }
    public static int getDVDLength() {
        return DVDLength;
    }
    @Override
    public void watched() { ////////interface
    }
    @Override
    public void listened() { ////////interface
    }
}

