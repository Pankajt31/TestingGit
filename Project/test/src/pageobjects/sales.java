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
public class sales {

	@ButtonType()
	@FindByLabel(label = " New ")
	public WebElement new_;
	@TextType()
	@FindByLabel(label = "*Last Name")
	public WebElement LastName;
			
}
