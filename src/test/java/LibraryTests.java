
import kyle.Audiobook;
import kyle.Book;
import kyle.Comic;
import kyle.DVD;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTests {

    @Test
    public void testBookTitleMethod(){
        Book testBook = new Book ("Harry Potter", "Fantasy", "JK Rowling",234);
        assertEquals("The Book is not Harry Potter", "Harry Potter", testBook.getTitle());
    }
    @Test
    public void testBookGenreMethod(){
        Book testBook = new Book ("Harry Potter", "Fantasy", "JK Rowling",234);
        assertEquals("The Book is not Fantasy", "Fantasy", testBook.getGenre());
    }
    @Test
    public void testDVDTitleMethod(){
        DVD testDVD = new DVD ("IT", "Horror", "Stephen King",96);
        assertEquals("The Film is not IT", "IT", testDVD.getTitle());
    }
    @Test
    public void testDVDGenreMethod(){
        DVD testDVD = new DVD ("IT", "Horror", "Stephen King",96);
        assertEquals("The Film is not Horror", "Horror", testDVD.getGenre());
    }
    @Test
    public void testAudiobookMethod(){
        Audiobook testAudiobook = new Audiobook ("LOTR", "Fantasy", 1500);
        assertEquals("The Film is not LOTR", "LOTR", testAudiobook.getTitle());
    }
    @Test
    public void testAudiobookGenreMethod(){
        Audiobook testAudiobook = new Audiobook ("LOTR", "Fantasy", 1500);
        assertEquals("The Film is not Fantasy", "Fantasy", testAudiobook.getGenre());
    }
    @Test
    public void testComicTitleMethod(){
        Comic testComic = new Comic ("Batman", "Superhero", "DC Comics",50);
        assertEquals("The Comic is not Batman", "Batman", testComic.getTitle());
    }
    @Test
    public void testComicGenreMethod(){
        Comic testComic = new Comic ("Batman", "Superhero", "DC Comics",50);
        assertEquals("The Genre is not Superhero", "Superhero", testComic.getGenre());
    }
    @Test
    public void testComicLengthMethod(){
        Comic testComic = new Comic ("Batman", "Superhero", "DC Comics",50);
        assertEquals("The Length is not 96", 50, testComic.getComicLength());
    }
}