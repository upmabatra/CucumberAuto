package com.basic.BackgroundSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		//dryRun=true,
		
		features= {"src/test/resources/com/basic/BackgroundFF"},
		glue= {"com/basic/BackgroundSD"},
		
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-reportBackgroundFF.json",
		}
		)

public class RunBackgroundFeatureFileTest {
	
	
		
	

}
