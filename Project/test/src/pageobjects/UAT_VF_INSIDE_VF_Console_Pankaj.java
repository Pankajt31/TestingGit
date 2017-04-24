package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="UAT_VF_INSIDE_VF"                                
               , summary=""
               , page="UAT_VF_INSIDE_VF"
               , namespacePrefix=""
               , object="Case"
               , connection="Bank_RetailDepartment"
     )             
public class UAT_VF_INSIDE_VF_Console_Pankaj {

	@VisualforceBy(componentXPath = "apex:form//apex:inputField[@value = \"{!case.Currency__c}\"]")
	@SalesforceField(name = "Currency__c", object = "Case")
	public WebElement currency;
	@BooleanType()
	@VisualforceBy(componentXPath = "apex:form//apex:selectRadio/apex:selectOption[1]")
	public WebElement one;
	
}
