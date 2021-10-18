package kyle;

public abstract class LibraryContents {


    private static String Title;
    private static String Genre;


    protected LibraryContents(String title, String genre) {
    }


    public static String getTitle() {
        return Title;
    }
    public void setTitle(String Title) {
        LibraryContents.Title = Title;
    }
    public static String getGenre(){
        return Genre;
    }
    public void setGenre(String Genre){
        LibraryContents.Genre = Genre;
    }
}

















