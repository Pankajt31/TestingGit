package pageobjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="twitter"                                
     , summary=""
     , relativeUrl=""
     , connection="Twitter"
     )             
public class twitter {

	WebDriver driver;
	
	public twitter(WebDriver driver){
	this.driver = driver;
	}

	@LinkType()
	@FindBy(linkText = "Log in")
	public WebElement logIn;
	@ButtonType()
	@FindBy(xpath = "//*[@id=\"global-new-tweet-button\"]")
	public WebElement tweet;
	@TextType()
	@FindBy(xpath = "//div[@id='tweet-box-global']/div")
	public WebElement composetweet1;
	@ButtonType()
	@FindBy(xpath = "(//div[@class='TweetBoxToolbar-tweetButton tweet-button']//button[contains(@class,'primary-btn')])[2]")
	public WebElement tweetReplySendMessage;
	
	public void tweet(String content){
//		composetweet1.sendKeys(Keys.chord("a"));
		Actions action = new Actions(driver);
		action.moveToElement(composetweet1).click().sendKeys(content).build().perform();
		
	
	}
			
}
