package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="Marketing1"                                
     , summary=""
     , relativeUrl=""
     , connection="Bank_RetailDepartment"
     )             
public class Marketing1 {

	@LinkType()
	@FindBy(xpath = "//*[@id=\"Case_Tab\"]/a")
	public WebElement cases;
	@LinkType()
	@FindBy(linkText = "Accounts")
	public WebElement accounts1;
			
}
