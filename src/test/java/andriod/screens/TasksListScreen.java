package andriod.screens;

import andriod.base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TasksListScreen extends ScreenBase {
	@FindBy(id = "fab")
	private WebElement addTaskBtn;
	public TasksListScreen(AppiumDriver driver){
		super(driver);
	}
	public void clickAddTaskBtn(){
		click(addTaskBtn);
	}
}
