package kyle;

public class DVD extends LibraryContents implements Media {

    private static String Director;
    private static int dvdLength;


    public DVD(String title, String genre, String Director, int DVDLength) {
        super(title, genre);
        DVD.Director = Director;
        DVD.dvdLength = DVDLength;
    }

    public static String getDirector() {
        return Director;
    }
    public void setDirector(String director) {
        Director = director;
    }
    public void setLength(int Length) {
        dvdLength = Length;
    }
    public static int getDVDLength() {
        return dvdLength;
    }

    @Override
    public void watched() {
    }
    @Override
    public void listened() {
    }
}

