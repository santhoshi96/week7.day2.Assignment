package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import hooks.TestNgHooks;



public class ServiceTaskPage extends TestNgHooks {

	public ServiceTaskPage clickNew() {
		switchToFrame(0);
		click(locateElement("id","sysverb_new" ));
		return this;
	}
	
	public ServiceChatPage clickChatQuery() {
		click(locateElement("link", "Chat_queue_entry"));
		return new ServiceChatPage();
		}
	
	public ServiceTaskPage clickTaskSearch() throws InterruptedException {
		selectDropDownUsingText(locateElement("xpath", "//select[@class='form-control default-focus-outline']"), "Number");
		TypeAndEnter(locateElement("xpath", "(//input[@class='form-control'])[1]"),chatqueueentrynumber);
		return this;
	}
	
	public ServiceTaskPage verifyChatQueryCreated() {
		getElementText(locateElement("xpath","//td[@class='vt']" ));
    	verifyExactText(locateElement("xpath", "//td[@class='vt']"),chatqueueentrynumber);
		return this;
	}
	
	public ServiceTaskPage selecChatqueue () throws InterruptedException {
		switchToFrame(0);
		selectDropDownUsingText(locateElement("xpath", "//select[@class='form-control default-focus-outline']"),"Task type" );
		TypeAndEnter(locateElement("xpath", "//input[@class='form-control']"), "Chat Queue");
		return this;
	}
	
	public ServiceChatPage clickChatQueue() {
		click(locateElement("xpath", "//a[@class='linked formlink']"));
		return new ServiceChatPage();
	}
	
	public ServiceTaskPage selectNumber () throws InterruptedException {
		selectDropDownUsingText(locateElement("xpath", "//select[@class='form-control default-focus-outline']"), "Number");
		TypeAndEnter(locateElement("xpath","//input[@class='form-control']" ),chatqueueentrynumber );
		return this;
	}
	
	public ServiceTaskPage verifyChatQueueupdated() {
		getElementText(locateElement("xpath","(//td[@class='vt'])[2]" ));
    	verifyExactText(locateElement("xpath", "(//td[@class='vt'])[2]"),"3 - Moderate" );
    	getElementText(locateElement("xpath","(//td[@class='vt'])[3]" ));
    	verifyExactText(locateElement("xpath", "(//td[@class='vt'])[3]"),"Work In Progress" );
		return this;
	}
	
	public ServiceTaskPage verifyDeleteChatQueue() {
		getElementText(locateElement("xpath","//td[@colspan='11']" ));
    	verifyExactText(locateElement("xpath", "//td[@colspan='11']"),"No records to display" );
		return this;
	}
	
	}
	
	

