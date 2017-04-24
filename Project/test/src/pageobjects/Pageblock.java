package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="UAT_VF_Only"                                
               , summary=""
               , page="UAT_VF_Only"
               , namespacePrefix=""
               , object="Case"
               , connection="Bank_RetailDepartment"
     )             
public class Pageblock {

	@PageTable(row = Table.class)
	@VisualforceBy(componentXPath = "apex:pageblockTable[@id='pbd']")
	public List<Table> table;

	@PageRow(byColumn = true)
	public static class Table {

		@LinkType()
		@VisualforceBy(componentXPath = "apex:commandLink[@value='Delete']")
		public WebElement deleteLink;
		@LinkType()
		@FindBy(name = "j_id0:j_id1:j_id39:j_id40:pbd:0:j_id49")
		public WebElement deleteLink1;
		@LinkType()
		@FindBy(name = "j_id0:j_id1:j_id39:j_id40:pbd:0:j_id49")
		public WebElement deleteLink2;
		@LinkType()
		@VisualforceBy(componentXPath = "apex:commandLink[@value='Delete']")
		public WebElement deleteLink11;
	}
	
}
