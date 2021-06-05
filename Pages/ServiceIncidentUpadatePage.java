package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import hooks.TestNgHooks;



public class ServiceIncidentUpadatePage extends TestNgHooks {
	
    public ServiceIncidentUpadatePage getUpdatedIncident() {
    	IncidentNumber=getTypedText(locateElement("name", "incident.number"));
    	System.out.println("updated Incident Number is:"+IncidentNumber);
	return this;
    }
    
    public ServiceIncidentUpadatePage updateUrgency() {
    	selectDropDownUsingText(locateElement("id", "incident.urgency"), "1 - High");
		System.out.println("selected and updated urgency value is High");
		return this;
    }
    public ServiceIncidentUpadatePage updateImpact() {
    	selectDropDownUsingIndex(locateElement("id", "incident.state"), 1);
		System.out.println("selected and updated State value is In Progress");
		return this;
    }
    
    public ServiceOpenPage clickupdate() {
    	click(locateElement("id", "sysverb_update_bottom"));
    	return new ServiceOpenPage();
    }
    
}
