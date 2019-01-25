package com.basic.DataSetSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		//dryRun=true,
		
		features= {"src/test/resources/com/basic/DataSetFF"},
		glue= {"com/basic/DataSetSD"},
		
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-reportDataSet.json",
		}
		)

public class RunDataSetFFTest {
	
	
		
	

}
