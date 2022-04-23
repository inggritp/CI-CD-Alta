package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.User.Post;
import starter.User.PostAuthorized;
import starter.User.PostGenerateToken;

public class UserStep {

    public String username,userId;
    @Steps
    Post post;

    @Steps
    PostAuthorized postauthorized;

    @Steps
    PostGenerateToken postGenerateToken;


//    @When("I request valid POST detail user")
//    public void iRequestValidPostDetailUser(){
//        post.requestValidPostDetailUser();
//
//    }
//    @Then("I validate the status code for POST new user  is 201")
//    public void iValidateTheStatusCodeForPostNewUser(){
//        post.validateStatusCodeForPOSTNewUser();
//
//
//    }
//    @And("I validate the data detail after create user")
//    public void iValidateTheDataDetailAfterCreateUser(){
//        post.validateTheDataDetailAfterCreateUser();
//
//    }
//    @And("get userId")
//    public void getUserId(){
//        post.getUserId();
//
//    }
//
//    @When("I request POST detail user with exist username")
//    public void requestPostDetailWithExistUserName(){
//        post.requestPOSTWithExistUsername();
//    }
//
//    @Then("I validate POST exist status code is 406")
//    public void validatePostExistStatus(){
//        post.validatePOSTExistStatusCode();
//    }
//
//    @And("I validate the data detail after failed create user")
//    public void validateTheDataAfterFailed(){
//        post.validateTheDataDetailAfterFailed();
//    }
//
//    @Given("I set an endpoint for POST generate token")
//    public void iSetAnEndpointGenerateToken(){
//        postGenerateToken.setGenerateTokenEndpoint();
//
//    }
//    @When("I request POST generate token")
//    public void requestPostGenerateToken(){
//        postGenerateToken.requestPostGenerateToken();
//
//    }
//    @Then("I validate generate status code is 200")
//    public void validateGenerateStatus(){
//        postGenerateToken.validateGenerateStatusCode200();
//
//    }
//    @And("I validate the data after generate token")
//    public void validateTheDataAfterGenerate(){
//        postGenerateToken.validateAfterGenerate();
//
//    }
//
//    @When("I request POST generate token with invalid username and password")
//    public void requestPOSTGenerateTokenWithInvalidUsername(){
//        postGenerateToken.requestPostGenerateTokenWithInvalidUsername();
//
//    }
//    @Then("I validate generate status code still 200")
//    public void validateGenerateStatusStill200(){
//        postGenerateToken.validateGenerateStatusCodeStill200();
//
//    }
//    @And("I validate the data after fail to generate token")
//    public void validateTheDataAfterFailToGenerate(){
//        postGenerateToken.validateTheDataAfterFail();
//
//    }


    @Given("I set an endpoint for POST new user")
    public void iSetAnEndpointForPOSTNewUser() {
        post.setPostEndpoint();

    }

    @When("I enter {string} with {string}")
    public void iEnterWith(String username, String password) {
        post.requestValidPostDetailUser(username,password);
    }

    @Then("I validate the status code for POST new user  is {int}")
    public void iValidateTheStatusCodeForPOSTNewUserIs(int arg0) {
        post.validateStatusCodeForPOSTNewUser(arg0);
    }

    @And("I validate the {string} after create user")
    public void iValidateTheAfterCreateUser(String message) {
        post.validateTheDataDetailAfterCreateUser(message);
    }

}
