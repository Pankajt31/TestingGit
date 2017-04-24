package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="UAT_ProductSelector"                                
               , summary=""
               , page="UAT_ProductSelector"
               , namespacePrefix=""
               , object="Opportunity"
               , connection="Bank_RetailDepartment"
     )             
public class UAT_ProductSelector1 {

	@TextType()
	@FindBy(xpath = "//table[@class=\"detailList\"]/tbody/tr[1]/td[1]/div")
	public WebElement opportunityName;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.CloseDate}\"]")
	@SalesforceField(name = "CloseDate", object = "Opportunity")
	public WebElement closeDate;
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.StageName}\"]")
	@SalesforceField(name = "StageName", object = "Opportunity")
	public WebElement stage;
	@PageTable(row = LineItems.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!LineItems}\"]")
	public List<LineItems> lineItems;
	@PageRow(byColumn = true)
	public static class LineItems {

		@ChoiceListType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id36:0:j_id39\"]/select")
		public WebElement selectProduct;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!lines.TotalPrice}\"]")
		public WebElement amount;
		@VisualforceBy(componentXPath = "apex:inputTextArea[@value = \"{!lines.Description}\"]")
		@SalesforceField(name = "Description", object = "Opportunity")
		public WebElement notes;
		@ChoiceListType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id36:1:j_id39\"]/select")
		public WebElement selectProduct1;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!lines.TotalPrice}\"]")
		public WebElement amount1;
		@TextType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id36:1:j_id42\"]")
		public WebElement amount12;
		@TextType()
		@FindBy(name = "j_id0:j_id1:j_id2:j_id36:1:j_id45")
		public WebElement notes1;
		@ChoiceListType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id36:1:j_id39\"]/select")
		public WebElement selectProduct111;
		@TextType()
		@FindBy(xpath = "//input[@name=\"j_id0:j_id1:j_id2:j_id36:1:j_id43\"]")
		public WebElement amount1222;
		@TextType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id36:1:j_id44\"]")
		public WebElement notes2;
		@ChoiceListType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id36:2:j_id39\"]/select")
		public WebElement selectProduct2;
		@ChoiceListType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id36:2:j_id39\"]/select")
		public WebElement selectProduct2555;
		@TextType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id36:2:j_id42\"]")
		public WebElement amount666;
		@TextType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id36:2:j_id44\"]/textarea")
		public WebElement notes4444;
		@TextType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id36:1:j_id44\"]")
		public WebElement notes22222;
		@TextType()
		@FindBy(name = "j_id0:j_id1:j_id2:j_id36:1:j_id43")
		public WebElement amount222222;
		@TextType()
		@FindBy(name = "j_id0:j_id1:j_id2:j_id36:1:j_id45")
		public WebElement notes222222222222;
		@BooleanType()
		@VisualforceBy(componentXPath = "apex:inputCheckbox[@value = \"{!Check}\"]")
		public WebElement checkBox;
		@BooleanType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id36:1:j_id37\"]")
		public WebElement checkBox1;
		@BooleanType()
		@FindBy(xpath = "//input[@name=\"j_id0:j_id1:j_id2:j_id36:1:j_id38\"]")
		public WebElement checkBox111;
		@BooleanType()
		@VisualforceBy(componentXPath = "apex:inputCheckbox[@value = \"{!Check}\"]")
		public WebElement checkBox2222;
		@BooleanType()
		@FindBy(name = "j_id0:j_id1:j_id2:j_id36:2:j_id38")
		public WebElement checkBox6666;
		@ChoiceListType()
		@VisualforceBy(componentXPath = "apex:selectList[@value = \"{!dummyId}\"]")
		public WebElement selectProduct11;
		@TextType()
		@FindBy(xpath = "//input[@name=\"j_id0:j_id1:j_id2:j_id36:0:j_id43\"]")
		public WebElement amount11;
		@TextType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id36:0:j_id44\"]/textarea")
		public WebElement notes3;
		@ChoiceListType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id36:1:j_id39\"]/select")
		public WebElement selectProduct112;
		@TextType()
		@FindBy(xpath = "//input[@name=\"j_id0:j_id1:j_id2:j_id36:1:j_id43\"]")
		public WebElement amount121;
		@TextType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id36:1:j_id44\"]/textarea")
		public WebElement notes12;
		@TextType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:j_id36:2:j_id44\"]/textarea")
		public WebElement notes13;
		@BooleanType()
		@FindBy(xpath = "//input[@name=\"j_id0:j_id1:j_id2:j_id36:0:j_id38\"]")
		public WebElement checkBox2;
	}
	@VisualforceBy(componentXPath = "apex:inputField[@value = \"{!Opportunity.Name}\"]")
	@SalesforceField(name = "Name", object = "Opportunity")
	public WebElement opportunityName1;
	@LinkType()
	@FindBy(xpath = "//span//a")
	public WebElement closeDate1;
	
}
