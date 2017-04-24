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
public class UAT_EmbeddedVFTable_Pankaj {

	@PageTable(row = Table.class)
	@VisualforceBy(componentXPath = "apex:pageblockTable[@id='pbd']")
	public List<Table> table;

	@PageRow(byColumn = true)
	public static class Table {

		@TextType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:pbd:0:j_id4\"]")
		public WebElement lastName;
		@ButtonType()
		@VisualforceBy(componentXPath = "apex:commandButton[@action='{!delcontact}']")
		public WebElement deleteButton;
		@LinkType()
		@VisualforceBy(componentXPath = "apex:commandLink[@value='Delete']")
		public WebElement deleteLink;
		@LinkType()
		@FindBy(linkText = "contactvwv@testemail.com")
		public WebElement email;
		@LinkType()
		@VisualforceBy(componentXPath = "apex:column[6]")
		public WebElement pDFDownload;
		@TextType()
		@FindBy(id = "j_id0:j_id1:j_id2:pbd:1:j_id14")
		public WebElement mobile;
	}
	
}
