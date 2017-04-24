package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="testformpage"                                
               , summary=""
               , page="TestFormPage"
               , namespacePrefix=""
               , object="Case"
               , connection="Bank_RetailDepartment"
     )             
public class testformpage1 {

	@TextType()
	@FindBy(id = "j_id0:j_id1:j_id2:j_id5:j_id6")
	public WebElement currency1;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestURL__c}\"]")
	@SalesforceField(name = "TestURL__c", object = "Case")
	public WebElement testURL;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Origin}\"]")
	@SalesforceField(name = "Origin", object = "Case")
	public WebElement caseOrigin;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Type}\"]")
	@SalesforceField(name = "Type", object = "Case")
	public WebElement type;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Reason}\"]")
	@SalesforceField(name = "Reason", object = "Case")
	public WebElement caseReason;
	@ChoiceListType(values = { @ChoiceListValue(value = "0", title = "test 1"),
			@ChoiceListValue(value = "1", title = "test 2"),
			@ChoiceListValue(value = "2", title = "test 3") })
	@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id5:j_id9_unselected\"]")
	public WebElement testMulti;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Subject}\"]")
	@SalesforceField(name = "Subject", object = "Case")
	public WebElement subject;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id5:j_id23_lkwgt\"]")
	public WebElement ContactNameLookup;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestDate__c}\"]")
	@SalesforceField(name = "TestDate__c", object = "Case")
	public WebElement testDate;
	@LinkType()
	@FindBy(id = "j_id0:j_id1:j_id2:j_id5:j_id22_lkwgt")
	public WebElement AccountLookup;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestNumber__c}\"]")
	@SalesforceField(name = "TestNumber__c", object = "Case")
	public WebElement testNumber;
	
	
	
	
	
@FindBy(xpath = "//*[@id=\"myCasesTable\"]/thead/tr")
 @PageTable(firstRowContainsHeaders = false, row = Sorting.class)
 public List<Sorting> Sorting;
 
 @PageRow()
 public static class Sorting {
 @LinkType()
 @FindBy(xpath = "//*[@id=\"myCasesTable\"]/thead/tr/th[2]/a")
 public WebElement dueDateTimeColumn1;
 @LinkType()
 @FindBy(xpath = "th[2]/a")
 public WebElement dueDateTimeColumn2;
 }

@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestPercent__c}\"]")
@SalesforceField(name = "TestPercent__c", object = "Case")
public WebElement testPercent;
@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Description}\"]")
@SalesforceField(name = "Description", object = "Case")
public WebElement description;
@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.IsEscalated}\"]")
@SalesforceField(name = "IsEscalated", object = "Case")
public WebElement escalated;
@ButtonType()
@VisualforceBy(componentXPath = "apex:commandButton[@action='{!save}']")
public WebElement save;
@TextType()
@VisualforceBy(componentXPath = "apex:pageBlockSection")
public WebElement TestRichText;
@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Currency__c}\"]")
@SalesforceField(name = "Currency__c", object = "Case")
public WebElement currency;
@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Priority}\"]")
@SalesforceField(name = "Priority", object = "Case")
public WebElement priority;
@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.AccountId}\"]")
@SalesforceField(name = "AccountId", object = "Case")
public WebElement accountName;
@ChoiceListType()
@FindByLabel(label = "TestMulti")
public WebElement testMulti1;
@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestMulti__c}\"]")
@SalesforceField(name = "TestMulti__c", object = "Case")
public WebElement testMulti2;
@LinkType()
@FindBy(linkText = "Click Here!!!!!")
public WebElement clickHere;
@LinkType()
@FindByLabel(label = "TestDate")
public WebElement testDate1;
@BooleanType()
@VisualforceBy(componentXPath = "apex:selectOption[1]")
public WebElement one;
@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.TestMulti__c}\"]")
@SalesforceField(name = "TestMulti__c", object = "Case")
public WebElement testMulti21;
	
}
