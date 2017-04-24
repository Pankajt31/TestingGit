package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title=""                                
               , summary=""
               , page="TestFormPage"
               , namespacePrefix=""
               , object="Case"
               , connection="Bank_RetailDepartment"
     )             
public class testformpage {

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Currency__c}\"]")
	@SalesforceField(name = "Currency__c", object = "Case")
	public WebElement currency;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestNumber__c}\"]")
	@SalesforceField(name = "TestNumber__c", object = "Case")
	public WebElement testNumber;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestURL__c}\"]")
	@SalesforceField(name = "TestURL__c", object = "Case")
	public WebElement testURL;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Reason}\"]")
	@SalesforceField(name = "Reason", object = "Case")
	public WebElement caseReason;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Subject}\"]")
	@SalesforceField(name = "Subject", object = "Case")
	public WebElement subject;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.AccountId}\"]")
	@SalesforceField(name = "AccountId", object = "Case")
	public WebElement accountName;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestDate__c}\"]")
	@SalesforceField(name = "TestDate__c", object = "Case")
	public WebElement testDate;
	@ChoiceListType(values = { @ChoiceListValue(value = "0", title = "test 1"), @ChoiceListValue(value = "1", title = "test 2"), @ChoiceListValue(value = "2", title = "test 3") })
	@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id5:j_id9_unselected\"]")
	public WebElement testmulti;
	@LinkType()
	@VisualforceBy(componentXPath = "apex:pageBlockSection/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/a[1]")
	public WebElement add;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestPercent__c}\"]")
	@SalesforceField(name = "TestPercent__c", object = "Case")
	public WebElement testPercent;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Origin}\"]")
	@SalesforceField(name = "Origin", object = "Case")
	public WebElement caseOrigin;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Description}\"]")
	@SalesforceField(name = "Description", object = "Case")
	public WebElement description;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Priority}\"]")
	@SalesforceField(name = "Priority", object = "Case")
	public WebElement priority;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Type}\"]")
	@SalesforceField(name = "Type", object = "Case")
	public WebElement type;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.ContactId}\"]")
	@SalesforceField(name = "ContactId", object = "Case")
	public WebElement contactName;
	@BooleanType()
	@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id5:j_id18\"]")
	public WebElement escalated;
	@ChoiceListType(values = { @ChoiceListValue(value = "0", title = "test 1"),
			@ChoiceListValue(value = "1", title = "test 2"),
			@ChoiceListValue(value = "2", title = "test 3") })
	@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id5:j_id9_unselected\"]/optgroup/option[3]")
	public WebElement testmulti1;
	@TextType()
	@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id5:j_id23\"]")
	public WebElement texteditor;
	@ButtonType()
	@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id3:bottom\"]/input")
	public WebElement save;
	@TextType()
	@FindBy(name = "j_id0:j_id1:j_id2:j_id5:j_id20")
	public WebElement subject1;
	@LinkType()
	@FindBy(id = "j_id0:j_id1:j_id2:j_id5:j_id22_lkwgt")
	public WebElement look_up;
	@TextType()
	@FindBy(name = "j_id0:j_id1:j_id2:j_id5:j_id7")
	public WebElement testDate1;
	@TextType()
	@FindBy(name = "j_id0:j_id1:j_id2:j_id5:j_id15")
	public WebElement caseOrigin1;
	@TextType()
	@FindBy(name = "j_id0:j_id1:j_id2:j_id5:j_id21")
	public WebElement type1;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.ContactId}\"]")
	@SalesforceField(name = "ContactId", object = "Case")
	public WebElement con_lookup;
	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save1;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Currency__c}\"]")
	@SalesforceField(name = "Currency__c", object = "Case")
	public WebElement currency1;
	@TextType()
	@FindByLabel(label = "TestNumber")
	public WebElement testNumber1;
	@TextType()
	@FindBy(id = "j_id0:j_id1:j_id2:j_id5:j_id12")
	public WebElement testURL1;
	@TextType()
	@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id5:j_id16\"]")
	public WebElement caseReason1;
	@BooleanType()
	@FindBy(name = "j_id0:j_id1:j_id2:j_id5:j_id18")
	public WebElement escalated1;
	@TextType()
	@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id5:j_id20\"]")
	public WebElement subject11;
	@LinkType()
	@FindBy(id = "j_id0:j_id1:j_id2:j_id5:j_id22_lkwgt")
	public WebElement look_up1;
	@TextType()
	@FindByLabel(label = "TestDate")
	public WebElement testDate11;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id5\"]/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/a[2]")
	public WebElement remove;
	@ChoiceListType(values = { @ChoiceListValue(value = "Email"),
			@ChoiceListValue(value = "Phone"), @ChoiceListValue(value = "Web") })
	@FindBy(name = "j_id0:j_id1:j_id2:j_id5:j_id15")
	public WebElement caseOrigin11;
	@TextType()
	@VisualforceBy(componentXPath = "apex:pageBlockSection/div/table/tbody/tr[9]/td[3]")
	public WebElement RickText;
	@TextType()
	@FindBy(xpath = "//*[@id='j_id0:j_id1:j_id2:j_id5:j_id9']")
	public WebElement testmulti2;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestFormula__c}\"]")
	@SalesforceField(name = "TestFormula__c", object = "Case")
	public WebElement testFormula;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestFormula__c}\"]")
	@SalesforceField(name = "TestFormula__c", object = "Case")
	public WebElement TestFormula;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Currency__c}\"]")
	@SalesforceField(name = "Currency__c", object = "Case")
	public WebElement currency2;
	@ChoiceListType()
	@FindByLabel(label = "TestMulti")
	public WebElement testMulti;
	@ChoiceListType()
	@FindByLabel(label = "TestMulti")
	public WebElement testMulti1;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Priority}\"]")
	@SalesforceField(name = "Priority", object = "Case")
	public WebElement priority1;
	@LinkType()
	@FindBy(id = "j_id0:j_id2:j_id3:j_id6:j_id23_lkwgt")
	public WebElement AccountLookup;
	@LinkType()
	@FindBy(id = "j_id0:j_id2:j_id3:j_id6:j_id24_lkwgt")
	public WebElement ContactNameLookup;
	@ChoiceListType()
	@FindByLabel(label = "TestMulti")
	public WebElement testMulti2;
	@LinkType()
	@FindBy(id = "j_id0:j_id2:j_id3:j_id6:j_id24_lkwgt")
	public WebElement ContactNameLookup1;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.ContactId}\"]")
	@SalesforceField(name = "ContactId", object = "Case")
	public WebElement contactName1;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!save}']")
	public WebElement save2;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Currency__c}\"]")
	@SalesforceField(name = "Currency__c", object = "Case")
	public WebElement currency3;
	@ChoiceListType()
	@FindByLabel(label = "TestMulti")
	public WebElement testMulti3;
	@ChoiceListType()
	@FindBy(xpath = "//*[@id=\"j_id0:j_id2:j_id3:j_id6:j_id10_unselected\"]")
	public WebElement testMulti4;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!save}']")
	public WebElement save3;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Currency__c}\"]")
	@SalesforceField(name = "Currency__c", object = "Case")
	public WebElement currency4;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Currency__c}\"]")
	@SalesforceField(name = "Currency__c", object = "Case")
	public WebElement currency11;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Currency__c}\"]")
	@SalesforceField(name = "Currency__c", object = "Case")
	public WebElement currency111;
	@PageFrame()
	public static class Frame {

		@ButtonType()
		@FindBy(xpath = "//*[@id=\"cse-search-box\"]//input[4]")
		public WebElement ContactSearchLookup;
		@LinkType()
		@FindBy(xpath = "//a[@href=\"/products/index.jsp\"]")
		public WebElement products;
		@LinkType()
		@FindBy(linkText = "Products")
		public WebElement products1;
		@LinkType()
		@FindBy(linkText = "Customers")
		public WebElement customers;
		@LinkType()
		@FindBy(xpath = "//*[@id=\"button-login\"]")
		public WebElement login;
		@LinkType()
		@FindBy(xpath = "//a[@href=\"/products/index.jsp\"]")
		public WebElement products2;
		@LinkType()
		@FindBy(linkText = "Community")
		public WebElement community;
		@TextType()
		@FindBy(id = "searchtext")
		public WebElement ContactSearch;
		@LinkType()
		@FindBy(linkText = "About Us")
		public WebElement aboutUs;
	}
	@FindBy(css = "#theIframe")
	public Frame frame;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"j_id0:j_id2:j_id3:j_id6:j_id24_lkwgt\"]")
	public WebElement ContactName;
	@LinkType()
	@FindBy(linkText = "Click Here!!!!!")
	public WebElement clickHere;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.IsEscalated}\"]")
	@SalesforceField(name = "IsEscalated", object = "Case")
	public WebElement escalated11;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!save}']")
	public WebElement save11;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestMulti__c}\"]")
	@SalesforceField(name = "TestMulti__c", object = "Case")
	public WebElement testMultiNew;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"j_id0:j_id2:j_id3:j_id6\"]/div/table/tbody/tr[1]//a")
	public WebElement testDateNew;
	
}
