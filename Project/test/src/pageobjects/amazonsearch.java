package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title=""                                
     , summary=""
     , relativeUrl=""
     , connection="Amazon"
     )             
public class amazonsearch {

	@FindBy(id = "twotabsearchtextboxs")
	@TextType()
	public WebElement search;
	@ButtonType()
	@FindByLabel(label = "Go")
	public WebElement go;
	@LinkType()
	@FindBy(css = "#result_0 div.a-section.a-spacing-none.a-inline-block.s-position-relative a.a-link-normal.a-text-normal")
	public WebElement ApexBook;
	@TextType()
	@FindByLabel(label = "*Subject")
	public WebElement subject;
	@ButtonType()
	@FindBy(xpath = "//*[@id=\"add-to-cart-button\"]")
	public WebElement addToCart;
	@LinkType()
	@FindBy(linkText = "\n    Edit your Cart\n  ")
	public WebElement editYourCart;
			
}
