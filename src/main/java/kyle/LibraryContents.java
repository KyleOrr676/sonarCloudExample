package kyle;

public abstract class LibraryContents {


    private static String Title;
    private static String Genre;


    public LibraryContents(String title, String genre) {
        Title = title;
        Genre = genre;
    }


    public static String getTitle() {
        return Title;
    }
    public void setTitle(String Title) {
        this.Title = Title;
    }
    public static String getGenre(){
        return Genre;
    }
    public void setGenre(String Genre){
        this.Genre = Genre;
    }
}

















