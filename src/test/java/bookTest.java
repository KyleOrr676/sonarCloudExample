import kyle.Book;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class bookTest {
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
        Book.setAuthor("JK Rowling");
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
        assertEquals(Book.getBookLength(), Length);
    }
}
