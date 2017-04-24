package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="VF"                                
     , summary=""
     , relativeUrl=""
     , connection="Bank_RetailDepartment"
     )             
public class VF {

	@TextType()
	@FindByLabel(label = "Subject")
	public WebElement subject;
	@FormattedContentType(mimetype = "text/plain")
	@FindBy(name = "plugin")
	public WebElement PDFAssert;
	@FormattedContentType(mimetype = "text/plain")
	@FindBy(name = "plugin")
	public WebElement PDFAssert1;
	@FormattedContentType(mimetype = "text/plain")
	@FindBy(xpath = "//embed")
	public WebElement PDFAssert2;
			
}
