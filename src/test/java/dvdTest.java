import kyle.DVD;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class dvdTest {
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

}
