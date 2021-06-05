package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.ServiceLoginPage;
import hooks.TestNgHooks;


public class CreateChatQueue extends TestNgHooks {

	@BeforeTest
	public void setData() {
		testCaseName="createChatQueue";
		testDescription="Create Chat Queue in Service Application";
		nodes = "My Work";		
		dataSheetName="TC003";
		category="Smoke";
		authors="Meena";
	}
	
	@Test(dataProvider="fetchData")
	public void creatingChatQueue(String UserName,String password,String filter,String sD,String deS) throws InterruptedException
	{
		new ServiceLoginPage()
		.typeUserName(UserName)
		.typePassword(password)
		.clickLoginButton()
		.clickFilter()
		.typeFilter(filter)
		.clickMyWork()
		.clickNew()
		.clickChatQuery()
		.getChatIN()
		.typeShortDescription(sD)
		.typeDescription(deS)
		.clickSubmit()
		.clickTaskSearch()
		.verifyChatQueryCreated();

}
}
