
import kyle.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTests {

    @Test
    public void testGetBookTitleMethod(){
        Book testBook = new Book ("Harry Potter", "Fantasy", "JK Rowling",234);
        assertEquals("The Book is not Harry Potter", "Harry Potter", LibraryContents.getTitle());
    }
    @Test
    public void testSetBookTitleMethod(){
        String Title = "Harry Potter";
        Book testBook = new Book ("Harry Potter", "Fantasy", "JK Rowling", 234);
        testBook.setTitle("Harry Potter");
        assertEquals(LibraryContents.getTitle(), Title);
    }
    @Test
    public void testGetBookGenreMethod(){
        Book testBook = new Book ("Harry Potter", "Fantasy", "JK Rowling",234);
        assertEquals("The Book is not Fantasy", "Fantasy", LibraryContents.getGenre());
    }
    @Test
    public void testSetBookGenreMethod(){
        String Genre = "Fantasy";
        Book testBook = new Book ("Harry Potter", "Fantasy", "JK Rowling", 234);
        testBook.setGenre("Fantasy");
        assertEquals(LibraryContents.getGenre(), Genre);
    }
    @Test
    public void testGetBookAuthorMethod(){
        Book testBook = new Book ("Harry Potter", "Fantasy", "JK Rowling",234);
        assertEquals("The Book is not by JK Rowling", "JK Rowling", Book.getAuthor());
    }
    @Test
    public void testSetBookAuthorMethod(){
        String Author = "JK Rowling";
        Book testBook = new Book ("Harry Potter", "Fantasy", "JK Rowling", 234);
        Book.setAuthor("JK Rowling");
        assertEquals(Book.getAuthor(), Author);
    }
    @Test
    public void testGetBookLengthMethod(){
        Book testBook = new Book ("Harry Potter", "Fantasy", "JK Rowling",234);
        assertEquals("The length is not 234", 234, Book.getBookLength());
    }
    @Test
    public void testSetBookLengthMethod(){
        int Length = 234;
        Book testBook = new Book ("Harry Potter", "Fantasy", "JK Rowling", 234);
        testBook.setLength(234);
        assertEquals(Book.getBookLength(), Length);
    }


    @Test
    public void testGetDVDTitleMethod(){
        DVD testDVD = new DVD ("IT", "Horror", "Stephen King",96);
        assertEquals("The Film is not IT", "IT", LibraryContents.getTitle());
    }
    @Test
    public void testSetDVDTitleMethod(){
        String Title = "IT";
        DVD testDVD = new DVD ("IT", "Horror", "Stephen King", 96);
        testDVD.setTitle("IT");
        assertEquals(LibraryContents.getTitle(), Title);
    }
    @Test
    public void testGetDVDGenreMethod(){
        DVD testDVD = new DVD ("IT", "Horror", "Stephen King",96);
        assertEquals("The Film is not Horror", "Horror", LibraryContents.getGenre());
    }
    @Test
    public void testSetDVDGenreMethod(){
        String Genre = "Horror";
        DVD testDVD = new DVD ("IT", "Horror", "Stephen King", 96);
        testDVD.setGenre("Horror");
        assertEquals(LibraryContents.getGenre(), Genre);
    }
    @Test
    public void testGetDVDDirectorMethod(){
        DVD testDVD = new DVD ("IT", "Horror", "Stephen King",96);
        assertEquals("The Film is not Directed by Stephen King", "Stephen King", DVD.getDirector());
    }
    @Test
    public void testSetDVDDirectorMethod(){
        String Director = "Stephen King";
        DVD testDVD = new DVD ("IT", "Horror", "Stephen King", 96);
        testDVD.setDirector("Stephen King");
        assertEquals(DVD.getDirector(), Director);
    }
    @Test
    public void testGetDVDLengthMethod(){
        DVD testDVD = new DVD ("IT", "Horror", "Stephen King",96);
        assertEquals("The Film is not 96 mins long", 96, DVD.getDVDLength());
    }
    @Test
    public void testSetDVDLengthMethod(){
        int Length = 96;
        DVD testDVD = new DVD ("IT", "Horror", "Stephen King", 96);
        testDVD.setLength(96);
        assertEquals(DVD.getDVDLength(), Length);
    }


    @Test
    public void testGetAudiobookMethod(){
        Audiobook testAudiobook = new Audiobook ("LOTR", "Fantasy", 1500);
        assertEquals("The Film is not LOTR", "LOTR", LibraryContents.getTitle());
    }
    @Test
    public void testSetAudiobookTitleMethod(){
        String Title = "LOTR";
        Audiobook testAudiobook = new Audiobook ("LOTR", "Fantasy", 1500);
        testAudiobook.setTitle("LOTR");
        assertEquals(LibraryContents.getTitle(), Title);
    }
    @Test
    public void testGetAudiobookGenreMethod(){
        Audiobook testAudiobook = new Audiobook ("LOTR", "Fantasy", 1500);
        assertEquals("The Film is not Fantasy", "Fantasy", LibraryContents.getGenre());
    }
    @Test
    public void testSetAudiobookGenreMethod(){
        String Genre = "Fantasy";
        Audiobook testAudiobook = new Audiobook ("LOTR", "Fantasy", 1500);
        testAudiobook.setGenre("Fantasy");
        assertEquals(LibraryContents.getGenre(), Genre);
    }
    @Test
    public void testGetAudiobookLengthMethod(){
        Audiobook testAudiobook = new Audiobook ("LOTR", "Fantasy", 1500);
        assertEquals("The Film is not 1500 mins long", 1500, Audiobook.getABLength());
    }
    @Test
    public void testSetAudiobookLengthMethod(){
        int Length = 1500;
        Audiobook testAudiobook = new Audiobook ("LOTR", "Fantasy", 1500);
        testAudiobook.setLength(1500);
        assertEquals(Audiobook.getABLength(), Length);
    }


    @Test
    public void testGetComicTitleMethod(){
        Comic testComic = new Comic ("Batman", "Superhero", "DC Comics",50);
        assertEquals("The Comic is not Batman", "Batman", LibraryContents.getTitle());
    }
    @Test
    public void testSetComicTitleMethod(){
        String Title = "Batman";
        Comic testComic = new Comic ("Batman", "Superhero", "DC Comics", 50);
        testComic.setTitle("Batman");
        assertEquals(LibraryContents.getTitle(), Title);
    }
    @Test
    public void testGetComicGenreMethod(){
        Comic testComic = new Comic ("Batman", "Superhero", "DC Comics",50);
        assertEquals("The Genre is not Superhero", "Superhero", LibraryContents.getGenre());
    }
    @Test
    public void testSetComicGenreMethod(){
        String Genre = "Superhero";
        Comic testComic = new Comic ("Batman", "Superhero", "DC Comics", 50);
        testComic.setGenre("Superhero");
        assertEquals(LibraryContents.getGenre(), Genre);
    }
    @Test
    public void testGetComicAuthorMethod(){
        Comic testComic = new Comic ("Batman", "Superhero", "DC Comics",50);
        assertEquals("The Author is not DC Comics", "DC Comics", Book.getAuthor());
    }
    @Test
    public void testSetComicAuthorMethod(){
        String Author = "DC Comics";
        Comic testComic = new Comic ("Batman", "Superhero", "DC Comics", 50);
        Book.setAuthor("DC Comics");
        assertEquals(Book.getAuthor(), Author);
    }
    @Test
    public void testComicLengthMethod(){
        Comic testComic = new Comic ("Batman", "Superhero", "DC Comics",50);
        assertEquals("The Length is not 96", 50, Comic.getComicLength());
    }
    @Test
    public void testSetComicLengthMethod(){
        int Length = 50;
        Comic testComic = new Comic ("Batman", "Superhero", "DC Comics", 50);
        testComic.setLength(50);
        assertEquals(Comic.getComicLength(), Length);
    }


    @Test
    public void testGetNovelTitleMethod(){
        Novel testNovel = new Novel("Of mice and Men", "Adventure", "John Steinbeck", 200);
        assertEquals("The Title is not Of mice and men", "Of mice and Men", LibraryContents.getTitle());
    }
    @Test
    public void testSetNovelTitleMethod(){
        String Title = "Of mice and Men";
        Novel testNovel = new Novel ("Of mice and men", "Adventure", "John Steinbeck", 200);
        testNovel.setTitle("Of mice and Men");
        assertEquals(LibraryContents.getTitle(), Title);
    }
    @Test
    public void testGetNovelGenreMethod(){
        Novel testNovel = new Novel("Of mice and Men", "Adventure", "John Steinbeck", 200);
        assertEquals("The genre is not Adventure", "Adventure", LibraryContents.getGenre());
    }
    @Test
    public void testSetNovelGenreMethod(){
        String Genre = "Adventure";
        Novel testNovel = new Novel ("Of mice and men", "Adventure", "John Steinbeck", 200);
        testNovel.setGenre("Adventure");
        assertEquals(LibraryContents.getGenre(), Genre);
    }
    @Test
    public void testNovelAuthorMethod(){
        Novel testNovel = new Novel("Of mice and Men", "Adventure", "John Steinbeck", 200);
        assertEquals("The Author is not John Steinbeck", "John Steinbeck", Book.getAuthor());
    }
    @Test
    public void testSetNovelAuthorMethod(){
        String Author = "John Steinbeck";
        Novel testNovel = new Novel ("Of mice and men", "Adventure", "John Steinbeck", 200);
        testNovel.setTitle("OJohn Steinbeck");
        assertEquals(Book.getAuthor(), Author);
    }
    @Test
    public void testNovelLengthMethod(){
        Novel testNovel = new Novel("Of mice and Men", "Adventure", "John Steinbeck", 200);
        assertEquals("The Length is not 200", 200, Novel.getNovelLength());
    }
    @Test
    public void testSetNovelLengthMethod(){
        int Length = 200;
        Novel testNovel = new Novel ("Of mice and men", "Adventure", "John Steinbeck", 200);
        testNovel.setLength(200);
        assertEquals(Novel.getNovelLength(), Length);
    }
}