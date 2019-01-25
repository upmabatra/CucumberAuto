package com.basic.MultipleFeatureFile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		//dryRun=true,
		
		features= {"src/test/resources/com/basic/MultipleFeatureFile"},
		glue= {"com/basic/MultipleFeatureFile"},
		
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-reportMultipleFF.json",
		}
		)

public class RunMultipleFeatureFileTest {
	
	
		
	

}
