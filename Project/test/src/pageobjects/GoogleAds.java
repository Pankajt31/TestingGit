package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( connection="Bank_RetailDepartment"
     )             
public class GoogleAds {

	@ButtonType()
	@FindByLabel(label = " New ")
	public WebElement new_;
	@TextType()
	@FindByLabel(label = "*Last Name")
	public WebElement LastName;
	@TextType()
	@FindByLabel(label = "*Company")
	public WebElement Company;
	@ButtonType()
	@FindByLabel(label = " Save ")
	public WebElement save;
			
}
