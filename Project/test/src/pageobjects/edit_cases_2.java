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
public class edit_cases_2 {

	@ChoiceListType(values = {
			@ChoiceListValue(value = "2", title = "On Hold"),
			@ChoiceListValue(value = "4", title = "Escalated"),
			@ChoiceListValue(value = "1", title = "New") })
	@FindBy(xpath = "//*[@id=\"status\"]")
	public WebElement Status;
	@ButtonType()
	@FindByLabel(label = " Save ")
	public WebElement save;
			
}
