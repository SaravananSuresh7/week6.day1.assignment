package runner;

import io.cucumber.testng.CucumberOptions;
import week5.day1.practice.BaseClass;

@CucumberOptions(
		features = "src/test/java/Features",
		glue = "steps",
		monochrome = true,
		publish = true
		)
public class CucumberRunner extends BaseClass{

}
