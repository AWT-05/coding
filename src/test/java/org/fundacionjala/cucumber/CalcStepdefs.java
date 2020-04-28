package org.fundacionjala.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertEquals;

public class CalcStepdefs {

    private int num1;
    private int num2;

    @Given("I want to sum two numbers")
    public void iWantToSumTwoNumbers() {

    }

    @When("the first number is <{int}>")
    public void theFirstNumberIs(int num1) {
        this.num1 = num1;
    }

    @And("the second is <{int}>")
    public void theSecondIs(int num2) {
        this.num2 = num2;
    }

    @Then("the result is <{int}>")
    public void theResultIs(int expected) {
        assertEquals(expected, sum(num1, num2));
    }

    private int sum(int num1, int num2) {
        return num1 + num2;
    }


}
