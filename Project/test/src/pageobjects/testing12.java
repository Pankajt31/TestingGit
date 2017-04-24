package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="UAT_IFRAME_VF"                                
               , summary=""
               , page="UAT_IFRAME_VF"
               , namespacePrefix=""
               , object="Case"
               , connection="Bank_RetailDepartment"
     )             
public class testing12 {

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

	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Subject}\"]")
	@SalesforceField(name = "Subject", object = "Case")
	public WebElement subject;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.Type}\"]")
	@SalesforceField(name = "Type", object = "Case")
	public WebElement type;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.AccountId}\"]")
	@SalesforceField(name = "AccountId", object = "Case")
	public WebElement accountName;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!case.ContactId}\"]")
	@SalesforceField(name = "ContactId", object = "Case")
	public WebElement contactName;
	@BooleanType()
	@VisualforceBy(componentXPath = "apex:selectOption[1]")
	public WebElement one;
	@TextType()
	@FindBy(id = "cke_j_id0:j_id1:j_id2:j_id6:j_id25:textAreaDelegate_TestRichText__c")
	public WebElement textAreaDelegate_TestRichText__c;
	@PageTable(row = Con.class)
	@VisualforceBy(componentXPath = "apex:pageblockTable[@id='pbd']")
	public List<Con> Con;

	@PageRow(byColumn = true)
	public static class Con {

		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.lastname}\"]")
		public WebElement lastName;
		@LinkType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.email}\"]")
		public WebElement email;
		@LinkType()
		@VisualforceBy(componentXPath = "apex:commandLink[@value='Delete']")
		public WebElement deleteLink;
	}

	@BooleanType()
	@VisualforceBy(componentXPath = "apex:inputCheckbox[@value = \"{!a.DoNotCall}\"]")
	public WebElement check;

	@PageRow()
	public static class Tabletesting {
	}

	@FacetFindBys(value = { @FacetFindBy(findBy = @FindBy(xpath = ".//tr"), facet = UiFacet.DATA_ROWS) })
	@FindBy(xpath = "//form/div[3]/div/div/div/div[1]/div/div[2]/table/tbody/tr/td[1]/table")
	@PageTable(firstRowContainsHeaders = true, row = Tabletesting.class)
	public List<Tabletesting> tabletesting;

	@PageRow()
	public static class Tabletesting1 {
	}

	@FacetFindBys(value = {
			@FacetFindBy(findBy = @FindBy(xpath = ".//*[contains(@class,'dataRow')]"), facet = UiFacet.DATA_ROWS),
			@FacetFindBy(findBy = @FindBy(xpath = "//form/div[3]/div/div/div/div[1]/div/div[2]/table/tbody/tr/td[1]/table/tbody/tr[1]/td[1]/span"), facet = UiFacet.HEADER_ROW) })
	@FindBy(xpath = "//form/div[3]/div/div/div/div[1]/div/div[2]/table/tbody/tr/td[1]/table")
	@PageTable(firstRowContainsHeaders = false, row = Tabletesting1.class)
	public List<Tabletesting1> tabletesting1;
	
}
