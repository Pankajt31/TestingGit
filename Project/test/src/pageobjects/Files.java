package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="Files"                                
     , summary=""
     , relativeUrl=""
     , connection="Bank_RetailDepartment"
     )             
public class Files {

	@LinkType()
	@FindBy(xpath = "//*[@id=\"File_Tab\"]/a")
	public WebElement files;
	@ButtonType()
	@FindByLabel(label = "Upload files")
	public WebElement uploadFiles;
			
}
