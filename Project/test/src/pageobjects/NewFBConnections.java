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
public class NewFBConnections {

	@TextType()
	@FindBy(name = "firstname")
	public WebElement FirstName;
	@TextType()
	@FindBy(xpath = "//*[@id=\"u_0_3\"]")
	public WebElement LastName;
	@TextType()
	@FindBy(css = "#u_0_5")
	public WebElement emailaddress;
	@TextType()
	@FindBy(name = "reg_email__")
	public WebElement re_enterEmail;
	@TextType()
	@FindBy(xpath = "//*[@id=\"u_0_a\"]")
	public WebElement Password;
	@TextType()
	@FindBy(id = "month")
	public WebElement month;
	@ChoiceListType(values = { @ChoiceListValue(value = "0", title = "Day"), @ChoiceListValue(value = "1"), @ChoiceListValue(value = "2"), @ChoiceListValue(value = "3"), @ChoiceListValue(value = "4"), @ChoiceListValue(value = "5"), @ChoiceListValue(value = "6"), @ChoiceListValue(value = "7"), @ChoiceListValue(value = "8"), @ChoiceListValue(value = "9"), @ChoiceListValue(value = "10"), @ChoiceListValue(value = "11"), @ChoiceListValue(value = "12"), @ChoiceListValue(value = "13"), @ChoiceListValue(value = "14"), @ChoiceListValue(value = "15"), @ChoiceListValue(value = "16"), @ChoiceListValue(value = "17"), @ChoiceListValue(value = "18"), @ChoiceListValue(value = "19"), @ChoiceListValue(value = "20"), @ChoiceListValue(value = "21"), @ChoiceListValue(value = "22"), @ChoiceListValue(value = "23"), @ChoiceListValue(value = "24"), @ChoiceListValue(value = "25"), @ChoiceListValue(value = "26"), @ChoiceListValue(value = "27"), @ChoiceListValue(value = "28"), @ChoiceListValue(value = "29"), @ChoiceListValue(value = "30"), @ChoiceListValue(value = "31") })
	@FindBy(id = "day")
	public WebElement date;
	@TextType()
	@FindBy(id = "year")
	public WebElement Year;
	@BooleanType()
	@FindByLabel(label = "Male")
	public WebElement male;
	@ButtonType()
	@FindBy(css = "#u_0_i")
	public WebElement signUp;
			
}
