package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="UAT_ Embeded Nestanle Table AK"                                
               , summary=""
               , page="UAT_EmbeddedVFNestedTable"
               , namespacePrefix=""
               , object="Contact"
               , connection="Bank_RetailDepartment"
     )             
public class UAT_EmbededNestanleTableAK {

	@PageTable(row = Table1.class)
	@VisualforceBy(componentXPath = "apex:pageBlock[not(@id)]/apex:pageblockTable[@value = \"{!con}\"]")
	public List<Table1> table1;

	@PageRow(byColumn = true)
	public static class Table1 {

		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.lastname}\"]")
		public WebElement outerColumn1;
		@PageTable(row = Con.class)
		@VisualforceBy(componentXPath = "apex:column/apex:pageblockTable[@value = \"{!con}\"]")
		public List<Con> Con;
	}

	@PageRow(byColumn = true)
	public static class Con {

		@LinkType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!m.email}\"]")
		public WebElement innerColumn2;
		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!m.lastname}\"]")
		public WebElement innerColumn1;
	}
	
}
