package kyleTests;

import io.cucumber.core.gherkin.Feature;
import kyle.LibraryContents;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {


    @Test
    public void testGetLibraryContentsTitleMethod(){
        LibraryContents testLibraryContents = new LibraryContents("LOTR", "Fantasy") {};
        assertEquals("The Film is not LOTR", "LOTR", testLibraryContents.getTitle());
    }
    @Test
    public void testSetLibraryContentsTitleMethod(){
        String Title = "LOTR";
        LibraryContents testLibraryContents = new LibraryContents("LOTR", "Fantasy") {
        };
        testLibraryContents.setTitle("LOTR");
        assertEquals("this isn't the right title", testLibraryContents.getTitle(), Title);
    }
    @Test
    public void testGetLibraryContentsGenreMethod(){
        LibraryContents testLibraryContents = new LibraryContents("LOTR", "Fantasy") {};
        assertEquals("The Film is not Fantasy", "Fantasy", testLibraryContents.getGenre());
    }
    @Test
    public void testSetLibraryContentsGenreMethod(){
        String Genre = "Fantasy";
        LibraryContents testLibraryContents = new LibraryContents("LOTR", "Fantasy") {};
        testLibraryContents.setGenre("Fantasy");
        assertEquals("this isn't the right genre", testLibraryContents.getGenre(), Genre);
    }
}