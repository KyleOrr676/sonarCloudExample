import kyle.Book;
import kyle.Comic;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class comicTest {
    @Test
    public void testGetComicTitleMethod(){
        Comic testComic = new Comic ("Batman", "Superhero", "DC Comics",50);
        assertEquals("The Comic is not Batman", "Batman", testComic.getTitle());
    }
    @Test
    public void testSetComicTitleMethod(){
        String Title = "Batman";
        Comic testComic = new Comic ("Batman", "Superhero", "DC Comics", 50);
        testComic.setTitle("Batman");
        assertEquals(testComic.getTitle(), Title);
    }
    @Test
    public void testGetComicGenreMethod(){
        Comic testComic = new Comic ("Batman", "Superhero", "DC Comics",50);
        assertEquals("The Genre is not Superhero", "Superhero", testComic.getGenre());
    }
    @Test
    public void testSetComicGenreMethod(){
        String Genre = "Superhero";
        Comic testComic = new Comic ("Batman", "Superhero", "DC Comics", 50);
        testComic.setGenre("Superhero");
        assertEquals(testComic.getGenre(), Genre);
    }
    @Test
    public void testGetComicAuthorMethod(){
        Comic testComic = new Comic ("Batman", "Superhero", "DC Comics",50);
        assertEquals("The Author is not DC Comics", "DC Comics", testComic.getAuthor());
    }
    @Test
    public void testSetComicAuthorMethod(){
        String Author = "DC Comics";
        Comic testComic = new Comic ("Batman", "Superhero", "DC Comics", 50);
        Book.setAuthor("DC Comics");
        assertEquals(testComic.getAuthor(), Author);
    }
    @Test
    public void testComicLengthMethod(){
        Comic testComic = new Comic ("Batman", "Superhero", "DC Comics",50);
        assertEquals("The Length is not 96", 50, testComic.getComicLength());
    }
    @Test
    public void testSetComicLengthMethod(){
        int Length = 50;
        Comic testComic = new Comic ("Batman", "Superhero", "DC Comics", 50);
        testComic.setLength(50);
        assertEquals(testComic.getComicLength(), Length);
    }
}
