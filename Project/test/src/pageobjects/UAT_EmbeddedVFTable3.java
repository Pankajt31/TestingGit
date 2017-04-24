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
public class UAT_EmbeddedVFTable3 {

	@PageTable(row = Con.class)
	@VisualforceBy(componentXPath = "apex:pageblockTable[@id='pbd']")
	public List<Con> Con;

	@PageRow(byColumn = true)
	public static class Con {

		@TextType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:pbd:0:j_id4\"]")
		public WebElement lastName1;
		@LinkType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:pbd:0:j_id9\"]")
		public WebElement deleteLink1;
	}
	
}
