package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/testcases/LoginTest.feature",
        		"src/test/resources/testcases/LoginTest.feature"
        },
        glue = {"stepdefinition"},
//        tags = @${keyname},
        monochrome=true
        )

public class TestRunner extends AbstractTestNGCucumberTests{
	
	
}
