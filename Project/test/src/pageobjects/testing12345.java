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
public class testing12345 {

	@PageRow(byColumn = true)
	public static class Con {

		@LinkType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.email}\"]")
		public WebElement Email;
		@TextType()
		@FindByLabel(label = "Last Name", labelType = LabelType.ColumnHeader)
		public WebElement lastName;
		@TextType()
		@FindBy(xpath = "span")
		public WebElement lastName1;
		@ButtonType()
		@VisualforceBy(componentXPath = "apex:commandButton[@action='{!delcontact}']")
		public WebElement deleteButton;
		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.lastname}\"]")
		public WebElement lastName2;
		@BooleanType()
		@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!a.donotcall}\"]")
		public WebElement checkbox;
		@LinkType()
		@VisualforceBy(componentXPath = "apex:commandLink[@value='Delete']")
		public WebElement deleteLink;
		@LinkType()
		@FindBy(xpath = "td[4]/a")
		public WebElement deleteLink1;
		@LinkType()
		@VisualforceBy(componentXPath = "apex:column[5]/apex:outputField[@value = \"{!a.email}\"]/a")
		public WebElement email;
		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.mobilephone}\"]")
		public WebElement mobile;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!a.accountid}\"]")
		public WebElement lookup;
	}

	@TextType()
	@FindByLabel(label = "Currency")
	public WebElement currency;
	@TextType()
	@FindBy(xpath = "//span[contains(@class, \"dateInput\")]//input")
	public WebElement testDate;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestMulti__c}\"]")
	@SalesforceField(name = "TestMulti__c", object = "Case")
	public WebElement testMulti;
	@TextType()
	@FindByLabel(label = "TestNumber")
	public WebElement testNumber;
	@PageTable(row = Con.class)
	@VisualforceBy(componentXPath = "apex:pageblockTable[@id='pbd']")
	public List<Con> Con;
	@TextType()
	@FindBy(xpath = "//span[contains(@class, \"dateInput\")]//input")
	public WebElement testDate123;
	@ChoiceListType(values = { @ChoiceListValue(value = "User didn't attend training"),
			@ChoiceListValue(value = "Complex functionality"), @ChoiceListValue(value = "Existing problem"),
			@ChoiceListValue(value = "Instructions not clear"), @ChoiceListValue(value = "New problem") })
	@FindBy(xpath = "//tr[5]/td[1]/select")
	public WebElement caseReason;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestMulti__c}\"]")
	@SalesforceField(name = "TestMulti__c", object = "Case")
	public WebElement testMulti1;
	@ChoiceListType(values = { @ChoiceListValue(value = "0", title = "test 1"),
			@ChoiceListValue(value = "1", title = "test 2"), @ChoiceListValue(value = "2", title = "test 3") })
	@FindBy(xpath = "//tr[contains(@class, \"multiSelectPicklistRow\")]/td[1]/select/option[3]")
	public WebElement testMulti1234;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.ContactId}\"]")
	@SalesforceField(name = "ContactId", object = "Case")
	public WebElement contactName1;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.ContactId}\"]")
	@SalesforceField(name = "ContactId", object = "Case")
	public WebElement ConatctNamelookup;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.AccountId}\"]")
	@SalesforceField(name = "AccountId", object = "Case")
	public WebElement AccountNameLookup;
	@LinkType()
	@FindBy(xpath = "//table[contains(@class, \"detailList\")]/tbody/tr[1]/td[1]/a")
	public WebElement googleSearch;
	@PageTable(row = Con1.class)
	@VisualforceBy(componentXPath = "apex:pageBlock[5]/apex:pageBlockSection/apex:pageblockTable[@value = \"{!con}\"]")
	public List<Con1> Con1;
	@PageRow(byColumn = true)
	public static class Con1 {

		@PageTable(row = Con2.class)
		@VisualforceBy(componentXPath = "apex:column/apex:pageblockTable[@value = \"{!con}\"]")
		public List<Con2> Con2;
	}
	@PageRow(byColumn = true)
	public static class Con2 {

		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!m.lastname}\"]")
		public WebElement innerColumn1;
	}

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Currency__c}\"]")
	@SalesforceField(name = "Currency__c", object = "Case")
	public WebElement currency1;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Subject}\"]")
	@SalesforceField(name = "Subject", object = "Case")
	public WebElement subject;
	
}
