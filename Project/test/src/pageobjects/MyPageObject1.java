package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="DF13"
     )             
public class MyPageObject1 {

	@LinkType()
	@FindBy(linkText = "Back to Console Application")
	public WebElement backToConsoleApplication;
			
}
