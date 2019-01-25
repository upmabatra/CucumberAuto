package com.basic.sharedDataSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		//dryRun=true,
		
		features= {"src/test/resources/com/basic/sharedDataFF"},
		glue= {"com/basic/sharedDataSD"},
		
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-reportSharedDataSD.json",
		}
		)

public class RunsharedDataFeatureFileTest {
	
	
		
	

}
