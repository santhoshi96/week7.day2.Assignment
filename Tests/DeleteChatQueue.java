package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.ServiceLoginPage;
import hooks.TestNgHooks;


public class DeleteChatQueue extends TestNgHooks {

	@BeforeTest
	public void setData() {
		testCaseName="DeleteChatQueue";
		testDescription="Delete Chat Queue in Service Application";
		nodes = "My Work";		
		dataSheetName="TC004";
		category="Smoke";
		authors="Meena";
	}
	
	@Test(dataProvider="fetchData")
	public void creatingChatQueue(String UserName,String password,String filter) throws InterruptedException{
	new ServiceLoginPage()
	.typeUserName(UserName)
	.typePassword(password)
	.clickLoginButton()
	.clickFilter()
	.typeFilter(filter)
	.clickMyWork()
	.selecChatqueue ()
	.clickChatQueue()
	.getChatIN()
	.clickDelete()
	.alertDelete()
	.selectNumber()
	.verifyDeleteChatQueue();
}
}
