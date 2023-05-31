package ios.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import ios.base.ScreenBase;
import org.openqa.selenium.WebElement;

public class CreateTaskScreen extends ScreenBase {
	@iOSXCUITFindBy(iOSNsPredicate = "value=='Title'")
	private WebElement taskNameTxt;
	@iOSXCUITFindBy(iOSNsPredicate = "value=='Description'")
	private  WebElement taskDescTxt;
	@iOSXCUITFindBy(accessibility = "Save")
	private WebElement saveBtn;
	public CreateTaskScreen(AppiumDriver driver){
		super(driver);
	}
	public void enterTaskName(String taskName){
		clear(taskNameTxt);
		type(taskNameTxt,taskName);
	}
	public void enterTaskDesc(String descText){
		clear(taskDescTxt);
		type(taskDescTxt,descText);
	}
	public void clickSaveBtn(){
		click(saveBtn);
	}
}
