package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.ServiceLoginPage;
import hooks.TestNgHooks;



public class CreateArticle extends TestNgHooks {
	@BeforeTest
	public void setData() {
		testCaseName="createArtice";
		testDescription="Create Article in Service Application";
		nodes = "Knowledge";		
		dataSheetName="TC002";
		category="Smoke";
		authors="Meena";
	}
	
	@Test(dataProvider="fetchData")
	public void creatingArticle(String UserName, String password,String filter,String shortDes) throws InterruptedException{
		new ServiceLoginPage()
		.typeUserName(UserName)
		.typePassword(password)
		.clickLoginButton()
		.clickFilter()
		.clickK()
		.typeFilter(filter)
		.clickCreateNew()
		.clickKnowledge()
		.selectKnowledge()
		.textshortDescription(shortDes)
		.getKN()
		.clickKSubmit();
	}
}
