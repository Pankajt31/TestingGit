package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title=""                                
               , summary=""
               , page="UAT_EmbeddedVF"
               , namespacePrefix=""
               , object="Account"
               , connection="Bank_RetailDepartment"
     )             
public class UAT_EmbeddedVF {

	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!search}']")
	public WebElement search;
	@PageTable(firstRowContainsHeaders = false, row = Acc.class)
	@VisualforceBy(componentXPath = "apex:pageblockTable[@value = \"{!acc}\"]")
	public List<Acc> Acc;

	@PageRow(byColumn = true)
	public static class Acc {

		@TextType()
		@VisualforceBy(componentXPath = "apex:column")
		public WebElement name;
		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.name}\"]")
		public WebElement Name1;
		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.name}\"]")
		public WebElement VFfieldColumn;
		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.name}\"]")
		public WebElement SearchAcc;
		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.name}\"]")
		public WebElement SearchAcc1;
		@TextType()
		@VisualforceBy(componentXPath = "apex:column")
		public WebElement Name;
		@TextType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id3:j_id4:4:j_id6\"]")
		public WebElement name13;
		@TextType()
		@VisualforceBy(componentXPath = "apex:column")
		public WebElement name1;
	}

	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!search}']")
	public WebElement search1;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!search}']")
	public WebElement search2;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!search}']")
	public WebElement search3;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!search}']")
	public WebElement search4;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!search}']")
	public WebElement search5;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!search}']")
	public WebElement search6;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!search}']")
	public WebElement search7;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!search}']")
	public WebElement search8;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!search}']")
	public WebElement search9;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!search}']")
	public WebElement search10;
	@PageTable(row = Acc1.class)
	@VisualforceBy(componentXPath = "apex:pageblockTable[@value = \"{!acc}\"]")
	public List<Acc1> Acc1;

	@PageRow(byColumn = true)
	public static class Acc1 {

		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.name}\"]")
		public WebElement Name;
	}

	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!search}']")
	public WebElement search11;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!search}']")
	public WebElement search12;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!search}']")
	public WebElement search13;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!search}']")
	public WebElement search14;
	@PageTable(row = Acc2.class)
	@VisualforceBy(componentXPath = "apex:pageblockTable[@value = \"{!acc}\"]")
	public List<Acc2> Acc2;

	@PageRow(byColumn = true)
	public static class Acc2 {

		@TextType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id3:j_id4:2:j_id5\"]")
		public WebElement test;
	}

	@PageTable(row = Acc21.class)
	@VisualforceBy(componentXPath = "apex:pageblockTable[@value = \"{!acc}\"]")
	public List<Acc21> Acc21;

	@PageRow(byColumn = true)
	public static class Acc21 {

		@TextType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id3:j_id4:0:j_id6\"]")
		public WebElement name;
		@TextType()
		@VisualforceBy(componentXPath = "apex:outputField[@value = \"{!a.name}\"]")
		public WebElement name1;
	}

	@PageTable(row = Acc211233.class)
	@VisualforceBy(componentXPath = "apex:pageblockTable[@value = \"{!acc}\"]")
	public List<Acc211233> Acc211233;

	@PageRow(byColumn = true)
	public static class Acc211233 {

		@TextType()
		@FindBy(xpath = "//*[@id=\"j_id0:j_id1:j_id3:j_id4:0:j_id6\"]")
		public WebElement Nametest;
	}
	
}
