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
public class UATMapping {

	@TextType()
	@FindByLabel(label = "*Subject")
	public WebElement subject;
	@ChoiceListType(values = {
			@ChoiceListValue(value = "User didn't attend training"),
			@ChoiceListValue(value = "Complex functionality"),
			@ChoiceListValue(value = "Existing problem"),
			@ChoiceListValue(value = "Instructions not clear"),
			@ChoiceListValue(value = "New problem") })
	@FindByLabel(label = "Case Reason")
	public WebElement caseReason;
	@TextType()
	@FindBy(id = "tsk6_89667b1a532ae95e8160a3660624b81714b068ec232z96840c5b332779dc")
	public WebElement desc;
			
}
