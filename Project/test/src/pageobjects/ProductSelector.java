package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Product Selector"                                
               , page="ProductSelector"
               , connection="Bank_RetailDepartment"
     )             
public class ProductSelector {

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.Name}\"]")
	@SalesforceField(name = "Name", object = "Opportunity")
	public WebElement name;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.CloseDate}\"]")
	@SalesforceField(name = "CloseDate", object = "Opportunity")
	public WebElement closeDate;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.StageName}\"]")
	@SalesforceField(name = "StageName", object = "Opportunity")
	public WebElement stage;
	@TextType()
	@VisualforceBy(componentXPath = "apex:commandButton[@value='Save']")
	public WebElement saveButton;
	@PageTable(row = LineItemsRow.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!LineItems}\"]")
	public List<LineItemsRow> lineItems;
	@PageRow()
	public static class LineItemsRow {
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!lines.TotalPrice}\"]")
		public WebElement totalPrice;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputTextArea[@value = \"{!lines.Description}\"]")
		public WebElement description;
	}
	@PageTable(row = LineItemsRow.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!LineItems}\"]")
	public List<LineItemsRow> lineItems1;
	
	
	
}
