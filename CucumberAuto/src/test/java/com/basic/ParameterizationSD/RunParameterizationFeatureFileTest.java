package com.basic.ParameterizationSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		//dryRun=true,
		
		features= {"src/test/resources/com/basic/ParameterizationFF"},
		glue= {"com/basic/ParameterizationSD"},
		
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-reportParameterisation.json",
		}
		)

public class RunParameterizationFeatureFileTest {
	
	
		
	

}
