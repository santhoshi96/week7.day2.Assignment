package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import hooks.TestNgHooks;

public class ServiceLoginPage extends TestNgHooks {
	
	public ServiceLoginPage typeUserName(String UserName) {
		switchToFrame(0);
		clearAndType(locateElement("id","user_name" ),UserName );
		return this;
	}
	
	public ServiceLoginPage typePassword(String password) {
		clearAndType(locateElement("id", "user_password"), password);
		return this;
	}
	
	public ServiceHomePage clickLoginButton() {
		click(locateElement("id","sysverb_login" ));
		return new ServiceHomePage();
	}
	
	public ServiceLoginPage clickLoginForFailure() {
		click(locateElement("id", "sysverb_login"));
		return this;
	}
	
}


