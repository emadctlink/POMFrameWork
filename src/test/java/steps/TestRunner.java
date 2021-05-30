package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//Cucumber Options Annotation provide a link between the feature files and step definition files
@CucumberOptions(features = "src/test/java/features",		//path of features package
glue ="steps", 											//linking by GLUE between features and steps definition
plugin = {"html:reports"},								//To generate a report in html/any  format  
snippets = SnippetType.CAMELCASE)			
							//Snippet = Structure, here snippet will help us to create method signature for all 
								//feature file with implementation in CamelCase


public class TestRunner extends AbstractTestNGCucumberTests{

}

		//To check report: after execute>refresh>report>index html>show in>system explorer>index


