package andriod.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest extends AbstractTestNGCucumberTests {
	 protected AppiumDriver driver;
	 protected Actions actions;

	@BeforeMethod
	public  void setUp() throws MalformedURLException {
		String applicationPath = System.getProperty("user.dir")+"/src/test/resources/apps/ToDo.apk";
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "android");
		caps.setCapability("automationName","UiAutomator2");
		caps.setCapability("platformVersion","12");
		caps.setCapability("deviceName","Galaxy A31");
		caps.setCapability("app",applicationPath);
		caps.setCapability("noReset", true);
		driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),caps);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		actions = new Actions(driver);
	}
	@AfterMethod
	public void tearDown(){
		if(driver!=null){
			driver.quit();
		}
	}

}
