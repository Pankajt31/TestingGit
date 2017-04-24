package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Chatterlightning"                                
     , summary=""
     , relativeUrl=""
     , connection="Bank_RetailDepartment"
     )             
public class Chatterlightning {

	@LinkType()
	@FindBy(xpath = "//div[contains(@class, \"cuf-feedItemActionTarget\")]/ul/li[1]/a")
	public WebElement edit;
			
}
