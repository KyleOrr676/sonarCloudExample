package kyle;

public abstract class LibraryContents {


    private static String title;
    private static String genre;


    public LibraryContents(String title, String genre) {
        LibraryContents.title = title;
        LibraryContents.genre = genre;
    }


    public static String getTitle() {
        return title;
    }
    public void setTitle(String Title) {
        title = Title;
    }
    public static String getGenre() {
        return genre;
    }
    public void setGenre(String Genre){
        genre = Genre;
    }
}
