package com.runnerClass;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Adactin.Base;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\com\\featurefile\\AdactinFeature.feature", glue = "com.stepDef", monochrome= true,
plugin = {"html:Reportt/Cucumber_Html_Report","pretty","json:Report/Cucumber_Json_Report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/Cucumber_Extent_Report.html"})

public class testRunner {

	public static WebDriver driver;

	@BeforeClass
	public static void set_up() {

		driver = Base.browserLaunch("chrome");

	}

	@AfterClass
	public static void tear_Down() {

		System.out.println("success");

	}

}

//