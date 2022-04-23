package starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostGenerateToken {

    private static String base_url = "https://demoqa.com/Account/v1/";

    @Step("I set an endpoint for POST generate token")
    public String setGenerateTokenEndpoint(){
        return base_url + "GenerateToken";
    }

    @Step("I request POST generate token")
    public void requestPostGenerateToken(){
        JSONObject requestData = new JSONObject();
        requestData.put("userName", "Jennierubyjane25");
        requestData.put("password", "Jendeuki123!");

        given().header("Content-Type", "application/json").body(requestData.toJSONString())
                .when().post(setGenerateTokenEndpoint());

    }
    @Step("I validate generate status code is 200")
    public void validateGenerateStatusCode200(){
        then().statusCode(200);
    }
    @Step("I validate the data after generate token")
    public void validateAfterGenerate(){
        then().body("status", equalTo("Success"));
    }

    @Step("I request POST generate token with invalid username and password")
    public void requestPostGenerateTokenWithInvalidUsername(){
        JSONObject requestData = new JSONObject();
        requestData.put("userName", "Rubyjane321");
        requestData.put("password", "blackPink*1234");

        given().header("Content-Type","application/json").body(requestData.toJSONString())
                .when().post(setGenerateTokenEndpoint());
    }

    @Step("I validate generate status code still 200")
    public void validateGenerateStatusCodeStill200(){
        then().statusCode(200);
    }
    @Step("I validate the data after fail to generate token")
    public void validateTheDataAfterFail(){
        then().body("status", equalTo("Failed"));
    }



}
