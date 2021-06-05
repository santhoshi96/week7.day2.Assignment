package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.ServiceLoginPage;
import hooks.TestNgHooks;

public class IncidentUpdatePage extends TestNgHooks {

	@BeforeTest
	public void setData() {
		testCaseName="IncidentUpdate";
		testDescription="Update the existing Incident in Service Application";
		nodes = "Incident";		
		dataSheetName="TC001";
		category="Smoke";
		authors="Meena";
	}

	@Test(dataProvider="fetchData")
	public void updateIncident(String UserName, String password, String filter,String searchvalue) throws InterruptedException {
		new ServiceLoginPage()
		.typeUserName(UserName)
		.typePassword(password)
		.clickLoginButton()		
		.clickFilter()
		.typeFilter(filter)
		.clickOpen()
		.clickSearch(searchvalue)
		.clickIncident()
		.updateUrgency()
		.updateImpact()
		.getUpdatedIncident()
		.clickupdate()
		.clickOnSearch()
		.verifyUpdatedIncident();
		
	}
}
