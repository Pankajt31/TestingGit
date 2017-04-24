package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title=""                                
               , summary=""
               , page="UAT_NewTab_Pdf_VF"
               , namespacePrefix=""
               , object=""
               , connection="Bank_RetailDepartment"
     )             
public class UAT_NewTab_Pdf_VF {

	@LinkType()
	@FindBy(linkText = "Click here for pdf in new tab")
	public WebElement clickHereForPdfInNewTab;
	
}
