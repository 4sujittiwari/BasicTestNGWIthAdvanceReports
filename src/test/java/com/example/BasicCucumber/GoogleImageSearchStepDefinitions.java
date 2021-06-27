package com.example.BasicCucumber;



import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

import com.codeborne.selenide.Selenide;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GoogleImageSearchStepDefinitions extends TestRunner{

	private String keyword;

	@When("click \"Images\" link")
	public void chooseImagesAsSearchTarget() {
		$(By.name("Images")).click();
	}

	@When("enter a keyword {string} in input field")
	public void enterKeyword(String keyword) {
		this.keyword = keyword;
		$(By.name("q")).val(keyword).pressEnter();
	}

	@Then("at least top {int} matching images should be shown")
	public void topTenMatchedImagesShouldBeShown(int resultsCount) {
		Selenide.$$(By
				.xpath("//div[@id=\"islrg\"]//div[@jsmodel=\"lbVNPd Whqy4b\"]"))
				.shouldHave(sizeGreaterThanOrEqual(resultsCount));
	}
}