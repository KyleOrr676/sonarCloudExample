import kyle.Audiobook;
import kyle.LibraryContents;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class audiobookTest {
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
        assertEquals("this isn't the right title", LibraryContents.getTitle(), Title);
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
        assertEquals("this isn't the right genre", LibraryContents.getGenre(), Genre);
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
        Audiobook.setLength(1500);
        assertEquals("this isn't the right length", testAudiobook.getABLength(), Length);
    }
}
