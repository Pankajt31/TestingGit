package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="Lead"                                
     , summary=""
     , relativeUrl=""
     , connection="Bank_RetailDepartment"
     )             
public class Lead {

	@LinkType()
	@FindBy(linkText = "Google Search")
	public WebElement googleSearch;
	@LinkType()
	@FindBy(linkText = "Edit")
	public WebElement edit;
	@LinkType()
	@FindBy(linkText = "A01test1")
	public WebElement a01Test1;
	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;
			
}
