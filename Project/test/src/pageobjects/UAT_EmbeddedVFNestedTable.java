package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title=""                                
               , summary=""
               , page="UAT_EmbeddedVFNestedTable"
               , namespacePrefix=""
               , object="Contact"
               , connection="Bank_RetailDepartment"
     )             
public class UAT_EmbeddedVFNestedTable {

	@PageTable(row = Table.class)
	@VisualforceBy(componentXPath = "apex:pageblockTable[@value = \"{!con}\"]")
	public List<Table> table;

	@PageRow(byColumn = true)
	public static class Table {

		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.lastname}\"]")
		public WebElement outerColumn1;
	}

	@PageTable(row = Con.class)
	@VisualforceBy(componentXPath = "apex:pageblockTable[@value = \"{!con}\"]")
	public List<Con> Con;

	@PageRow(byColumn = true)
	public static class Con {

		@PageTable(row = Con1.class)
		@VisualforceBy(componentXPath = "apex:pageblockTable[@value = \"{!con}\"]")
		public List<Con1> Con1;
					}

	@PageRow(byColumn = true)
	public static class Con1 {
	}

	@PageTable(row = Con2.class)
	@VisualforceBy(componentXPath = "apex:pageBlock/apex:pageblockTable[@value = \"{!con}\"]")
	public List<Con2> Con2;

	@PageRow(byColumn = true)
	public static class Con2 {

		@TextType()
		@FindBy(id = "j_id0:j_id1:j_id2:j_id3:0:j_id5")
		public WebElement outerColumn1;
	}

	@PageTable(row = Con3.class)
	@VisualforceBy(componentXPath = "apex:pageBlock/apex:pageblockTable[@value = \"{!con}\"]")
	public List<Con3> Con3;

	@PageRow(byColumn = true)
	public static class Con3 {

		@PageTable(row = Con4.class)
		@VisualforceBy(componentXPath = "apex:column/apex:pageblockTable[@value = \"{!con}\"]")
		public List<Con4> Con4;
		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.lastname}\"]")
		public WebElement outerColumn1;
		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.lastname}\"]")
		public WebElement outerColumn11;
		@TextType()
		@FindByLabel(label = "Outer Column 1")
		public WebElement outerColumn12;
	}

	@PageRow(byColumn = true)
	public static class Con4 {

		@TextType()
		@FindBy(id = "j_id0:j_id1:j_id2:j_id3:0:j_id6:0:j_id8")
		public WebElement innerColumn1;
		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!m.lastname}\"]")
		public WebElement innerColumn11;
		@LinkType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!m.email}\"]")
		public WebElement innerColumn2;
	}
	
}
