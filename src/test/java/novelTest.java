import kyle.Novel;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class novelTest {
    @Test
    public void testGetNovelTitleMethod(){
        Novel testNovel = new Novel("Of mice and Men", "Adventure", "John Steinbeck", 200);
        assertEquals("The Title is not Of mice and men", "Of mice and Men", testNovel.getTitle());
    }
    @Test
    public void testSetNovelTitleMethod(){
        String Title = "Of mice and Men";
        Novel testNovel = new Novel ("Of mice and men", "Adventure", "John Steinbeck", 200);
        testNovel.setTitle("Of mice and Men");
        assertEquals(testNovel.getTitle(), Title);
    }
    @Test
    public void testGetNovelGenreMethod(){
        Novel testNovel = new Novel("Of mice and Men", "Adventure", "John Steinbeck", 200);
        assertEquals("The genre is not Adventure", "Adventure", testNovel.getGenre());
    }
    @Test
    public void testSetNovelGenreMethod(){
        String Genre = "Adventure";
        Novel testNovel = new Novel ("Of mice and men", "Adventure", "John Steinbeck", 200);
        testNovel.setGenre("Adventure");
        assertEquals(testNovel.getGenre(), Genre);
    }
    @Test
    public void testNovelAuthorMethod(){
        Novel testNovel = new Novel("Of mice and Men", "Adventure", "John Steinbeck", 200);
        assertEquals("The Author is not John Steinbeck", "John Steinbeck", testNovel.getAuthor());
    }
    @Test
    public void testSetNovelAuthorMethod(){
        String Author = "John Steinbeck";
        Novel testNovel = new Novel ("Of mice and men", "Adventure", "John Steinbeck", 200);
        testNovel.setTitle("OJohn Steinbeck");
        assertEquals(testNovel.getAuthor(), Author);
    }
    @Test
    public void testNovelLengthMethod(){
        Novel testNovel = new Novel("Of mice and Men", "Adventure", "John Steinbeck", 200);
        assertEquals("The Length is not 200", 200, testNovel.getNovelLength());
    }
    @Test
    public void testSetNovelLengthMethod(){
        int Length = 200;
        Novel testNovel = new Novel ("Of mice and men", "Adventure", "John Steinbeck", 200);
        testNovel.setLength(200);
        assertEquals(testNovel.getNovelLength(), Length);
    }
}
