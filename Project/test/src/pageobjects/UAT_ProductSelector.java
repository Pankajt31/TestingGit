package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title=""                                
               , summary=""
               , page="UAT_ProductSelector"
               , namespacePrefix=""
               , object="Opportunity"
               , connection="Bank_RetailDepartment"
     )             
public class UAT_ProductSelector {

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.Name}\"]")
	@SalesforceField(name = "Name", object = "Opportunity")
	public WebElement opportunityName;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.StageName}\"]")
	@SalesforceField(name = "StageName", object = "Opportunity")
	public WebElement stage;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.CloseDate}\"]")
	@SalesforceField(name = "CloseDate", object = "Opportunity")
	public WebElement closeDate;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@value='Save']")
	public WebElement save;
	@PageTable(row = LineItemsRow.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!LineItems}\"]")
	public List<LineItemsRow> lineItems;
	@PageRow()
	public static class LineItemsRow {
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!lines.TotalPrice}\"]")
		public WebElement amount;
		@ChoiceListType()
		@VisualforceBy(componentXPath = "apex:selectList[@value = \"{!dummyId}\"]")
		public WebElement selectProduct;
		@VisualforceBy(componentXPath = "apex:inputTextArea[@value = \"{!lines.Description}\"]")
		@SalesforceField(name = "Description", object = "Opportunity")
		public WebElement notes;
	}
	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save1;
	@PageTable(row = ProductTable.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!LineItems}\"]")
	public List<ProductTable> ProductTable;
	@PageRow(byColumn = true)
	public static class ProductTable {

		@ChoiceListType(values = {
				@ChoiceListValue(value = "01u2000000YRsubAAD", title = "Test 123"),
				@ChoiceListValue(value = "01u2000000YRsugAAD", title = "testing 321") })
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id36:0:j_id37\"]/select")
		public WebElement selectProduct;
		@ChoiceListType()
		@VisualforceBy(componentXPath = "apex:selectList[@value = \"{!dummyId}\"]")
		public WebElement selectProduct1;
		@BooleanType()
		@VisualforceBy(componentXPath = "apex:inputCheckbox[@value = \"{!Check}\"]")
		public WebElement checkBox;
	}
	@PageTable(row = ProductTable1.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!LineItems}\"]")
	public List<ProductTable1> ProductTable1;
	@PageRow(byColumn = true)
	public static class ProductTable1 {

		@ChoiceListType()
		@VisualforceBy(componentXPath = "apex:selectList[@value = \"{!dummyId}\"]")
		public WebElement selectProduct1;
	}
	@LinkType()
	@FindByLabel(label = "Close Date")
	public WebElement closeDate1;
	@PageTable(row = ProductTable123.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!LineItems}\"]")
	public List<ProductTable123> ProductTable123;
	@PageRow(byColumn = true)
	public static class ProductTable123 {

		@ChoiceListType()
		@VisualforceBy(componentXPath = "apex:selectList[@value = \"{!dummyId}\"]")
		public WebElement selectProduct1;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!lines.TotalPrice}\"]")
		public WebElement amount;
		@ChoiceListType()
		@VisualforceBy(componentXPath = "apex:selectList[@value = \"{!dummyId}\"]")
		public WebElement selectProduct11;
		@ChoiceListType()
		@VisualforceBy(componentXPath = "apex:selectList[@value = \"{!dummyId}\"]")
		public WebElement selectProduct1233;
		@ChoiceListType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id36:0:j_id39\"]/select")
		public WebElement selectProduct13444;
	}
	@PageTable(row = ProductTableNew.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!LineItems}\"]")
	public List<ProductTableNew> ProductTableNew;
	@PageRow(byColumn = true)
	public static class ProductTableNew {

		@ChoiceListType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id36:0:j_id39\"]/select")
		public WebElement selectProduct;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!lines.TotalPrice}\"]")
		public WebElement amount;
		@TextType()
		@FindBy(xpath = "//input[@name=\"j_id0:j_id1:j_id2:j_id36:0:j_id43\"]")
		public WebElement amount1;
		@TextType()
		@FindBy(xpath = "//input[@name=\"j_id0:j_id1:j_id2:j_id36:0:j_id43\"]")
		public WebElement amount11;
		@VisualforceBy(componentXPath = "apex:inputTextArea[@value = \"{!lines.Description}\"]")
		@SalesforceField(name = "Description", object = "Opportunity")
		public WebElement notes;
		@TextType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id36:0:j_id44\"]")
		public WebElement notes1;
		@TextType()
		@FindBy(name = "j_id0:j_id1:j_id2:j_id36:0:j_id45")
		public WebElement notes2;
	}
	@LinkType()
	@FindByLabel(label = "Close Date")
	public WebElement closeDate2;
	
}
