package ios.screens;

import andriod.base.ScreenBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class TaskListScreen extends ScreenBase {
	@iOSXCUITFindBy(accessibility = "plus.circle")
	private WebElement addTaskBtn;
	public TaskListScreen(AndroidDriver driver){
		super(driver);
	}
	public void clickAddTaskBtn(){
		click(addTaskBtn);
	}
}
