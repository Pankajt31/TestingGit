package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , connection="DF13"
     )             
public class MyPageObject {

	@LinkType()
	@FindBy(xpath = "//*[@id=\"Opportunity_Tab\"]/a")
	public WebElement opportunities;
	@LinkType()
	@FindBy(linkText = "Accounts")
	public WebElement accounts;
	@TextType()
	@FindBy(id = "phSearchInput")
	public WebElement search;
	@ButtonType()
	@FindByLabel(label = "Search")
	public WebElement search1;
	@LinkType()
	@FindBy(linkText = "test1")
	public WebElement test1;
	@LinkType()
	@FindBy(linkText = "Cases")
	public WebElement cases;
	@LinkType()
	@FindBy(linkText = "508 Compliance")
	public WebElement _508Compliance;
			
}
