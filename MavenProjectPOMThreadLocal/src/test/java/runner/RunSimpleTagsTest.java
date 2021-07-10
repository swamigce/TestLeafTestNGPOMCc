package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features="src/test/java/features/SimpleTags.feature", 
					glue="steps", 
					monochrome = true, 
					publish=true,
					tags="@Regression")
public class RunSimpleTagsTest extends AbstractTestNGCucumberTests{

}
