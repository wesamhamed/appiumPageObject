package andriod.runner;

import io.cucumber.testng.CucumberOptions;
import ios.base.TestBase;

@CucumberOptions(features = "src/test/java/android/features"
,glue = {"steps"},plugin = {"pretty","html:target/cucumber-html-report.html"})
public class TestRunner extends TestBase {

}
