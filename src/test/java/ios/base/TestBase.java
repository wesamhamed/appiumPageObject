package ios.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestBase {
	protected AppiumDriver driver;
	Actions actions;
	@AfterMethod
	public void setup(String port,String deviceName,String platformVersion,String udid,String wdaLocalPort) throws MalformedURLException {
		String applicationPath = System.getProperty("user.dir")+"/src/test/resources/apps/DailyCheck.zip";
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "ios");
		caps.setCapability("platformVersion",platformVersion);
		caps.setCapability("deviceName",deviceName);
		caps.setCapability("app",applicationPath);
		caps.setCapability("noReset", true);
		caps.setCapability("wdaLocalPort",wdaLocalPort);
		caps.setCapability("udid",udid);
		driver = new AndroidDriver(new URL("http://localhost:"+port+"/wd/hub"),caps);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void tearDown(){
		if(driver!=null){
			driver.quit();
		}
	}
}
