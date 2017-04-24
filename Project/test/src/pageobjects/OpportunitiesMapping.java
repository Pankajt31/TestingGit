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
public class OpportunitiesMapping {

	@TextType()
	@FindByLabel(label = "*View:")
	public WebElement view;
	@ButtonType()
	@FindByLabel(label = " Go! ")
	public WebElement go;
	@ChoiceListType(values = {
			@ChoiceListValue(value = "2", title = "Recently Created"), @ChoiceListValue(value = "1", title = "Recently Modified"), @ChoiceListValue(value = "3", title = "Recently Viewed") })
	@FindBy(id = "hotlist_mode")
	public WebElement drop_down;
			
}
