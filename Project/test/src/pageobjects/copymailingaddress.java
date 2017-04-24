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
public class copymailingaddress {

	@LinkType()
	@FindBy(linkText = "Copy Mailing Address to Other Address")
	public WebElement copyMailingAddressToOtherAddress;
	@TextType()
	@FindBy(xpath = "//*[@id=\"p3\"]")
	public WebElement mailing_cc;
	@TextType()
	@FindByLabel(label = "*Signature")
	public WebElement signature;
	@TextType()
	@FindByLabel(label = "*Note")
	public WebElement note;
	@TextType()
	@FindByLabel(label = "*Subject")
	public WebElement subject;
	@TextType()
	@FindBy(id = "p4")
	public WebElement bcc;
	@TextType()
	@FindBy(id = "p4")
	public WebElement bcc1;
	@ButtonType()
	@FindBy(xpath = "//*[@id=\"bottomButtonRow\"]/input[1]")
	public WebElement send;
	@ButtonType()
	@FindByLabel(label = "Cancel")
	public WebElement cancel;
	@ButtonType()
	@FindByLabel(label = " Yes ")
	public WebElement yes;
			
}
