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
public class UAT_IFRAME_VF1 {

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestNumber__c}\"]")
	@SalesforceField(name = "TestNumber__c", object = "Case")
	public WebElement testNumber1;
	@PageTable(row = Con.class)
	@VisualforceBy(componentXPath = "apex:pageBlock[5]/apex:pageBlockSection/apex:pageblockTable[@value = \"{!con}\"]")
	public List<Con> Con;

	@PageRow(byColumn = true)
	public static class Con {

		@PageTable(row = Con1.class)
		@VisualforceBy(componentXPath = "apex:column/apex:pageblockTable[@value = \"{!con}\"]")
		public List<Con1> Con1;
	}

	@PageRow(byColumn = true)
	public static class Con1 {

		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!m.lastname}\"]")
		public WebElement innerColumn1;
	}
	
}
