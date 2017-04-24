package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title=""                                
     , summary=""
     , relativeUrl=""
     , connection="FaceBook"
     )             
public class LoginFB {

	@TextType()
	@FindBy(xpath = "//*[@id=\"email\"]")
	public WebElement emailOrPhone;
	@TextType()
	@FindBy(name = "pass")
	public WebElement password;
	@ButtonType()
	@FindBy(xpath = "//*[@id=\"u_0_n\"]")
	public WebElement logIn;
			
}
