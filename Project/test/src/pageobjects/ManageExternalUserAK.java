package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="ManageExternalUser2"                                
     , summary=""
     , relativeUrl=""
     , connection="Bank_RetailDepartment"
     )             
public class ManageExternalUserAK {

	@TextType()
	@FindBy(css = "#workWithPortalLabel")
	public WebElement ManageExternalUser;
	@LinkType()
	@FindBy(linkText = "Enable Customer User")
	public WebElement enableCustomerUser;
			
}
