package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title=""                                
               , summary=""
               , page="UAT_EmbeddedVFDataTable"
               , namespacePrefix=""
               , object="Contact"
               , connection="Bank_RetailDepartment"
     )             
public class UAT_EmbeddedVFDataTable {

	@PageTable(row = Con.class)
	@VisualforceBy(componentXPath = "apex:dataTable[@value = \"{!con}\"]")
	public List<Con> Con;

	@PageRow(byColumn = true)
	public static class Con {

		@TextType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id3:0:j_id5\"]")
		public WebElement lastName;
		@LinkType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id3:0:j_id7\"]/a")
		public WebElement email;
		@TextType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id3:1:j_id9\"]")
		public WebElement mobile;
		@FacetFindBys(value = {
				@FacetFindBy(findBy = @FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id3:0:j_id5\"]"), facet = UiFacet.DATA_ROWS),
				@FacetFindBy(findBy = @FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id3:0:j_id5\"]"), facet = UiFacet.HEADER_ROW) })
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id3:0:j_id4\"]")
		@PageTable(firstRowContainsHeaders = false, row = VFDataTable.class)
		public List<VFDataTable> VFDataTable;
		@LinkType()
		@FindBy(linkText = "contactvwv@testemail.com")
		public WebElement email1;
	}

	@PageRow()
	public static class VFDataTable {
	}
	
}
