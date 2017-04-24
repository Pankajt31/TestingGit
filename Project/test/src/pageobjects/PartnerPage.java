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
public class PartnerPage {

	@LinkType()
	@FindBy(id = "p70_lkwgt")
	public WebElement PartnerLookUp;
	@TextType()
	@FindBy(id = "p80")
	public WebElement Role;
	@ButtonType()
	@FindByLabel(label = " Save ")
	public WebElement Save;
	@BooleanType()
	@FindBy(id = "primary0")
	public WebElement Primary;
			
}
