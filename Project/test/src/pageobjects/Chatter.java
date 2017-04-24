package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="Chatter"                                
     , summary=""
     , relativeUrl=""
     , connection="Bank_RetailDepartment"
     )             
public class Chatter {

	@LinkType()
	@FindBy(xpath = "//*[@id=\"Chatter_Tab\"]/a")
	public WebElement chatter;
			
}
