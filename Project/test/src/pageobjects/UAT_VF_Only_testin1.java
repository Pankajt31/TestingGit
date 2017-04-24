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
public class UAT_VF_Only_testin1 {

	@PageTable(row = Table1.class)
	@VisualforceBy(componentXPath = "apex:pageblockTable[@id='pbd']")
	public List<Table1> Table1;

	@PageRow(byColumn = true)
	public static class Table1 {

		@TextType()
		@VisualforceBy(componentXPath = "apex:column[1]")
		public WebElement lastName;
	}
	
}
