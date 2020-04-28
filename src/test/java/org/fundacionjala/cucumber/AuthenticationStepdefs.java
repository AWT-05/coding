package org.fundacionjala.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.testng.Assert.assertEquals;

public class AuthenticationStepdefs {
    private String name;
    private String pass;
    @Given("that User wants to login in order to manage his products")
    public void thatUserWantsToLoginInOrderToManageHisProducts() {
    }

    @When("I fill my user name {string}")
    public void iFillMyUserName(String name) {
        this.name= name;
    }

    @And("I fill my password {string}")
    public void iFillMyPassword(String pass) {
        this.pass= pass;
    }

    @Then("I should receive the {string} message")
    public void iShouldReceiveTheMessage(String expectedMessage) {
        assertEquals(expectedMessage,accessMessage(name,pass));
    }

    private String accessMessage(String name, String pass){
        if ("carlos".equals(name) && "test".equals(pass)){
            return "access granted";
        }else {
            return "access denied";
        }
    }
}
