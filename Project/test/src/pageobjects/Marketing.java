package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( connection="Bank_RetailDepartment"
     )             
public class Marketing {

	@LinkType()
	@FindBy(linkText = "Leads")
	public WebElement leads;
	@ButtonType()
	@FindByLabel(label = " New ")
	public WebElement new_;
	@LinkType()
	@FindBy(linkText = "Accounts")
	public WebElement accounts;
	@LinkType()
	@FindBy(linkText = "Accounts")
	public WebElement accounts1;
	@TextType()
	@FindByLabel(label = "*Account Name")
	public WebElement Name;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"bodyCell\"]/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/th/a")
	public WebElement lastName;
	@TextType()
	@FindByLabel(label = "*Subject")
	public WebElement subject;
	@ButtonType()
	@FindBy(xpath = "//*[@id=\"editPage\"]/div/div[2]/input[1]")
	public WebElement yes;
	@ButtonType()
	@FindByLabel(label = "Continue")
	public WebElement continue_;
	@LinkType()
	@FindBy(linkText = "Opportunities")
	public WebElement opportunities;
	@LinkType()
	@FindBy(xpath = "//a[contains(@title,'View') and contains(@title,'Attachment')]")
	public WebElement ViewAttachment;
	@ButtonType()
	@FindByLabel(label = "Refresh")
	public WebElement refresh;
	@ButtonType()
	@FindByLabel(label = "New Event")
	public WebElement newEvent;
	@LinkType()
	@FindBy(linkText = "\n            \n            File\n            \n        ")
	public WebElement file;
	@TextType()
	@FindBy(id = "tsidLabel")
	public WebElement Salesdropdown;
	@LinkType()
	@FindBy(linkText = "UAT Console App")
	public WebElement uATConsoleApp;
	@LinkType()
	@FindBy(linkText = "Cases")
	public WebElement cases;
	@LinkType()
	@FindBy(id = "publisherDropdown")
	public WebElement more;
	@LinkType()
	@FindBy(linkText = "Poll")
	public WebElement poll;
	@TextType()
	@FindBy(id = "createNewButton")
	public WebElement CreateNew;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"createNewMenu\"]/a[7]")
	public WebElement opportunity;
	@ChoiceListType(values = {
			@ChoiceListValue(value = "012200000006sr2", title = "test1"),
			@ChoiceListValue(value = "012200000006sr7", title = "Test2") })
	@FindBy(id = "p3")
	public WebElement RecordType;
	@ButtonType()
	@FindByLabel(label = "Share")
	public WebElement share;
	@ButtonType()
	@FindByLabel(label = "Cancel")
	public WebElement cancel;
	@ChoiceListType(values = { @ChoiceListValue(value = "Closed") })
	@FindByLabel(label = "Status")
	public WebElement status;
	@ChoiceListType(values = {
			@ChoiceListValue(value = "User didn't attend training"),
			@ChoiceListValue(value = "Complex functionality"),
			@ChoiceListValue(value = "Existing problem"),
			@ChoiceListValue(value = "Instructions not clear"),
			@ChoiceListValue(value = "New problem") })
	@FindByLabel(label = "Case Reason")
	public WebElement caseReason;
	@ButtonType()
	@FindByLabel(label = " Save ")
	public WebElement save;
	@ButtonType()
	@FindBy(xpath = "//*[@id=\"topButtonRow\"]/input[1]")
	public WebElement search;
	@ButtonType()
	@FindByLabel(label = "Convert Lead")
	public WebElement convertLead;
	@ButtonType()
	@FindByLabel(label = "Expand List")
	public WebElement expandList;
	@LinkType()
	@FindBy(linkText = "Contacts")
	public WebElement contacts;
	@LinkType()
	@FindBy(linkText = "Back To Top")
	public WebElement backToTop;
	@LinkType()
	@FindBy(linkText = "Reports")
	public WebElement reports;
	@LinkType()
	@FindBy(linkText = "Sales")
	public WebElement sales;
	@LinkType()
	@FindBy(linkText = "A01ProvarTest")
	public WebElement a01ProvarTest;
	@LinkType()
	@FindBy(linkText = "Opportunities")
	public WebElement opportunities1;
	@LinkType()
	@FindBy(linkText = "Record Types")
	public WebElement recordTypes;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"MoreTabs_Tab\"]")
	public WebElement MoreTab;
	@TextType()
	@FindBy(id = "phSearchInput")
	public WebElement search1;
	@ButtonType()
	@FindByLabel(label = "Search")
	public WebElement search2;
	@LinkType()
	@FindBy(linkText = "00001403")
	public WebElement _00001403;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"publisherAttachContentPost\"]")
	public WebElement file1;
	@LinkType()
	@FindBy(linkText = "Select a file from Salesforce")
	public WebElement selectAFileFromSalesforce;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"chatterLinkFileAction\"]")
	public WebElement selectAFileFromSalesforce1;
	@ButtonType()
	@FindBy(xpath = "//input")
	public WebElement cancel1;
	@ButtonType()
	@FindByLabel(label = "Cancel")
	public WebElement cancel2;
			
}
