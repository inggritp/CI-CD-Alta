package starter.User;

import Utils.RandomUsername;
import io.restassured.response.Response;
import io.restassured.RestAssured;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;


import java.io.FileWriter;
import java.io.IOException;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class Post {

    private static String url = "https://demoqa.com/Account/v1/";

    RandomUsername random = new RandomUsername();
    String username;

    @Step("I set an endpoint for POST user")
    public String setPostEndpoint(){
        return url + "User";
    }

    @Step("I set an endpoint for post new user")
        public String getUsername(){
        return this.username;
    }

    @Step("I request valid POST detail user")
    public void requestValidPostDetailUser(String username,String password){
        JSONObject requestData = new JSONObject();
        if(username.equals("new")){
            this.username = random.randomUsername();
            try(FileWriter file = new FileWriter("src//test//resources//filejson//username.json")){
                file.write(this.username);
                file.flush();
            } catch (IOException e){
                e.printStackTrace();
            }
        } else if (username.equals("same")){
            this.username = "Jenjenn67";
        }
        requestData.put("userName", this.username);
        requestData.put("password", password);




        SerenityRest.given().header("Content-Type","application/json" ).
                body(requestData.toJSONString());

        SerenityRest.when().post(setPostEndpoint());
    }

    @Step("validate the status code for POST new user  is 201")
    public void validateStatusCodeForPOSTNewUser(int code){
        then().statusCode(equalTo(code));

    }
    @Step("validate the data detail after create user")
    public void validateTheDataDetailAfterCreateUser(String message){
        if(message.equals("success")){
            SerenityRest.then().body("username",equalTo(this.username));
        }else {
            SerenityRest.then().body("username", equalTo(null));
        }
    }

    @Step("get user Id")
    public String getUserId(){
        Response response = SerenityRest.lastResponse();
        String userId = response.body().path("userID");
        try (FileWriter file = new FileWriter("src//test//resources//filejson//userId.json")){
            file.write(userId);
            file.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(userId);
        return userId;
    }

//    @Step("I request POST detail user with exist username")
//    public void requestPOSTWithExistUsername(){
//        JSONObject requestData = new JSONObject();
//        requestData.put("userName", "Jennierubyjane27");
//        requestData.put("password", "Jendeuki123!");
//
//        given().header("Content-Type", "application/json")
//                .body(requestData.toJSONString()).when().post(setPostEndpoint());
//    }
//
//    @Step("I validate the data detail after failed create user")
//    public void validateTheDataDetailAfterFailed(){
//        then().body("code", equalTo("1204"));
//        then().body("message", equalTo("User exists!"));
//
//    }



}
