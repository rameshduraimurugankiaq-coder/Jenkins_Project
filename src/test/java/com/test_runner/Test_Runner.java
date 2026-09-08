package com.test_runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.base_class.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src\\test\\java\\AT.feature", glue = "com.step_definition", dryRun = false, plugin = {
				"pretty", "html:target/CucumberReport.html", "json:target/cucumber.json",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" }, monochrome = true)
public class Test_Runner extends Base_Class {

	@BeforeClass
	public static void startUP() {
		launch_Browser("https://the-internet.herokuapp.com/?utm_source");
	}

	@AfterClass
	public static void end() {

	}
}