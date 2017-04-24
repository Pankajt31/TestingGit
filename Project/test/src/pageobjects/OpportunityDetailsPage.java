package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title=""                                
     , summary=""
     , relativeUrl=""
     , connection="Bank_RetailDepartment"
     )             
public class OpportunityDetailsPage {

	@TextType()
	@FindBy(id = "img_01B2000000V4LRR")
	public WebElement arrowIcon;
			
}
