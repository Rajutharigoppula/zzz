package zzz;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = 
{"src/test/resources/Features/Test2.feature"},glue="Glucode",monochrome = true)
	 //plugin={"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"})

public class Runnerclass
	{

	}
