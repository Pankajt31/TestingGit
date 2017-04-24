package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="UAT_EmbeddedVF"                                
               , summary=""
               , page="UAT_EmbeddedVF"
               , namespacePrefix=""
               , object="Account"
               , connection="Bank_RetailDepartment"
     )             
public class UAT_EmbeddedVF_test {

	@PageTable(row = Table.class)
	@VisualforceBy(componentXPath = "apex:pageblockTable[@value = \"{!acc}\"]")
	public List<Table> table;

	@PageRow(byColumn = true)
	public static class Table {

		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.name}\"]")
		public WebElement name;
	}
	
}
