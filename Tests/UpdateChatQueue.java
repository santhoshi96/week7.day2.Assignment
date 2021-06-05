package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.ServiceLoginPage;
import hooks.TestNgHooks;


public class UpdateChatQueue extends TestNgHooks {
	@BeforeTest
	public void setData() {
	testCaseName="UpdateChatQueue";
	testDescription="update Chat Queue in Service Application";
	nodes = "My Work";		
	dataSheetName="TC005";
	category="Smoke";
	authors="Meena";
	}
	
	@Test(dataProvider="fetchData")
	public void updatingqueue(String UserName,String password,String filter) throws InterruptedException{
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
		.updateState()
		.updatePriority()
		.clickOnUpdate()
		.selectNumber()
		.verifyChatQueueupdated();
	}
}

