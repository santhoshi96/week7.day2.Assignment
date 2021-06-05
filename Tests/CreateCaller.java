package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.ServiceLoginPage;
import hooks.TestNgHooks;

public class CreateCaller extends TestNgHooks {

	@BeforeTest
	public void setData() {
		testCaseName="createCaller";
		testDescription="Create caller in Service Application";
		nodes = "Caller";		
		dataSheetName="TC006";
		category="Smoke";
		authors="Meena";
	}
	
	@Test(dataProvider="fetchData")
	public void creatingArticle(String UserName, String password,String filter,String firstName,String lastName,String emailId) throws InterruptedException{
		new ServiceLoginPage()
		.typeUserName(UserName)
		.typePassword(password)
		.clickLoginButton()
		.clickFilter()
		.clickK()
		.typeFilter(filter)
		.clickCaller()
		.clickNewToCaller()
		.typefirstname(firstName)
		.getfirstname()
		.typelastname(lastName)
		.typeEmailAs(emailId)
		.clickTheSubmit()
		.verifyCallerCreated();
	}
}


