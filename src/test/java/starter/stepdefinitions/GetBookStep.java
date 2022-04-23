package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.bookstore.BooksGet;

public class GetBookStep {

    @Steps
    BooksGet booksget;



    @Given("I set an endpoint for GET all the books")
    public void iSetAnEndpointForGETAllTheBooks() {
        booksget.getEndPoint();
    }

    @When("I request GET all the books")
    public void iRequestGETAllTheBooks() {
        booksget.requestGetListBooks();
    }

    @Then("I validate the status code is {int}")
    public void iValidateTheStatusCodeIs(int arg0) {
        booksget.verifyStatusCode(arg0);
    }

    @And("I get isbn data for other request")
    public void iGetIsbnDataForOtherRequest() {
        booksget.getIsbn();
    }
}
