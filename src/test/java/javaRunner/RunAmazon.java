package javaRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
			features="src/test/java/features",
			tags="@amazon",
			plugin={"pretty", "html:report/cucumber-reports.html"},
			glue="stepDefinitions",
			monochrome=true
)
public class RunAmazon extends AbstractTestNGCucumberTests{

}
