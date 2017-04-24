package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="Accounts"                                
     , summary=""
     , relativeUrl=""
     , connection="Bank_RetailDepartment"
     )             
public class Accounts {

	@FindBy(id = "acc2")
	@TextType()
	public WebElement Name;
	@LinkType()
	@FindBy(css = "a.zen-mls.zen-imgExt")
	public WebElement StopFollow;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"AllTab_Tab\"]/a")
	public WebElement plustab;
			
}
