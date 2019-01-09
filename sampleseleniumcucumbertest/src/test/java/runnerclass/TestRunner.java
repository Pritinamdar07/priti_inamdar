package runnerclass;
/**
 * Author :Priti A Inamdar                                         Date:08/01/2019
 * This class will use the Junit annotation @RunWith(), which tells Junit what is the test runner class
 * It is a staring point for Junit to start executing the feature file.
 */

/**
 * Following import statement imports @RunWith annotation from the Junit class.
 * Also tells Junit that tests should run using Cucumber class
 */
import org.junit.runner.RunWith;
/**
 * This import statement  imports @cucumberOptions annotation which tells Cucumber
 * where to look for feature files,what reporting system to use.
*/
import cucumber.api.CucumberOptions;
// This import statement 
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features=  "src/test/resources/"  , //Feature File path
		   glue = { "stepdefination"}, //Code implementation
		   plugin= {"html:output"}    //Target Output directory
		)

public class TestRunner {
	
		 
	 }


