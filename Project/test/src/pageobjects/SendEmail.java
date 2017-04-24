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
public class SendEmail {

	@TextType()
	@FindByLabel(label = "To")
	public WebElement to;
	@TextType()
	@FindBy(id = "p5")
	public WebElement BCC;
	@TextType()
	@FindBy(id = "p4")
	public WebElement CC;
	@TextType()
	public WebElement subject;
	@TextType()
	@FindByLabel(label = "Subject")
	public WebElement subject1;
	@ButtonType()
	@FindByLabel(label = " Send ")
	public WebElement send;
	@LinkType()
	@FindBy(id = "p2_lkwgt")
	public WebElement Email_to_lookup;
	@TextType()
	@FindByLabel(label = "Body")
	public WebElement body;
			
}
