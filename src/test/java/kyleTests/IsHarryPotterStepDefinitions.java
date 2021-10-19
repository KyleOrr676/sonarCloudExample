package kyleTests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import kyle.Book;

import static org.junit.Assert.assertEquals;

public class IsHarryPotterStepDefinitions {

    static String isItHarryPotter(String Title) {return "Harry Potter".equals(Title) ? "Yes" : "No";}

        Book testTitle = new Book("Harry Potter", "Fantasy", "JK Rowling", 964);
        private String Title;
        private String actualTitle;


        @Given("The book is Harry Potter")
        public void the_book_is_Harry_Potter() {
            Title = "Harry Potter";
        }
        @Given("The book is The Hobbit")
        public void the_book_is_the_hobbit() {
           Title = "The Hobbit";
        }
        @When("I ask whether the book is Harry Potter")
        public void i_ask_whether_the_book_is_harry_potter() {
            actualTitle = IsHarryPotterStepDefinitions.isItHarryPotter(Title);
        }
        @Then("I should be told {string}")
        public void i_should_be_told(String expectedAnswer)
        {assertEquals(expectedAnswer, actualTitle);}
}











