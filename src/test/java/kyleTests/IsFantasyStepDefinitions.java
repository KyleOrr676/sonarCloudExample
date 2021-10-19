//package kyleTests;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//import io.cucumber.java.en.Then;
//import kyle.Book;
//
//import static org.junit.Assert.assertEquals;
//
//public class IsFantasyStepDefinitions {
//
//    static String isItFantasy(String Genre) {return "Fantasy".equals(Genre) ? "Yes" : "No";}
//
//    Book testGenre = new Book("Harry Potter", "Fantasy", "JK Rowling", 964);
//    private String Genre;
//    private String actualGenre;
//
//    @Given("The genre is Fantasy")
//    public void The_genre_is_Fantasy() {
//        Genre = "Fantasy";
//    }
//    @Given("The genre is Horror")
//    public void The_genre_is_Horror() {
//        Genre = "Horror";
//    }
//    @When("I ask whether the genre is Fantasy")
//    public void I_ask_whether_the_genre_is_fantasy() {
//        actualGenre = IsFantasyStepDefinitions.isItFantasy(Genre);
//    }
//    @Then("I should be told {string}")
//    public void I_should_be_told(String expectedAnswer) {
//        assertEquals(expectedAnswer, actualGenre);
//    }
//}
