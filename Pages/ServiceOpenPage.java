package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import hooks.TestNgHooks;

public class ServiceOpenPage extends TestNgHooks{

	public ServiceOpenPage clickSearch(String searchvalue) throws InterruptedException {
		switchToFrame(0);
		selectDropDownUsingText(locateElement("xpath", "//select[@class='form-control default-focus-outline']"), "Short description");
		TypeAndEnter(locateElement("xpath", "//input[@placeholder='Search']"),searchvalue);
		return this;
	}
		public ServiceIncidentUpadatePage clickIncident() {
			click(locateElement("xpath","//a[@class='linked formlink']"));
		return new ServiceIncidentUpadatePage();
	}
		
		public ServiceOpenPage clickOnSearch() throws InterruptedException {
			selectDropDownUsingText(locateElement("xpath", "//select[@class='form-control default-focus-outline']"), "Number");
			TypeAndEnter(locateElement("xpath", "(//input[@class='form-control'])[1]"),IncidentNumber);
			return this;
		}
	    
	    public ServiceOpenPage verifyUpdatedIncident() {
	    	getElementText(locateElement("xpath","//td[text()='In Progress']" ));
	    	verifyExactText(locateElement("xpath", "//td[text()='In Progress']"),"In Progress" );
			return this;
	    }
}
