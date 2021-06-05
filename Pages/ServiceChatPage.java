package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import hooks.TestNgHooks;


public class ServiceChatPage extends TestNgHooks{
	
	public ServiceChatPage getChatIN() {
	chatqueueentrynumber = getTypedText(locateElement("id", "chat_queue_entry.number"));
	System.out.println("ChatQueueNumber is"+chatqueueentrynumber);
	return this;
	}

	public ServiceChatPage typeShortDescription(String sD) throws InterruptedException {
		TypeAndEnter(locateElement("id", "chat_queue_entry.short_description"), sD);
		return this;
	}
	
	public ServiceChatPage typeDescription(String deS) throws InterruptedException {
		TypeAndEnter(locateElement("id", "chat_queue_entry.description"), deS);
		return this;
	}
	
	public ServiceTaskPage clickSubmit() {
		click(locateElement("id","sysverb_insert"));
		return new ServiceTaskPage();
	}
	
	public ServiceChatPage updateState() {
		selectDropDownUsingText(locateElement("id","chat_queue_entry.state" ),"Work In Progress" );
		return this;
		}
	
	public ServiceChatPage updatePriority() {
		selectDropDownUsingText(locateElement("id", "chat_queue_entry.priority"),"3 - Moderate" );
		return this;
	}
	
	public ServiceTaskPage clickOnUpdate() {
		click(locateElement("id", "sysverb_update"));
		return new ServiceTaskPage();
	}
	
	public ServiceChatPage clickDelete() {
		click(locateElement("id", "sysverb_delete"));
		return this;
	}
	public ServiceTaskPage alertDelete() {
		click(locateElement("id","ok_button"));
		return new ServiceTaskPage();
	}
	
}
