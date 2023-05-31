package andriod.testcases;

import andriod.screens.CreateTaskScreen;
import andriod.screens.TasksListScreen;
import andriod.base.BaseTest;
import andriod.utils.JsonReader;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;


public class ToDoTest extends BaseTest {
	CreateTaskScreen createTaskScreen;
	TasksListScreen tasksListScreen;

	@DataProvider(name = "tasks data")
	public Object[][] tasksData() throws IOException, ParseException {
		String JSON_path = System.getProperty("user.dir")+"/src/test/resources/data/TasksData.json";
		return JsonReader.getJSONData(JSON_path,"tasks",2);
	}

	@Test(dataProvider = "tasks data")
	public void test_addTaskWitData(String taskName,String taskDescription) {
		tasksListScreen = new TasksListScreen(driver);
		createTaskScreen = new CreateTaskScreen(driver);
		tasksListScreen.clickAddTaskBtn();
		createTaskScreen.enterTaskName(taskName);
		createTaskScreen.enterTaskDesc(taskDescription);
		driver.hideKeyboard();
		createTaskScreen.clickSaveBtn();
	}
	@Test
	public void test_addTask() {
		tasksListScreen = new TasksListScreen(driver);
		createTaskScreen = new CreateTaskScreen(driver);
		tasksListScreen.clickAddTaskBtn();
		createTaskScreen.enterTaskName("Finish Appium Course");
		createTaskScreen.enterTaskDesc("Finishing my course ASAP");
		driver.hideKeyboard();
		createTaskScreen.clickSaveBtn();
	}
}
