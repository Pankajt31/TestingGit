package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title=""                                
               , summary=""
               , page="Angular_Inside_VF"
               , namespacePrefix=""
               , object="Contact"
               , connection="Bank_RetailDepartment"
     )             
public class Angular_Inside_VF {

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
	@TextType()
	@AngularBy(controller = "formController", tagName = "TEXTAREA", model = "contact.Description")
	public WebElement mobileDescription;
	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;
	
}
