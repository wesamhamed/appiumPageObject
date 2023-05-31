package andriod.steps;

import andriod.base.BaseTest;
import andriod.screens.CreateTaskScreen;
import andriod.screens.TasksListScreen;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateNewTask extends BaseTest {
	CreateTaskScreen createTaskScreen;
	TasksListScreen tasksListScreen;

	@Given("Click add new task")
	public void clickAddNewTask(){
		createTaskScreen = new CreateTaskScreen(driver);
		tasksListScreen = new TasksListScreen(driver);
	}
	@Given("Enter taskName")
	public void enterTaskName(){
		createTaskScreen.enterTaskName("task name");
	}
	@Given("Enter taskDescription")
	public void enterTaskDescription(){
		createTaskScreen.enterTaskDesc("task description");
	}
	@When("Click save")
	public void clickSave(){
		createTaskScreen.clickSaveBtn();
	}
	@Then("Task added successfully")
	public void taskAddedSuccessfully(){
		driver.hideKeyboard();
	}
}
