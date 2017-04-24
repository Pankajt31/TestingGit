package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Angular_Inside_VF"                                
               , summary=""
               , page="Angular_Inside_VF"
               , namespacePrefix=""
               , object="Contact"
               , connection="Bank_RetailDepartment"
     )             
public class Angular_Inside_VF_CJ_Console {

	@TextType()
	@AngularBy(controller = "formController", tagName = "INPUT", model = "contact.FirstName")
	public WebElement firstName;
	@TextType()
	@AngularBy(controller = "formController", tagName = "INPUT", model = "contact.LastName")
	public WebElement lastName;
	@TextType()
	@AngularBy(controller = "formController", tagName = "INPUT", model = "contact.MobilePhone")
	public WebElement mobilePhone;
	@TextType()
	@AngularBy(controller = "formController", tagName = "INPUT", model = "contact.Email")
	public WebElement email;
	
}
