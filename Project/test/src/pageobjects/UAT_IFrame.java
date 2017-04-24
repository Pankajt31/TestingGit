package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@SalesforcePage( title=""                                
               , summary=""
               , page="UAT_IFrame"
               , namespacePrefix=""
               , object="Account"
               , connection="Bank_RetailDepartment"
     )             
public class UAT_IFrame {

	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!search}']")
	public WebElement search;
	
}
