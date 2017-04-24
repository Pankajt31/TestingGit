package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="Marketing12"                                
     , summary=""
     , relativeUrl=""
     , connection="Bank_RetailDepartment"
     )             
public class Marketing12 {

	@LinkType()
	@FindBy(linkText = "Admin1 Provar")
	public WebElement admin1Provar;
	@ButtonType()
	@FindByLabel(label = "Search")
	public WebElement search;
	@ButtonType()
	@FindByLabel(label = "Search Again")
	public WebElement searchAgain;
			
}
