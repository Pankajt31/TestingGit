package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="SFLookUp"                                
     , summary=""
     , relativeUrl=""
     , connection="Bank_RetailDepartment"
     )             
public class SFLookUp {

	@FindBy(xpath = "//*[@id='new']/div/div[3]/div/div[2]/table/tbody/tr[2]/td")
	@TextType()
	public WebElement AccountError;
			
}
