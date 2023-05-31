package andriod.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ScreenBase {
	 protected AppiumDriver driver;
	public static final long WAIT = 10;

	public ScreenBase(AppiumDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void waitForVisibility(WebElement element){
		WebDriverWait wait = new WebDriverWait(driver, WAIT);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void clear(WebElement element){
		waitForVisibility(element);
		element.clear();
	}
	public void click(WebElement element){
		waitForVisibility(element);
		element.click();
	}
	public void type(WebElement element, String text){
		waitForVisibility(element);
		element.sendKeys(text);
	}
	public String getAttribute(WebElement element,String attribute){
		waitForVisibility(element);
		return element.getAttribute(attribute);
	}
}
