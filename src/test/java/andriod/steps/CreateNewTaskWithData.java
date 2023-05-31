package andriod.steps;

import andriod.base.BaseTest;
import andriod.screens.CreateTaskScreen;
import andriod.screens.TasksListScreen;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateNewTaskWithData extends BaseTest {
	CreateTaskScreen createTaskScreen;
	TasksListScreen tasksListScreen;

	@Given("Click add new task")
	public void clickAddNewTask(){
		createTaskScreen = new CreateTaskScreen(driver);
		tasksListScreen = new TasksListScreen(driver);
	}
	@Given("Enter {string} and {string}")
	public void enterAnd(){
		createTaskScreen.enterTaskName("task name");
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
