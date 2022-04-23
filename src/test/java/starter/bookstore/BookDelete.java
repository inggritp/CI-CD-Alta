package starter.bookstore;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookDelete {
    @Given("I set an endpoint for Delete specific book")
    public void iSetAnEndpointForDeleteSpecificBook() {
        System.out.println("https://demoqa.com/BookStore/v1/Book");
    }

    @When("I request Delete specific book")
    public void iRequestDeleteSpecificBook() {
        System.out.println("valid isbn and userId");
    }

    @Then("I validate delete status code is {int}")
    public void iValidateDeleteStatusCodeIs(int arg0) {
        System.out.println(204);
    }

    @And("validate the after delete detail")
    public void validateTheAfterDeleteDetail() {
        System.out.println("user.id,isbn,message");
    }

    @When("I request Delete specific book with invalid isbn and userId")
    public void iRequestDeleteSpecificBookWithInvalidIsbnAndUserId() {
        System.out.println("invalid isbn, invalid userId");
    }

    @Then("I validate fail to delete status code is {int}")
    public void iValidateFailToDeleteStatusCodeIs(int arg0) {
        System.out.println(401);
    }

    @And("validate the after fail delete detail")
    public void validateTheAfterFailDeleteDetail() {
        System.out.println("Code : 1200");
        System.out.println("message : User not authorized!");
    }
}
