package com.basic.TagsSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		//dryRun=true,
		//tags= {"@Important"},//For all test scenarios
		//tags= {"@Smoke"}, //For smoke scenarios
		//tags= {"@Smoke", "@Regression"},//for smoke and regression scenarios
		tags= {"@Smoke,@Regression"}, //OR condition i.e. smoke or regression scenarios
		
		features= {"src/test/resources/com/basic/TagsFF"},
		glue= {"com/basic/TagsSD"},
		
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-reportTags.json"
				//,"com.cucumber.listner.ExtentCucumberFormatter:target/ExtentReport.html"
				
		}
		)

public class RunTagsFeatureFileTest {
	
	
		
	

}
