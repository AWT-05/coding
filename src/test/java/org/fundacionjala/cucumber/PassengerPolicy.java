package org.fundacionjala.cucumber;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PassengerPolicy {
    @Given("there is an economy flight")
    public void thereIsAnEconomyFlight() {
        System.out.println("step 1");
    }

    @When("we have an usual passenger")
    public void weHaveAnUsualPassenger() {
        System.out.println("step 2");
    }

    @Then("you can add and remove him from an economy flight")
    public void youCanAddAndRemoveHimFromAnEconomyFlight() {
        throw new PendingException();
    }
}
