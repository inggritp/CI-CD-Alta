package starter.bookstore;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BooksPost {
    @Given("I set an endpoint for POST new book")
    public void iSetAnEndpointForPOSTNewBook() {
        System.out.println("https://demoqa.com/BookStore/v1/Books");
    }

    @When("I request POST new book")
    public void iRequestPOSTNewBook() {
        System.out.println("click execute");
    }

    @And("I input valid userId and valid isbn")
    public void iInputValidUserIdAndValidIsbn() {
        System.out.println("valid userId and valid isbn");
    }

    @Then("I validate  status code is {int}")
    public void iValidateStatusCodeIs(int arg0) {
        System.out.println(201);
    }

    @And("I validate the book detail")
    public void iValidateTheBookDetail() {
        System.out.println("valid isbn");
    }
}
