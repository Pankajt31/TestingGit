package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="UAT_EmbeddedVFTable"                                
               , summary=""
               , page="UAT_EmbeddedVFTable"
               , namespacePrefix=""
               , object="Contact"
               , connection="Bank_RetailDepartment"
     )             
public class testing {

	@PageTable(row = Table.class)
	@VisualforceBy(componentXPath = "apex:pageblockTable[@id='pbd']")
	public List<Table> table;

	@PageRow(byColumn = true)
	public static class Table {

		@ButtonType()
		@FindBy(xpath = "//input[@name=\"j_id0:j_id1:j_id2:pbd:0:j_id6\"]")
		public WebElement deleteButton;
	}
	
}
