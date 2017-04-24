package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="FileDetailPage"                                
     , connection="Bank_RetailDepartment"
     )             
public class FileDetailPage {

	@TextType()
	@FindBy(id = "fileTitle")
	public WebElement FileTitle;
	@LinkType()
	@FindBy(css = "li.chatterFileUploadNewVersionAction a")
	public WebElement uploadNewVersion;
	@ButtonType(file=true)
	@FindBy(id = "chatterFile_upload")
	public WebElement FileUpload;
	@ButtonType()
	@FindBy(id = "uploadToMyFilesButton")
	public WebElement uploadNewVersionButton;
	@LinkType()
	@FindBy(id = "seeAllVersionsId")
	public WebElement showAllVersions;
	
	@FindBy(xpath = "//table[@class='overlayListTable versionOverlayList']//tr")
	@PageTable(firstRowContainsHeaders = false, row = versionOverlayList.class)
	public List<versionOverlayList> versionOverlayList;

	@PageRow()
	public static class versionOverlayList {
	}

	@ButtonType()
	@FindBy(css = "input[type='button'][value='Close']")
	public WebElement close;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'chatterFileDetailActionListPanel')]/ul/li[4]//a")
	public WebElement editDetails;
	@TextType()
	@FindBy(id = "fileName_edit")
	public WebElement nameEdit;
	@ButtonType()
	@FindBy(id = "editFilesButton")
	public WebElement save;
	@LinkType()
	@FindBy(linkText = "Delete")
	public WebElement delete;
	@LinkType()
	@FindBy(linkText = "Download txt")
	public WebElement downloadTxt;
			
}
