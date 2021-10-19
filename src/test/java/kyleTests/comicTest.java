package kyleTests;

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
        assertEquals("this isn't the right title", testComic.getTitle(), Title);
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
        assertEquals("this isn't the right genre", testComic.getGenre(), Genre);
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
        assertEquals("this isn't the right author", testComic.getAuthor(), Author);
    }
    @Test
    public void testComicLengthMethod(){
        Comic testComic = new Comic ("Batman", "Superhero", "DC Comics",50);
        assertEquals("The Length is not 50", 50, testComic.getBookLength());
    }
    @Test
    public void testSetComicLengthMethod(){
        int Length = 50;
        Comic testComic = new Comic ("Batman", "Superhero", "DC Comics", 50);
        Book.setBookLength(50);
        assertEquals("this isn't the right length", testComic.getBookLength(), Length);
    }
}
