
import kyle.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTests {

    @Test
    public void testGetBookTitleMethod(){
        Book testBook = new Book ("Harry Potter", "Fantasy", "JK Rowling",234);
        assertEquals("The Book is not Harry Potter", "Harry Potter", testBook.getTitle());
    }
    @Test
    public void testSetBookTitleMethod(){
        String Title = "Harry Potter";
        Book testBook = new Book ("Harry Potter", "Fantasy", "JK Rowling", 234);
        testBook.setTitle("Harry Potter");
        assertEquals(testBook.getTitle(), Title);
    }
    @Test
    public void testGetBookGenreMethod(){
        Book testBook = new Book ("Harry Potter", "Fantasy", "JK Rowling",234);
        assertEquals("The Book is not Fantasy", "Fantasy", testBook.getGenre());
    }
    @Test
    public void testSetBookGenreMethod(){
        String Genre = "Fantasy";
        Book testBook = new Book ("Harry Potter", "Fantasy", "JK Rowling", 234);
        testBook.setGenre("Fantasy");
        assertEquals(testBook.getGenre(), Genre);
    }
    @Test
    public void testGetBookAuthorMethod(){
        Book testBook = new Book ("Harry Potter", "Fantasy", "JK Rowling",234);
        assertEquals("The Book is not by JK Rowling", "JK Rowling", testBook.getAuthor());
    }
    @Test
    public void testSetBookAuthorMethod(){
        String Author = "JK Rowling";
        Book testBook = new Book ("Harry Potter", "Fantasy", "JK Rowling", 234);
        testBook.setAuthor("JK Rowling");
        assertEquals(testBook.getAuthor(), Author);
    }
    @Test
    public void testGetBookLengthMethod(){
        Book testBook = new Book ("Harry Potter", "Fantasy", "JK Rowling",234);
        assertEquals("The length is not 234", 234, testBook.getBookLength());
    }
    @Test
    public void testSetBookLengthMethod(){
        int Length = 234;
        Book testBook = new Book ("Harry Potter", "Fantasy", "JK Rowling", 234);
        testBook.setLength(234);
        assertEquals(testBook.getBookLength(), Length);
    }


    @Test
    public void testGetDVDTitleMethod(){
        DVD testDVD = new DVD ("IT", "Horror", "Stephen King",96);
        assertEquals("The Film is not IT", "IT", testDVD.getTitle());
    }
    @Test
    public void testSetDVDTitleMethod(){
        String Title = "IT";
        DVD testDVD = new DVD ("IT", "Horror", "Stephen King", 96);
        testDVD.setTitle("IT");
        assertEquals(testDVD.getTitle(), Title);
    }
    @Test
    public void testGetDVDGenreMethod(){
        DVD testDVD = new DVD ("IT", "Horror", "Stephen King",96);
        assertEquals("The Film is not Horror", "Horror", testDVD.getGenre());
    }
    @Test
    public void testSetDVDGenreMethod(){
        String Genre = "Horror";
        DVD testDVD = new DVD ("IT", "Horror", "Stephen King", 96);
        testDVD.setGenre("Horror");
        assertEquals(testDVD.getGenre(), Genre);
    }
    @Test
    public void testGetDVDDirectorMethod(){
        DVD testDVD = new DVD ("IT", "Horror", "Stephen King",96);
        assertEquals("The Film is not Directed by Stephen King", "Stephen King", testDVD.getDirector());
    }
    @Test
    public void testSetDVDDirectorMethod(){
        String Director = "Stephen King";
        DVD testDVD = new DVD ("IT", "Horror", "Stephen King", 96);
        testDVD.setDirector("Stephen King");
        assertEquals(testDVD.getDirector(), Director);
    }
    @Test
    public void testGetDVDLengthMethod(){
        DVD testDVD = new DVD ("IT", "Horror", "Stephen King",96);
        assertEquals("The Film is not 96 mins long", 96, testDVD.getDVDLength());
    }
    @Test
    public void testSetDVDLengthMethod(){
        int Length = 96;
        DVD testDVD = new DVD ("IT", "Horror", "Stephen King", 96);
        testDVD.setLength(96);
        assertEquals(testDVD.getDVDLength(), Length);
    }


    @Test
    public void testGetAudiobookMethod(){
        Audiobook testAudiobook = new Audiobook ("LOTR", "Fantasy", 1500);
        assertEquals("The Film is not LOTR", "LOTR", testAudiobook.getTitle());
    }
    @Test
    public void testSetAudiobookTitleMethod(){
        String Title = "LOTR";
        Audiobook testAudiobook = new Audiobook ("LOTR", "Fantasy", 1500);
        testAudiobook.setTitle("LOTR");
        assertEquals(testAudiobook.getTitle(), Title);
    }
    @Test
    public void testGetAudiobookGenreMethod(){
        Audiobook testAudiobook = new Audiobook ("LOTR", "Fantasy", 1500);
        assertEquals("The Film is not Fantasy", "Fantasy", testAudiobook.getGenre());
    }
    @Test
    public void testSetAudiobookGenreMethod(){
        String Genre = "Fantasy";
        Audiobook testAudiobook = new Audiobook ("LOTR", "Fantasy", 1500);
        testAudiobook.setGenre("Fantasy");
        assertEquals(testAudiobook.getGenre(), Genre);
    }
    @Test
    public void testGetAudiobookLengthMethod(){
        Audiobook testAudiobook = new Audiobook ("LOTR", "Fantasy", 1500);
        assertEquals("The Film is not 1500 mins long", 1500, testAudiobook.getABLength());
    }
    @Test
    public void testSetAudiobookLengthMethod(){
        int Length = 1500;
        Audiobook testAudiobook = new Audiobook ("LOTR", "Fantasy", 1500);
        testAudiobook.setLength(1500);
        assertEquals(testAudiobook.getABLength(), Length);
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