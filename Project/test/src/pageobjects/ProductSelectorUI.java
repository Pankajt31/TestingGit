package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Product Selector UI"                                
               , page="UAT_ProductSelector"
               , connection="Bank_RetailDepartment"
     )             
public class ProductSelectorUI {
	
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.Name}\"]")
	@SalesforceField(name = "Name", object = "Opportunity")
	public WebElement opportunityName;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.CloseDate}\"]")
	@SalesforceField(name = "CloseDate", object = "Opportunity")
	public WebElement closeDate;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.StageName}\"]")
	@SalesforceField(name = "StageName", object = "Opportunity")
	public WebElement stage;
	@PageTable(row = LineItemsRow.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!LineItems}\"]")
	public List<LineItemsRow> lineItems;
	@PageRow()
	public static class LineItemsRow {
		@ChoiceListType(values = { @ChoiceListValue(value = "GenWatt Diesel 1000kW"), @ChoiceListValue(value = "GenWatt Diesel 10kW"), @ChoiceListValue(value = "GenWatt Gasoline 300kW") })
		@VisualforceBy(componentXPath = "apex:selectList[@value = \"{!dummyId}\"]")
		public WebElement selectProduct;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputTextArea[@value = \"{!lines.Description}\"]")
		public WebElement notes;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!lines.TotalPrice}\"]")
		public WebElement amount;
		@TextType()
		@FindByLabel(label = "Select Product", labelType = LabelType.RelativeTo, controlXpath = "ancestor::td[1]/following-sibling::td[1]//td/input", labelXpath = "//table[@class=\"list\"]/tbody/tr[1]//td[2]")
		public WebElement amount1;
	}
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@value='Save']")
	public WebElement save;
	@LinkType()
	@FindBy(xpath = "//a[contains(@href,'javascript:DatePicker.insertDate')]")
	public WebElement DateLink;
	@TextType()
	@FindByLabel(label = "Select Product", labelType = LabelType.RelativeTo, controlXpath = "ancestor::table[1]/following-sibling::div[1]//input", labelXpath = "//table[@class=\"list\"]/tbody/tr[1]//td[2]")
	public WebElement closeDate1;
	
}
