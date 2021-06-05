package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import hooks.TestNgHooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ServiceUsersPage extends TestNgHooks {

	
	public ServiceCreateCaller clickNewToCaller() {
		switchToFrame(0);
		click(locateElement("id", "sysverb_new"));
		return new ServiceCreateCaller();
	}
	
	public ServiceUsersPage verifyCallerCreated() throws InterruptedException {
		selectDropDownUsingText(locateElement("xpath","//select[@class='form-control default-focus-outline']"),"First name");
		TypeAndEnter(locateElement("xpath", "//input[@class='form-control']"),sysuserfirstname );
		getElementText(locateElement("xpath","(//td[@class='vt'])[2]" ));
    	verifyExactText(locateElement("xpath", "(//td[@class='vt'])[2]"),sysuserfirstname);
		return this;
	}
}
