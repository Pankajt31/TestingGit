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
public class UAT_VF_INSIDE_VF_C09ONSOLE_CJ16 {

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestURL__c}\"]")
	@SalesforceField(name = "TestURL__c", object = "Case")
	public WebElement testURL;
	
}
