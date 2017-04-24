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
public class NewNotePage {

	@TextType()
	@FindBy(id = "Title")
	public WebElement Title;
	@TextType()
	@FindBy(id = "Body")
	public WebElement Body;
	@ButtonType()
	@FindByLabel(label = " Save ")
	public WebElement Save;
	@ButtonType()
	@FindByLabel(label = "Cancel")
	public WebElement Cancel;
			
}
