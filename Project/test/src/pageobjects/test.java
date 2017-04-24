package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="test"                                
     , summary=""
     , relativeUrl=""
     , connection="Bank_RetailDepartment"
     )             
public class test {

	@LinkType()
	@FindBy(xpath = "//div[contains(@class, \"srg\")]/div[1]/div/h3/a")
	public WebElement homeTestAutomationForSalesforceProvar;
			
}
