package andriod.screens;

import andriod.base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateTaskScreen extends ScreenBase {
	@FindBy(id = "editTextTitre")
	private WebElement taskNameTxt;
	@FindBy(id ="editTextNote" )
	private  WebElement taskDescTxt;
	@FindBy(id = "action_save")
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
