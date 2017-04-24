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
public class UAT_IFRAME_VF_CJ3 {

	@PageTable(row = Table.class)
	@VisualforceBy(componentXPath = "apex:pageBlock[5]/apex:pageBlockSection/apex:pageblockTable[@value = \"{!con}\"]")
	public List<Table> table;

	@PageRow(byColumn = true)
	public static class Table {

		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.lastname}\"]")
		public WebElement lastName;
		@PageTable(row = Con.class)
		@VisualforceBy(componentXPath = "apex:column/apex:pageblockTable[@value = \"{!con}\"]")
		public List<Con> Con;
	}

	@PageRow(byColumn = true)
	public static class Con {

		@LinkType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!m.email}\"]")
		public WebElement innerColumn2;
	}
	
}
