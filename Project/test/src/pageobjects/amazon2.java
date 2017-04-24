package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="amazon2"                                
     , summary=""
     , relativeUrl=""
     , connection="Amazon"
     )             
public class amazon2 {

	@TextType()
	@FindBy(id = "twotabsearchtextbox")
	public WebElement Search_text;
	@ButtonType()
	@FindByLabel(label = "Go")
	public WebElement go;
	@LinkType()
	@FindBy(linkText = "Dell MS111 Wired Optical Mouse")
	public WebElement dellMS111WiredOpticalMouse;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"result_0\"]/div/div/div/div[1]/div/div/a")
	public WebElement mouse_imAGE;
	@TextType()
	@FindBy(id = "landingImage")
	public WebElement IMAGE1;
	@LinkType()
	@FindBy(linkText = "Q: my mouse is not working, please tell me where i give for Warranty only one month used.")
	public WebElement qMyMouseIsNotWorkingPleaseTellMeWhereIGiveForWarrantyOnlyOneMonthUsed;
			
}
