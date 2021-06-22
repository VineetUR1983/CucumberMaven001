package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

//Features
@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/features"},
		glue = {"stepDefinations"},
		plugin = {"pretty"},
		publish = true
		)
// Glue should point to the package name where Step Definitions are located.
// Requirement ** - package for feature files and Step Definitions should have the same parent folder,
// here it is "src/test/java"

public class TestRunner {
	
	

}
