package com.basic.MultiSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		//dryRun=true,
		
		features= {"src/test/resources/com/basic/MultiFF"},
		glue= {"com/basic/MultiSD"},
		
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-reportMultiSD.json",
		}
		)

public class RunMultiFeatureFileTest {
	
	
		
	

}
