package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="UAT_EmbeddedVFTable"                                
               , summary=""
               , page="UAT_EmbeddedVFTable"
               , namespacePrefix=""
               , object="Contact"
               , connection="Bank_RetailDepartment"
     )             
public class UAT_EmbeddedVFTable1 {

	@PageTable(row = Table.class)
	@VisualforceBy(componentXPath = "apex:pageblockTable[@id='pbd']")
	public List<Table> table;

	@PageRow(byColumn = true)
	public static class Table {

		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.lastname}\"]")
		public WebElement lastName;
		@LinkType()
		@VisualforceBy(componentXPath = "apex:commandLink[@value='Delete']")
		public WebElement deleteLink;
		@LinkType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.email}\"]")
		public WebElement email;
		@LinkType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:pbd:0:j_id15\"]/a")
		public WebElement pDFDownload;
	}

	@PageTable(row = PDFtable.class)
	@VisualforceBy(componentXPath = "apex:pageblockTable[@id='pbd']")
	public List<PDFtable> PDFtable;

	@PageRow(byColumn = true)
	public static class PDFtable {

		@LinkType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id2:pbd:0:j_id15\"]/a")
		public WebElement pDFDownload;
		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.mobilephone}\"]")
		public WebElement mobile;
	}

	@PageTable(row = PDFtable67.class)
	@VisualforceBy(componentXPath = "apex:pageblockTable[@id='pbd']")
	public List<PDFtable67> PDFtable67;

	@PageRow(byColumn = true)
	public static class PDFtable67 {

		@ButtonType()
		@VisualforceBy(componentXPath = "apex:commandButton[@action='{!delcontact}']")
		public WebElement deleteButton;
	}

	@PageTable(row = PDFtable88.class)
	@VisualforceBy(componentXPath = "apex:pageblockTable[@id='pbd']")
	public List<PDFtable88> PDFtable88;

	@PageRow(byColumn = true)
	public static class PDFtable88 {

		@LinkType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.email}\"]")
		public WebElement email;
	}
	
}
