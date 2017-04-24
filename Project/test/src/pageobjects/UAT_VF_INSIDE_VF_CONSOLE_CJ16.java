package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="UAT_VF_INSIDE_VF"                                
               , summary=""
               , page="UAT_VF_INSIDE_VF"
               , namespacePrefix=""
               , object="Case"
               , connection="Bank_RetailDepartment"
     )             
public class UAT_VF_INSIDE_VF_CONSOLE_CJ16 {

	@VisualforceBy(componentXPath = "apex:include[@pagename='UAT_VF_Only']//apex:form//apex:inputField[@value = \"{!case.Currency__c}\"]")
	@SalesforceField(name = "Currency__c", object = "Case")
	public WebElement currency;
	@LinkType()
	@FindByLabel(label = "TestDate")
	public WebElement testDate;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestMulti__c}\"]")
	@SalesforceField(name = "TestMulti__c", object = "Case")
	public WebElement testMulti;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestNumber__c}\"]")
	@SalesforceField(name = "TestNumber__c", object = "Case")
	public WebElement testNumber;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Origin}\"]")
	@SalesforceField(name = "Origin", object = "Case")
	public WebElement caseOrigin;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.ContactId}\"]")
	@SalesforceField(name = "ContactId", object = "Case")
	public WebElement contactName;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.IsEscalated}\"]")
	@SalesforceField(name = "IsEscalated", object = "Case")
	public WebElement escalated;
	@BooleanType()
	@VisualforceBy(componentXPath = "apex:include[@pagename='UAT_VF_Only']//apex:form//apex:selectRadio/apex:selectOption[1]")
	public WebElement one;
	@BooleanType()
	@VisualforceBy(componentXPath = "apex:include[@pagename='UAT_VF_Only']//apex:form//apex:selectRadio/apex:selectOption[2]")
	public WebElement two;
	@PageTable(row = Con.class)
	@VisualforceBy(componentXPath = "apex:pageblockTable[@id='pbd']")
	public List<Con> Con;
	@PageRow(byColumn = true)
	public static class Con {

		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.lastname}\"]")
		public WebElement lastName;
		@BooleanType()
		@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!a.donotcall}\"]")
		public WebElement checkbox;
		@LinkType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.email}\"]")
		public WebElement email;
		@ButtonType()
		@VisualforceBy(componentXPath = "apex:commandButton[@action='{!delcontact}']")
		public WebElement deleteButton;
		@LinkType()
		@VisualforceBy(componentXPath = "apex:commandLink[@value='Delete']")
		public WebElement deleteLink;
		@LinkType()
		@VisualforceBy(componentXPath = "apex:column[5]/apex:outputField[@value = \"{!a.email}\"]/a")
		public WebElement email1;
	}
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Subject}\"]")
	@SalesforceField(name = "Subject", object = "Case")
	public WebElement subject;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Description}\"]")
	@SalesforceField(name = "Description", object = "Case")
	public WebElement description;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestPercent__c}\"]")
	@SalesforceField(name = "TestPercent__c", object = "Case")
	public WebElement testPercent;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestURL__c}\"]")
	@SalesforceField(name = "TestURL__c", object = "Case")
	public WebElement testURL;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:include[@pagename='UAT_VF_Only']//apex:form//apex:commandButton[@action='{!save}']")
	public WebElement save;
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
	
}
