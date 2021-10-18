
import kyle.*;

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
    public void testBookAuthorMethod(){
        Book testBook = new Book ("Harry Potter", "Fantasy", "JK Rowling",234);
        assertEquals("The Book is not by JK Rowling", "JK Rowling", testBook.getAuthor());
    }
    @Test
    public void testBookLengthMethod(){
        Book testBook = new Book ("Harry Potter", "Fantasy", "JK Rowling",234);
        assertEquals("The length is not 234", 234, testBook.getBookLength());
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
    public void testDVDDirectorMethod(){
        DVD testDVD = new DVD ("IT", "Horror", "Stephen King",96);
        assertEquals("The Film is not Directed by Stephen King", "Stephen King", testDVD.getDirector());
    }
    @Test
    public void testDVDLengthMethod(){
        DVD testDVD = new DVD ("IT", "Horror", "Stephen King",96);
        assertEquals("The Film is not 96 mins long", 96, testDVD.getDVDLength());
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
    public void testAudiobookLengthMethod(){
        Audiobook testAudiobook = new Audiobook ("LOTR", "Fantasy", 1500);
        assertEquals("The Film is not 1500 mins long", 1500, testAudiobook.getABLength());
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

    @Test
    public void testNovelTitleMethod(){
        Novel testNovel = new Novel("Of mice and Men", "Adventure", "John Steinbeck", 200);
        assertEquals("The Title is not Of mice and men", "Of mice and Men", testNovel.getTitle());
    }
    @Test
    public void testNovelGenreMethod(){
        Novel testNovel = new Novel("Of mice and Men", "Adventure", "John Steinbeck", 200);
        assertEquals("The genre is not Adventure", "Adventure", testNovel.getGenre());
    }
    @Test
    public void testNovelAuthorMethod(){
        Novel testNovel = new Novel("Of mice and Men", "Adventure", "John Steinbeck", 200);
        assertEquals("The Author is not John Steinbeck", "John Steinbeck", testNovel.getAuthor());
    }
    @Test
    public void testNovelLengthMethod(){
        Novel testNovel = new Novel("Of mice and Men", "Adventure", "John Steinbeck", 200);
        assertEquals("The Length is not 200", 200, testNovel.getNovelLength());
    }
}