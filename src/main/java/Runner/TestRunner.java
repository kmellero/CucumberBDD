package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\kajetanmellerowicz\\eclipse-workspace\\CucumberBDD\\src\\main\\java\\Features\\login.feature"
		//features="src\\main\\java\\Features\\login.feature"
		,glue= {"stepDefinition"}  //package/folder for steps
		,plugin= {"pretty","html:test-output", "junit:junit_xml\\cucumber.xml"}   //reporting formats e.g.: , "json:json_output\\cucumber.json"
		,monochrome= true  //display the console output: readable format				
		,strict=false  //if true: undefined steps fail entire execution
		,dryRun= false   // change to true to verify if all step = method mappings exists
		//,tags= {"@End2End , @SmokeTest\""}  //"tag1,tag2"="or","tag1" , "tag2"="and", ~tag=all but,  ; selected tag scenarios in feature file
		)

public class TestRunner {
  //this class stays empty
}
