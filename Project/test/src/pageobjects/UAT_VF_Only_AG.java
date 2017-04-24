package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title=""                                
               , summary=""
               , page="UAT_VF_Only"
               , namespacePrefix=""
               , object="Case"
               , connection="Bank_RetailDepartment"
     )             
public class UAT_VF_Only_AG {

	@LinkType()
	@FindBy(linkText = "Google Search")
	public WebElement googleSearch;
	@LinkType()
	@FindBy(linkText = "Google Maps")
	public WebElement googleMaps;
	@LinkType()
	@FindBy(linkText = "Google News")
	public WebElement googleNews;
	@LinkType()
	@FindBy(linkText = "Yahoo Maps")
	public WebElement yahooMaps;
	@TextType()
	@FindBy(xpath = "//input[@name=\"j_id0:j_id1:j_id2:j_id6:j_id11\"]")
	public WebElement testNumber;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Currency__c}\"]")
	@SalesforceField(name = "Currency__c", object = "Case")
	public WebElement currency;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestURL__c}\"]")
	@SalesforceField(name = "TestURL__c", object = "Case")
	public WebElement testURL;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Reason}\"]")
	@SalesforceField(name = "Reason", object = "Case")
	public WebElement caseReason;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestPercent__c}\"]")
	@SalesforceField(name = "TestPercent__c", object = "Case")
	public WebElement testPercent;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Origin}\"]")
	@SalesforceField(name = "Origin", object = "Case")
	public WebElement caseOrigin;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.IsEscalated}\"]")
	@SalesforceField(name = "IsEscalated", object = "Case")
	public WebElement escalated;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Description}\"]")
	@SalesforceField(name = "Description", object = "Case")
	public WebElement description;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Priority}\"]")
	@SalesforceField(name = "Priority", object = "Case")
	public WebElement priority;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Subject}\"]")
	@SalesforceField(name = "Subject", object = "Case")
	public WebElement subject;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Type}\"]")
	@SalesforceField(name = "Type", object = "Case")
	public WebElement type;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id6:j_id23_lkwgt\"]")
	public WebElement AccountNameLookup;
	@LinkType()
	@FindBy(id = "j_id0:j_id1:j_id2:j_id6:j_id24_lkwgt")
	public WebElement ConatctNamelookup;
	@BooleanType()
	@VisualforceBy(componentXPath = "apex:selectOption[1]")
	public WebElement one;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!save}']")
	public WebElement save;
	@PageTable(row = Con.class)
	@VisualforceBy(componentXPath = "apex:pageBlock[5]/apex:pageBlockSection/apex:pageblockTable[@value = \"{!con}\"]")
	public List<Con> Con;
	@PageRow(byColumn = true)
	public static class Con {

		@PageTable(row = Con1.class)
		@VisualforceBy(componentXPath = "apex:column/apex:pageblockTable[@value = \"{!con}\"]")
		public List<Con1> Con1;
	}
	@PageRow(byColumn = true)
	public static class Con1 {

		@TextType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id64:j_id65:j_id66:0:j_id69:0:j_id71\"]")
		public WebElement innerColumn1;
		@TextType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id64:j_id65:j_id66:3:j_id69:3:j_id71\"]")
		public WebElement innerColumn11;
		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!m.lastname}\"]")
		public WebElement innerColumn12;
		@LinkType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!m.email}\"]/a")
		public WebElement innerColumn2;
	}
	@PageTable(row = Con2.class)
	@VisualforceBy(componentXPath = "apex:pageblockTable[@id='pbd']")
	public List<Con2> Con2;
	@PageRow(byColumn = true)
	public static class Con2 {

		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.lastname}\"]")
		public WebElement lastName;
		@LinkType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id39:j_id40:pbd:0:j_id49\"]")
		public WebElement deleteLink;
		@BooleanType()
		@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!a.donotcall}\"]")
		public WebElement checkbox;
		@LinkType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id39:j_id40:pbd:0:j_id52\"]/a")
		public WebElement email;
		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.mobilephone}\"]")
		public WebElement mobile;
		@LinkType()
		@VisualforceBy(componentXPath = "apex:commandLink[@value='Delete']")
		public WebElement Delete_link;
		@LinkType()
		@FindByLabel(label = "Delete link", labelType = LabelType.ColumnHeader)
		public WebElement deleteLink1;
		@LinkType()
		@VisualforceBy(componentXPath = "apex:commandLink[@value='Delete']")
		public WebElement deleteLink1234;
		@LinkType()
		@VisualforceBy(componentXPath = "apex:commandLink[@value='Delete']")
		public WebElement deleteLink_21;
		@LinkType()
		@FindBy(xpath = "td[4]/a")
		public WebElement deleteLink2;
		@LinkType()
		@FindBy(name = "j_id0:j_id1:j_id39:j_id40:pbd:0:j_id49")
		public WebElement deleteLink3;
		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.lastname}\"]")
		public WebElement lastName1;
		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.mobilephone}\"]")
		public WebElement mobile1;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!a.accountid}\"]")
		public WebElement lookup;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!a.accountid}\"]")
		public WebElement lookup1;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!a.accountid}\"]")
		public WebElement lookup2;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!a.accountid}\"]")
		public WebElement lookup3;
		@LinkType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.email}\"]")
		public WebElement email1;
	}
	@LinkType()
	@FindByLabel(label = "TestDate")
	public WebElement testDate;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestMulti__c}\"]")
	@SalesforceField(name = "TestMulti__c", object = "Case")
	public WebElement testMulti;
	@PageTable(row = Con3.class)
	@VisualforceBy(componentXPath = "apex:dataTable[@value = \"{!con}\"]")
	public List<Con3> Con3;
	@PageRow(byColumn = true)
	public static class Con3 {

		@LinkType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id55:j_id56:j_id57:0:j_id59\"]")
		public WebElement email;
		@LinkType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.email}\"]")
		public WebElement email123;
	}
	@LinkType()
	@FindBy(linkText = "04/07/2016")
	public WebElement testDate1;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Reason}\"]")
	@SalesforceField(name = "Reason", object = "Case")
	public WebElement caseReason121;
	@ChoiceListType()
	@FindBy(xpath = "//tr[5]//select")
	public WebElement caseReason12345;
	@TextType()
	@FindBy(id = "cke_j_id0:j_id1:j_id2:j_id6:j_id25:textAreaDelegate_TestRichText__c")
	public WebElement textAreaDelegate_TestRichText__c;
	@LinkType()
	@FindBy(linkText = "25/08/2016")
	public WebElement testDate2;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestRichText__c}\"]")
	@SalesforceField(name = "TestRichText__c", object = "Case")
	public WebElement image;
	
}
