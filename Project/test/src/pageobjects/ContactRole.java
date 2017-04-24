package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="ContactRole"                                
     , summary=""
     , relativeUrl=""
     , connection="Bank_RetailDepartment"
     )             
public class ContactRole {

	@BooleanType()
	@FindBy(id = "primary0")
	public WebElement Primary;
	@LinkType()
	@FindBy(id = "contact0_lkwgt")
	public WebElement Lookoup_contactRole;
	@ChoiceListType(values = {
			@ChoiceListValue(value = "7", title = "Business User"),
			@ChoiceListValue(value = "2", title = "Decision Maker"),
			@ChoiceListValue(value = "4", title = "Economic Buyer"),
			@ChoiceListValue(value = "9", title = "Economic Decision Maker"),
			@ChoiceListValue(value = "6", title = "Evaluator"),
			@ChoiceListValue(value = "8", title = "Executive Sponsor"),
			@ChoiceListValue(value = "1", title = "Influencer"),
			@ChoiceListValue(value = "5", title = "Technical Buyer"),
			@ChoiceListValue(value = "3", title = "Other") })
	@FindBy(id = "role0")
	public WebElement Role;
	@ButtonType()
	@FindByLabel(label = " Save ")
	public WebElement save;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"contact0_lkwgt\"]")
	public WebElement Lookoup_contactRole1;
			
}
