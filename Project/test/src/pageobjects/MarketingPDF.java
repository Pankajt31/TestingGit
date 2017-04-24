package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="MarketingPDF"                                
     , summary=""
     , relativeUrl=""
     , connection="Bank_RetailDepartment"
     )             
public class MarketingPDF {

	@FormattedContentType(mimetype = "text/plain")
	@FindBy(css = "embed")
	public WebElement PDFtest;
			
}
