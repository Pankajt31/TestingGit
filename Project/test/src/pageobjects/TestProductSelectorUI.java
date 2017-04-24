package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Product Selector UI"                                
               , summary=""
               , page="UAT_ProductSelector"
               , namespacePrefix=""
               , object="Opportunity"
               , connection="Bank_RetailDepartment"
     )             
public class TestProductSelectorUI {

	@TextType()
	@FindByLabel(label = "Opportunity Name")
	public WebElement opportunityName;
	@LinkType()
	@FindByLabel(label = "Close Date")
	public WebElement closeDate;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.StageName}\"]")
	@SalesforceField(name = "StageName", object = "Opportunity")
	public WebElement stage;
	@PageTable(row = ProductTable.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!LineItems}\"]")
	public List<ProductTable> ProductTable;
	@PageRow(byColumn = true)
	public static class ProductTable {

		@ChoiceListType(values = { @ChoiceListValue(value = "Provar's test Account"),
				@ChoiceListValue(value = "test \"Provar\" product"), @ChoiceListValue(value = "Test 123"),
				@ChoiceListValue(value = "testing 321") })
		@VisualforceBy(componentXPath = "apex:selectList[@value = \"{!dummyId}\"]")
		public WebElement selectProduct;
		@TextType()
		@FindByLabel(label = "Amount", labelType = LabelType.ColumnHeader)
		public WebElement amount;
		@TextType()
		@FindBy(xpath = "input")
		public WebElement amount1;
		@TextType()
		@FindBy(name = "j_id0:j_id1:j_id2:j_id36:0:j_id43")
		public WebElement amount2;
		@TextType()
		@FindBy(xpath = "input")
		public WebElement amount3;
		@TextType()
		@FindBy(xpath = "textarea")
		public WebElement notes;
		@TextType()
		@FindBy(xpath = "textarea")
		public WebElement notes1;
	}
	
}
