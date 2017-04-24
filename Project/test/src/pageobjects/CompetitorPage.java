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
public class CompetitorPage {

	@TextType()
	@FindBy(id = "CompetitorName")
	public WebElement CompetitorName;
	@TextType()
	@FindBy(id = "Strengths")
	public WebElement Strengths;
	@TextType()
	@FindBy(id = "Weaknesses")
	public WebElement Weaknesses;
	@ButtonType()
	@FindBy(name = "save")
	public WebElement Save;
	@ButtonType()
	@FindByLabel(label = "Cancel")
	public WebElement Cancel;
			
}
