package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="testformpage"                                
               , summary=""
               , page="TestFormPage"
               , namespacePrefix=""
               , object="Case"
               , connection="Bank_RetailDepartment"
     )             
public class testformpage11111 {

	@TextType()
	@FindBy(xpath = "//input[@name=\"j_id0:j_id2:j_id3:j_id6:j_id7\"]")
	public WebElement currency;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestMulti__c}\"]")
	@SalesforceField(name = "TestMulti__c", object = "Case")
	public WebElement testMulti2;
	
}
