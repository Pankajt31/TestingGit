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
public class CloseCasePage {

	@TextType()
	@FindBy(xpath = "//*[@id=\"cas7\"]")
	public WebElement Status;
	@TextType()
	@FindBy(xpath = "//*[@id=\"cas6\"]")
	public WebElement CaseReason;
	@ButtonType()
	@FindByLabel(label = " Save ")
	public WebElement Save;
			
}
