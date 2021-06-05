package Pages;


import hooks.TestNgHooks;

public class ServiceCreateCaller extends TestNgHooks {

	public ServiceCreateCaller typefirstname(String firstName) throws InterruptedException {
		TypeAndEnter(locateElement("id", "sys_user.first_name"), firstName);
	return this;
	}
	
	public ServiceCreateCaller getfirstname() {
		sysuserfirstname=getElementText(locateElement("id", "sys_user.first_name"));
		System.out.println("Entered firstname is:"+sysuserfirstname);
	return this;
	}
	
	public ServiceCreateCaller typelastname(String lastName) throws InterruptedException {
		TypeAndEnter(locateElement("id", "sys_user.last_name"), lastName);
	return this;
	}
	
	public ServiceCreateCaller typeEmailAs(String emailId) throws InterruptedException {
		TypeAndEnter(locateElement("id", "sys_user.email"), emailId);
	return this;
	}
	
	public ServiceUsersPage clickTheSubmit() {
		click(locateElement("id", "sysverb_insert"));
	return new ServiceUsersPage();
	
	}
	
}


