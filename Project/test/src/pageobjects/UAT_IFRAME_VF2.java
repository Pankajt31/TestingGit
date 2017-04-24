package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="UAT_IFRAME_VF"                                
               , summary=""
               , page="UAT_IFRAME_VF"
               , namespacePrefix=""
               , object="Case"
               , connection="Bank_RetailDepartment"
     )             
public class UAT_IFRAME_VF2 {

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Currency__c}\"]")
	@SalesforceField(name = "Currency__c", object = "Case")
	public WebElement currency;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestNumber__c}\"]")
	@SalesforceField(name = "TestNumber__c", object = "Case")
	public WebElement testNumber;
	
}
