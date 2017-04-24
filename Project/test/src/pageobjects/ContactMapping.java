package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title=""                                
     , summary=""
     , relativeUrl=""
     , connection="Bank_RetailDepartment"
     )             
public class ContactMapping {

	@TextType()
	@FindBy(id = "hotlist_mode")
	public WebElement New;
	@LinkType()
	@FindBy(linkText = "Lname")
	public WebElement lname;
	@LinkType()
	@FindBy(linkText = "Copy Mailing Address to Other Address")
	public WebElement copyMailingAddressToOtherAddress;
	@TextType()
	@FindBy(id = "name_lastcon2")
	public WebElement LastName;
	@TextType()
	@FindByLabel(label = "Title")
	public WebElement Title;
			
}
