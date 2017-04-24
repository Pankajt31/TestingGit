package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="vfEmbaded"                                
     , summary=""
     , relativeUrl=""
     , connection="Bank_RetailDepartment"
     )             
public class vfEmbaded {

	@ButtonType()
	@FindByLabel(label = "Search")
	public WebElement search;
			
}
