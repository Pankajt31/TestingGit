package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagecontrols.CkEditor;
import com.provar.core.testapi.annotations.*;

@Page(connection = "Bank_RetailDepartment")
public class ChatterPage {

	@FindBy(xpath = "//div[@class='cke_inner cke_reset']")
	public CkEditor ckEditor;

	@LinkType()
	@FindBy(xpath = "//*[@id=\"Chatter_Tab\"]/a")
	public WebElement chatter;

	@LinkType()
	@FindBy(id = "publisherAttachTextPost")
	public WebElement post;

	@ButtonType()
	@FindByLabel(label = "Share")
	public WebElement share;

	@FindBy(xpath = "//div[@class='feeditemcontent cxfeeditemcontent']")
	@PageTable(firstRowContainsHeaders = false, row = feeditemcontent.class)
	public List<feeditemcontent> feeditemcontent;

	@PageRow()
	public static class feeditemcontent {
		@TextType()
		@FindBy(xpath = ".//div[@class='preamblecontainer displayblock']")
		public WebElement ChatOwner;

		@TextType()
		@FindBy(xpath = ".//div[@class='cxfeeditemtextadditional']")
		public WebElement Chat;

		@LinkType()
		@FindBy(xpath = ".//a[contains(@title,'Comment')]")
		public WebElement ChatComment;

		@LinkType()
		@FindBy(xpath = ".//a[contains(@onclick,'like')and not(contains(@style,'none'))]")
		public WebElement ChatLike;

		@LinkType()
		@FindBy(xpath = ".//a[contains(@onclick,'Share')]")
		public WebElement ChatShare;

		@LinkType()
		@FindBy(xpath = ".//span[@class='cxallfeedactions']//a[contains(@class,'feeditemActionMenuButton')]")
		public WebElement ChatActiondropdown;

		@LinkType()
		@FindBy(xpath = ".//span[@class='cxallfeedactions']//a[contains(@title,'Edit')]")
		public WebElement ChatActiondropdownEdit;

		@LinkType()
		@FindBy(xpath = ".//span[@class='cxallfeedactions']//a[contains(@title,'Bookmark')]")
		public WebElement ChatActiondropdownBookmark;

		@LinkType()
		@FindBy(xpath = ".//span[@class='cxallfeedactions']//a[contains(@title,'Delete')]")
		public WebElement ChatActiondropdownDelete;

		@LinkType()
		@FindBy(xpath = ".//span[@class='cxallfeedactions']//a[contains(@title,'Add')]")
		public WebElement ChatActiondropdownAdd;

		@TextType()
		@FindBy(xpath = ".//textarea[contains(@class,'cxnewcommenttext')]")
		public WebElement ChatCommentSection;

		@ButtonType()
		@FindBy(xpath = ".//input[contains(@class,'cxnewcommentaction')]")
		public WebElement ChatCommentbutton;

		@TextType()
		@FindBy(xpath = ".//div[@class='topicInput']//textarea")
		public WebElement AddTopic;

		@ButtonType()
		@FindBy(xpath = ".//div[@class='topicInput']/..//input")
		public WebElement AddTopicDone;

		@TextType()
		@FindBy(xpath = ".//a[contains(@href,'topic')]")
		public WebElement Topic;

		@TextType()
		@FindBy(xpath = ".//span[@class='contentTitleLink']")
		public WebElement UploadedFileTitle;

		@LinkType()
		@FindBy(xpath = ".//td[contains(@class,'moreFileActions')]/a[1]")
		public WebElement UploadedFileDownload;

		@LinkType()
		@FindBy(xpath = ".//td[contains(@class,'moreFileActions')]/a[2]")
		public WebElement UploadedFileMoreAction;

		@FindBy(xpath = ".//div[@class='cxcomments feeditemcomments']")
		@PageTable(firstRowContainsHeaders = false, row = feeditemcomment.class)
		public List<feeditemcomment> feeditemcomment;

	}

	@PageRow()
	public static class feeditemcomment {
		@TextType()
		@FindBy(xpath = ".//span[@class='feedcommenttext']//span")
		public WebElement ChatCommenttext;

	}

	@FindBy(xpath = "//div[contains(@class,'contentActionMenuItem')]//a[@class='contentActionLink']")
	@PageTable(firstRowContainsHeaders = false, row = FileMoreAction.class)
	public List<FileMoreAction> FileMoreAction;

	@PageRow()
	public static class FileMoreAction {
		@LinkType()
		@FindBy(xpath = ".")
		public WebElement Interaction;

	}

	@ButtonType()
	@FindBy(name = "quickActionSubmitButton")
	public WebElement save;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@id,'Rechat')]//input[contains(@title,'Share')]")
	public WebElement shareOnShareBox;

	@TextType()
	@FindBy(xpath = "//div[contains(@id,'Rechat')]//input[contains(@class,'cxcommentplaceholderaction')]")
	public WebElement ShareCommentInEditable;

	@TextType()
	@FindBy(xpath = "//div[contains(@id,'Rechat')]//textarea[contains(@class,'cxnewcommenttext')]")
	public WebElement ShareComment;

	@TextType()
	@FindBy(xpath = "//div[@class='rechatResponseMessage success']")
	public WebElement ShareSuccessMessage;

	@ButtonType()
	@FindByLabel(label = "Done")
	public WebElement done;

	@LinkType()
	@FindBy(id = "publisherAttachContentPost")
	public WebElement file;

	@LinkType()
	@FindBy(id = "chatterUploadFileAction")
	public WebElement uploadAFileFromYourComputer;

	@ButtonType(file = true)
	@FindBy(id = "chatterFile")
	public WebElement ChooseFile;
}
