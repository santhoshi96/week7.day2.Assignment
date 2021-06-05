package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import hooks.TestNgHooks;

public class ServiceHomePage extends TestNgHooks {

	public ServiceHomePage clickFilter() {
		click(locateElement("id", "filter"));
    return this;
	}
	public ServiceHomePage typeFilter(String filter) throws InterruptedException {
		TypeAndEnter(locateElement("id","filter" ), filter);
	    return this;
		}
	
	public ServiceOpenPage clickOpen() {
		click(locateElement("xpath", "//div[text()='Open']"));
	    return new ServiceOpenPage();
		}
	public ServiceTaskPage clickMyWork() {
		click(locateElement("xpath", "//div[text()='My Work']"));
		return new ServiceTaskPage();
	}
	
	public ServiceHomePage clickK() {
		click(locateElement("xpath", "//div[text()='Knowledge']"));
		return this;
	}
	public ServiceCreateArticle clickCreateNew() {
		switchToFrame(0);
		click(locateElement("xpath", "//span[contains(@class,'btn-icon icon-article-document')]"));
		return new ServiceCreateArticle();
	}
	
	public ServiceUsersPage clickCaller() {
		click(locateElement("xpath", "//div[text()='Callers']"));
		return new ServiceUsersPage();
	}
}
