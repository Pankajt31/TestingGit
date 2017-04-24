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
public class AddtableProductSelectorUI {

	@PageTable(row = LineItems.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!LineItems}\"]")
	public List<LineItems> lineItems;

	@PageRow(byColumn = true)
	public static class LineItems {

		@TextType()
		@FindByLabel(label = "Select Product", labelType = LabelType.RelativeTo, controlXpath = "ancestor::td[1]/following-sibling::td[1]//td/input", labelXpath = "//table[@class=\"list\"]/tbody/tr[1]//td[2]")
		public WebElement amount;
		@ChoiceListType(values = { @ChoiceListValue(value = "Provar's test Account"),
				@ChoiceListValue(value = "test \"Provar\" product"), @ChoiceListValue(value = "Test 123"),
				@ChoiceListValue(value = "testing 321") })
		@VisualforceBy(componentXPath = "apex:selectList[@value = \"{!dummyId}\"]")
		public WebElement selectProduct;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!lines.TotalPrice}\"]")
		public WebElement amount1;
		@VisualforceBy(componentXPath = "apex:inputTextArea[@value = \"{!lines.Description}\"]")
		@SalesforceField(name = "Description", object = "Opportunity")
		public WebElement notes;
		@BooleanType()
		@VisualforceBy(componentXPath = "apex:inputCheckbox[@value = \"{!Check}\"]")
		public WebElement checkBox;
		@BooleanType()
		@VisualforceBy(componentXPath = "apex:inputCheckbox[@value = \"{!Check}\"]")
		public WebElement checkBox1;
		@TextType()
		@FindBy(id = "j_id0:j_id1:j_id2:j_id36:1:j_id43")
		public WebElement amount11;
		@VisualforceBy(componentXPath = "apex:inputTextArea[@value = \"{!lines.Description}\"]")
		@SalesforceField(name = "Description", object = "Opportunity")
		public WebElement notes_1;
		@VisualforceBy(componentXPath = "apex:inputTextArea[@value = \"{!lines.Description}\"]")
		@SalesforceField(name = "Description", object = "Opportunity")
		public WebElement notes2;
		@TextType()
		@FindByLabel(label = "Notes", labelType = LabelType.ColumnHeader)
		public WebElement notes11;
	}

	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"requiredInput\")]/input")
	public WebElement opportunityName;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.StageName}\"]")
	@SalesforceField(name = "StageName", object = "Opportunity")
	public WebElement stage;
	@LinkType()
	@FindBy(linkText = "21/09/2016")
	public WebElement closeDate;
	
}
