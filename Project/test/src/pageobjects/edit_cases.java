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
public class edit_cases {

	@ButtonType()
	@FindByLabel(label = " Save ")
	public WebElement save;
	@ChoiceListType(values = {
			@ChoiceListValue(value = "2", title = "On Hold"),
			@ChoiceListValue(value = "4", title = "Escalated"),
			@ChoiceListValue(value = "1", title = "New") })
	@FindByLabel(label = "*New Status")
	public WebElement newStatus;
	@ChoiceListType(values = {
			@ChoiceListValue(value = "2", title = "On Hold"),
			@ChoiceListValue(value = "4", title = "Escalated"),
			@ChoiceListValue(value = "1", title = "New") })
	@FindByLabel(label = "*New Status")
	public WebElement newStatus1;
	@ChoiceListType(values = {
			@ChoiceListValue(value = "2", title = "On Hold"),
			@ChoiceListValue(value = "4", title = "Escalated"),
			@ChoiceListValue(value = "1", title = "New") })
	@FindBy(xpath = "//*[@id=\"status\"]")
	public WebElement Status;
	@ChoiceListType(values = {
			@ChoiceListValue(value = "2", title = "On Hold"),
			@ChoiceListValue(value = "4", title = "Escalated"),
			@ChoiceListValue(value = "1", title = "New") })
	@FindByLabel(label = "*New Status")
	public WebElement newStatus2;
	@ButtonType()
	@FindByLabel(label = " Save ")
	public WebElement save1;
			
}
