package pagecontrols;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.provar.core.testapi.annotations.PageControl;
import com.provar.core.testapi.annotations.PageOperation;

@PageControl( title="Ck Editor"                                
     , summary=""
     , remarks=""
     )             
public class CkEditor {
	
	private WebDriver webDriver;
	private WebElement webElement;
	
	public CkEditor(WebDriver webDriver, WebElement webElement){
		this.webDriver = webDriver;
		this.webElement = webElement;
	}
	
	@PageOperation(title="Set", apiCallTitleExpression="Set the {locatorDescr} to {value}")
	public void set(String value) {
		
		WebElement body = webElement;
		if (!"BODY".equalsIgnoreCase(webElement.getTagName())) {
			WebElement iframe = webElement.findElement(By.xpath(".//iframe"));
			webDriver.switchTo().frame(iframe);
			body = webDriver.findElement(By.tagName("body"));
		}

		String clearSequence = Keys.chord(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END)) + Keys.BACK_SPACE;
		body.sendKeys(clearSequence + value);
	}

}
