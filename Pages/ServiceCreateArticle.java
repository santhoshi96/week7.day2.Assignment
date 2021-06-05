package Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import hooks.TestNgHooks;

public class ServiceCreateArticle extends TestNgHooks {

	public ServiceCreateArticle getKN() {
		KnowledgeNumber = getTypedText(locateElement("id", "sys_readonly.kb_knowledge.number"));
		System.out.println("Knowledge Number is:"+KnowledgeNumber);
		return this;
	}
	
	public ServiceCreateArticle clickKnowledge() throws InterruptedException {
		
		clickWithNoSnap(locateElement("xpath", "//button[@id='lookup.kb_knowledge.kb_knowledge_base']//span[1]"));
		switchToWindow(1);
		return this;
	}
	
	public ServiceCreateArticle selectKnowledge() {
        click(locateElement("link", "Knowledge"));
        switchToWindow(0);
		return this;
	}
	
	public ServiceCreateArticle textshortDescription(String shortDes) throws InterruptedException {
		switchToFrame(0);
		click(locateElement("name", "kb_knowledge.short_description"));
		clearAndType(locateElement("id", "kb_knowledge.short_description"), shortDes);
		System.out.println("Updated Short Description");
		System.out.println(" ");
		return this;
	}
	
	public ServiceHomePage clickKSubmit() {
		click(locateElement("id","sysverb_insert"));
		return new ServiceHomePage();
		
	}
	
}
