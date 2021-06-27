package com.example.BasicCucumber;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

import org.openqa.selenium.By;

import com.codeborne.selenide.Selenide;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GoogleTextSearchStepDefinitions extends TestRunner{
	
	 @Given("an open browser with google.com")
	  public void openGoogleSearch() {
	    Selenide.open("https://google.com/ncr");
	  }

	  @When("a keyword {string} is entered in input field")
	  public void enterKeyword(String keyword) {
	    $(By.name("q")).val(keyword).pressEnter();
	  }

	  @Then("at least top {int} matches should be shown")
	  public void topTenMatchesShouldBeShown(int resultsCount) {
	    $$("#res .g").shouldHave(sizeGreaterThanOrEqual(resultsCount));
	  }

	  @Then("the first one should contain {string}")
	  public void theFirstOneShouldContainKeyword(String expectedText) {
	    $("#res .g").shouldHave(text(expectedText));
	  }

}
