package runner;

import org.testng.annotations.BeforeTest;

import com.testng.api.base.ProjectSpecificMethod;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src/main/java/feature"},
glue= {"com.pages"}, monochrome=true //snippets=SnippetType.CAMELCASE,
//OR,
 //plugin= {"pretty","html:reports"}
)
public class RunLogin extends ProjectSpecificMethod{
	@BeforeTest
	public void setValues() {
		testCaseName = "ACME UI path till enterCountryname";
		testDescription = "ACME ";
		nodes = "ACME ";
		authors = "Divya";
		category = "Functionality";
		
	}
}
