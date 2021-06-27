package com.example.BasicCucumber;

import org.testng.annotations.DataProvider;

import com.codeborne.selenide.Configuration;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "pretty", "json:target/cucumber-reports/cucumber.json",
		"me.jvt.cucumber.report.PrettyReports:target/cucumber" })
public class TestRunner extends AbstractTestNGCucumberTests {

	@BeforeSuite
	@Parameters({ "browser"})
	public void setUpBrowser(String browser) {
		Configuration.browser = browser;
		Configuration.headless = Boolean.valueOf(System.getProperty("headless"));
		Configuration.clickViaJs = true;
	}
	
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}
